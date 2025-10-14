-- 조건에 맞는 데이터 조회 
-- #1. where       
-- #2. 비교연산자 : (같다) =, (다르다) != , <> , ^= 
-- #3. 논리연산자 : AND / BETWEEN     AND (범위지정) , OR / IN , NOT
-- #4. like      : 패턴검색
-- #5. null 처리  : NULL 여부확인
-- #6. 집합연산자 : union (중복제거하고 합집합) , union all (중복 포함하고 합집합) , minus(차집합), intersect(교집합)


-- #1. 전체데이터 조회
select * from emp;

-- #2. where 조건조회
select * from emp where empno  =7839;    -- 같다 =
select * from emp where empno !=7839;   -- 다르다 !=
select * from emp where empno <>7839;   -- 다르다 <>
select * from emp where empno ^=7839;   -- 다르다 ^=

select * from emp where ename='KING';

select * from emp where empno=7839 and ename='KING';    -- and 두가지다 조건이 맞아야함.
select * from emp where empno=7839 and ename='SCOTT';   -- x 결과물 미출력(조건해당없음)
select * from emp where empno=7839 or  ename='SCOTT';   -- or 또는 둘 중에 하나

select * from emp where sal*12 = 36000; 
select * from emp where sal >= 3000; 

select * from emp where ename >= 'S' ; -- S이상의 문자열으로 시작하는 이름
select * from emp where ename <= 'SOR' ; -- 우선순위? 123?

select * from emp where deptno>=20 and deptno<=40;  -- >= , <= 
select * from emp where deptno between 20 and 30;   -- between and는 이상과 이하

select * from emp where deptno=10 or deptno=30;
select * from emp where deptno in(10,30);

select * from emp where ename = 'KING';     -- 이름이 알때
select * from emp where ename LIKE 'A%';    -- 이름이 A로 시작하는
select * from emp where ename LIKE '%A%';   -- 이름이 A가 중간에 있는
select * from emp where ename LIKE '%G';    -- 이름이 G로 끝나는
select * from emp where ename LIKE '_I%';   -- _(첫글자, 아무거나) 두번쨰 글자가 I

select * from emp where comm = null;        -- X null (데이터 없어 - 상태)
select * from emp where comm is null;       -- 커미션이 존재하지 않는
select * from emp where comm is not null;   -- 커미션이 존재하는 


--Q1 
select * from emp;
--Q2 부서번호가 30인데이터
select * from emp where DEPTNO = 30;
--Q3
select * from emp where DEPTNO = 30 and JOB = 'SALESMAN';
--Q4
select * from emp where DEPTNO = 30 or JOB = 'CLERK';

--Q5. sal 12를 곱한값이 36000인행을 조회
select * from emp where SAL* 12 = 36000;

select * from emp;

-- SQL처리순서 ( from → where → select )
--select  *                3. * (모든 컬럼값)
--from   emp               1. emp 테이블 읽어오기
--where sal * 12 = 36000  2. 각행에대해( 한 명 자료묶음 ) sal*12=36000 조건평가


--Q6. sal  3000이상인 행
select * from emp where SAL >= 3000;

--Q7 ENAME이 F이상인 열
select * from emp where ENAME >= 'F';   -- 틀림

--Q8
select * from emp where ENAME LIKE 'F%' or ENAME LIKE '_O%' or ENAME LIKE '__R%' or ENAME LIKE '___Z%'; -- 틀림
select * from emp where ENAME <= 'FORZ';

--Q9
select * from emp where SAL != 3000;

--Q10
select * from emp where SAL <> 3000;

--Q11
select * from emp where SAL ^= 3000;

--Q12 
select * from emp where NOT SAL = 3000; -- 틀림

--Q13. emp테이블에서 or 를 이용하여
select * from emp where JOB = 'MANAGER' OR JOB = 'SALESMAN' OR JOB = 'CLERK';

--Q14. emp테이블에서 in 를 이용하여
--JOB 열이 'MANAGER', 'SALESMAN', 'CLERK' 중 하나라도 포함되는 행을 조회
-- FROM → where → select
select * from emp where JOB IN ('MANAGER', 'SALESMAN', 'CLERK');

--Q15. EMP 테이블에서 등가연산자 (!=
select * from emp 
where JOB != 'MANAGER' 
AND JOB <> 'SALESMAN' 
AND JOB ^= 'CLERK';

--Q16
select * from emp where JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK');

--Q17
select * from emp where SAL >= 2000 and SAL <= 3000;

--Q18
select * from emp where SAL BETWEEN 2000 AND 3000;

--Q19
select * from emp where SAL NOT BETWEEN 2000 AND 3000 ; 

--Q20
select * from emp where ENAME LIKE 'S%';

--Q21
select * from emp where ENAME LIKE '_L%'; -- 대소문자 구분

--Q22
select * from emp where ENAME LIKE '%AM%';

--Q23
select * from emp where ENAME NOT LIKE '%AM%'; -- 틀림

--Q24
select ENAME, SAL, SAL * 12 + COMM AS ANNSAL, COMM from emp; 

--select e.ENAME 이름, e.SAL 급여, SAL * 12 + COMM AS ANNSAL, COMM from emp e; 
-- 별명 사용가능 

--select      *
--from
--where
--order by desc, asc;

--Q25
--비어있는 상태
select * from emp where comm = null;
--Q26
select * from emp where COMM is null;
--Q27. emp 테이블에서 mgr열이 null 이 아닌행 
select * from emp where MGR is not null;
--Q28
select * from emp where sal > null and comm is null;
--                            x  (false) and true;        
--사용은 가능하나 sal > null은 비어있는 상태이기 때문에 비교불가(값이안나옴)
--모든 범위를 출력, EMP에서, SAL이 NULL 보다 높은것 그리고, COMM 상태가 NULL인 것을 출력;

--Q29
select * from emp where sal > null or comm is null;
-- emp의 모든 범위에서 SAL > NULL 또는 COMM 상태가 NULL; 인것을 출력
--                                x (false) or true;   
select distinct DEPTNO from emp;
