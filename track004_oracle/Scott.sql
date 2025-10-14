
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
select EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO from emp order by SAL asc;

-- Q13.
select EMPNO, ENAME, JOB< MGR, HIREDATE, SAL, COMM, DEPTNO from emp order by SAL desc;