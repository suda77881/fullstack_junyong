-- q30
select EMPNO, ENAME, SAL, DEPTNO from emp where DEPTNO = 10
union
select EMPNO, ENAME, SAL, DEPTNO from emp where DEPTNO = 20 order by EMPNO;
-- q31
-- query block has incorrect number of result columns 열의 갯수가 다를때

-- q32
-- expression must have same datatype as corresponding expression 자료형이 다를때

-- q33
-- 출력 열개수와 자료형이 같으므로 동작가능!

-- q30
-- q30
-- q30
-- q30
-- q30
-- q30
-- q30












-- Ex1  emp 테이블에서 job 데이터 중복없이 조회 


select distinct job from emp;

-- Ex2
--조회할 테이블은 EMP 테이블이며 모든 열을 출력하시오.
--별칭 (AS)
--EMPNO → EMPLOYEE_NO,
--ENAME → EMPLOYEE_NAME,
--MGR → MANAGER,
--SAL → SALARY,
--COMM → COMMISSION,
--DEPTNO → DEPARTMENT_NO

select 
EMPNO EMPLOYEE_NO,
ENAME EMPLOYEE_NAME,
MGR MANAGER,
SAL SALARY,
COMM COMMISSION,
DEPTNO DEPARTMENT_NO 
from emp order by DEPTNO desc, ENAME;

--부서번호를 기준으로 내림차순으로 정렬하되,
--부서번호가 같다면 사원이름을 기준으로 오름차순 정렬하시오.
 
-- Ex3  
-- EMP테이블에서 대소비교연산자(<= , >= ) and 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회
 
select * from emp where sal between 2000 and 3000 ;
select * from emp where sal >= 2000 and sal <= 3000;

-- Ex4  
--  EMP테이블에서 BETWEEN AND 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회

select * from emp where sal between 2000 and 3000 ;
 
-- Ex5
-- EMP테이블에서 OR 를 이용하여 
-- JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회

select * from emp where JOB = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
 
-- Ex6
-- EMP테이블에서 IN 를 이용하여 
-- JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회
-- from → where  → select  

select * from emp where JOB in ('MANAGER','SALESMAN','CLERK');

-- Ex7. EMP테이블에서 ENAME이 S로 시작하는 행

select * from emp where ENAME like 'S%';
 
-- Ex8. EMP테이블에서 ENAME의 두번째 글자가 L인 행을 조회

select * from emp where ENAME like '_L%';
 
-- Ex9. EMP테이블에서 ENAME에 AN이 포함되어 있는 행을 조회

select * from emp where ENAME like '%A%' or ENAME like '%N%';
--select * from emp where ENAME like '%AM%';
