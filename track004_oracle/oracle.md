ORACLE (SQL)

#1. 저장단위 
변수 < 배열 < 클래스 < 콜렉션프레임워크 > file > DB 
※ DB( mysql , oralce , mssql )

> java : jdbc → dbcp → orm (★mybatis , jpa(세세한코드를 다룰순없음))

#2. RDB (Relational Database)   ★
 -   관계형 데이터 베이스 
 -   테이블 관계
1. 엔티티(entity)     - 테이블  - 관리할 대상 (고객, 주문, 상품)
2. 속성(Attribute)    - 컬럼   - 대상의 특징 (주민번호, 이름, 주문번호)
3. 관계(Relationship) - 외래키 - 대상간의 연결    - 고객은 주문을 한다

#3. 데이터베이스 언어 ★ 

1. 정의어(DDL) - create(만들기) , alter(수정), drop(삭제)   ..... cad (암기법)
2. 조작어(DML) - insert(삽입) , select(조회), update(수정), delete(지우기)..... crud(암기법)
3. 제어어(DCL) - grant(권한부여) , revoke(권한회수)

4. select



<<사원>>
> desc emp;

SQL> desc emp;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 EMPNO                                     NOT NULL NUMBER(4)
 ENAME                                              VARCHAR2(10)
 JOB                                                VARCHAR2(9)
 MGR                                                NUMBER(4)
 HIREDATE                                           DATE
 SAL                                                NUMBER(7,2)
 COMM                                               NUMBER(7,2)
 DEPTNO                                             NUMBER(2)


<<부서>>
SQL > desc dept;         


 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 DEPTNO                                    NOT NULL NUMBER(2)
 DNAME                                              VARCHAR2(14)
 LOC                                                VARCHAR2(13)



> 부서는 많은 사원을 가질 수 있다.
관리대상 (table) : dept          emp
속성     (attribute) deptno     empno , deptno  ,,,
연결(Relationship) : 

#4. SELECFT

[실습]

1. 테이블 구조확인 : desc emp
2. 테이블 전체정보확인 : select * from emp;



1. c(insert)    , r(select)
2. 

-- 기타



-- #1. 테이블구조확인
desc emp;
desc dept;

show user;  -- 실행 ) 현재줄 선택하고 ctrl + enter
select table_name from user_tables; -- 사용할 수 있는 테이블 확인 

-- #2. 전체 테이블 조회
select * from emp;

-- #3. 열조회
select empno, ename from emp;
select ename, job   from emp;

-- #4. 중복제거 (distinct)
select distinct job from emp;
select all      job from emp;

-- #5. 연산 및 별칭
desc emp;

-- 3달치 급여
select ename "유저", sal as "월급" , sal+sal+sal  as "3달치 월급"   from emp;

-- #6. 정렬
select ename, sal from emp order by sal asc;   -- asc는 오름차순
select ename, sal from emp order by sal desc;   -- desc는 내림차순



-- ## step 연습문제
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle002_select_basic#15


-- Q1. emp 테이블구성
desc emp;

-- Q2. 
desc dept;

-- Q3. 
desc SALGRADE;

-- Q4.
select * from emp;

-- Q5. 
select EMPNO, ENAME, DEPTNO from emp;

-- Q6.
select distinct DEPTNO from emp;

-- Q7.
select distinct JOB, DEPTNO from emp;

-- Q8.  emp 테이블에서 job, deptno 열중복제거하지 말고
select ALL JOB, DEPTNO from emp;    -- all 생략해도 같은?
select     job, deptno from emp;

-- Q9. emp 테이블에서 연산식 연간총수입
select ENAME, SAL, SAL*12+COMM, COMM from emp;

-- Q10. emp 테이블에서 열+열 더하기 연산식
select ENAME, SAL, (SAL*12)+COMM,COMM from emp;
select ENAME, SAL, SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+SAL+COMM,COMM from emp;

-- Q11. emp 테이블에서 연간총수입으로 별칭 붙이기
select ENAME, SAL, (SAL*12)+COMM as "ANNSAL", COMM from emp;

-- Q12.
select * from emp order by SAL asc;
select * from emp order by SAL ; -- asc는 생략가능

-- Q13.
select * from emp order by SAL desc;

-- Q14. 
select * from emp order by DEPTNO asc, SAL desc;

-- ※ 테이블 emp
-- 사용가능한 테이블 확인
select table_name from user_tables;

-- emp 테이블삭제 (복구X)
drop table emp;
select table_name from user_tables;

-- emp 테이블 만들기 정의어(DDL) - CREATE, ALTER, DROP
CREATE TABLE emp (
  empno NUMBER(4),
  ename VARCHAR2(10),
  job VARCHAR2(9),
  mgr NUMBER(4),
  hiredate DATE,
  sal NUMBER(7,2),
  comm NUMBER(7,2),
  deptno NUMBER(2)
);
desc emp; -- 관리대상

-- emp 테이블 값넣기  2. 조작어 (DML)   - INSERT(삽입) , SELECT(조회), UPDATE(수정), DELETE(지우기) 
INSERT INTO emp VALUES (7839, 'KING', 'PRESIDENT', NULL, TO_DATE('1981-11-17','YYYY-MM-DD'), 5000, NULL, 10);
INSERT INTO emp VALUES (7698, 'BLAKE', 'MANAGER', 7839, TO_DATE('1981-05-01','YYYY-MM-DD'), 2850, NULL, 30);
INSERT INTO emp VALUES (7782, 'CLARK', 'MANAGER', 7839, TO_DATE('1981-06-09','YYYY-MM-DD'), 2450, NULL, 10);
INSERT INTO emp VALUES (7566, 'JONES', 'MANAGER', 7839, TO_DATE('1981-04-02','YYYY-MM-DD'), 2975, NULL, 20);
INSERT INTO emp VALUES (7902, 'FORD', 'ANALYST', 7566, TO_DATE('1981-12-03','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO emp VALUES (7369, 'SMITH', 'CLERK', 7902, TO_DATE('1980-12-17','YYYY-MM-DD'), 800, NULL, 20);
INSERT INTO emp VALUES (7788, 'SCOTT', 'ANALYST', 7566, TO_DATE('1987-07-13','YYYY-MM-DD'), 3000, NULL, 20);
INSERT INTO emp VALUES (7876, 'ADAMS', 'CLERK', 7788, TO_DATE('1987-07-13','YYYY-MM-DD'), 1100, NULL, 20);
INSERT INTO emp VALUES (7934, 'MILLER', 'CLERK', 7782, TO_DATE('1982-01-23','YYYY-MM-DD'), 1300, NULL, 10);
INSERT INTO emp VALUES (7654, 'MARTIN', 'SALESMAN', 7698, TO_DATE('1981-09-28','YYYY-MM-DD'), 1250, 1400, 30);
INSERT INTO emp VALUES (7499, 'ALLEN', 'SALESMAN', 7698, TO_DATE('1981-02-20','YYYY-MM-DD'), 1600, 300, 30);
INSERT INTO emp VALUES (7844, 'TURNER', 'SALESMAN', 7698, TO_DATE('1981-09-08','YYYY-MM-DD'), 1500, 0, 30);
INSERT INTO emp VALUES (7900, 'JAMES', 'CLERK', 7698, TO_DATE('1981-12-03','YYYY-MM-DD'), 950, NULL, 30);
INSERT INTO emp VALUES (7521, 'WARD', 'SALESMAN', 7698, TO_DATE('1981-02-22','YYYY-MM-DD'), 1250, 500, 30);

commit; -- 삽입[반영]

delete from emp;

-- ex 1 
select distinct JOB from emp;

-- ex 2
select * from emp;
select EMPNO AS EMPLOYEE_NO, ENAME AS EMPLOYEE_NAME, MGR AS MANAGER, SAL AS SALARY, COMM AS COMMISSION, DEPTNO AS DEPARTMENT_NO FROM AS EMP; -- AS 생략가능 영문은 "" 생략가능
select EMPNO EMPLOYEE_NO, ENAME EMPLOYEE_NAME, MGR MANAGER, SAL SALARY, COMM COMMISSION, DEPTNO DEPARTMENT_NO FROM EMP order by deptno desc, ename asc; -- asc 생략가능 순서정렬 우선순위 앞부터



-- 조건에 맞는 데이터 조회 
-- #1. where       
-- #2. 비교연산자 : (같다) =, (다르다) != , <> , ^= 
-- #3. 논리연산자 : AND / BETWEEN     AND (범위지정) , OR / IN , NOT
-- #4. like      : 패턴검색
-- #5. null 처리  : NULL 여부확인
-- #6. 집합연산자 : union (중복제거하고 합집합) , union all (중복 포함하고 합집합) , minus(차집합), intersect(교집합)
