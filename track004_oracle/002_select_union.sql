--EX001
select * from emp where ENAME LIKE '%S';

--EX 002
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO from emp where DEPTNO = 30 AND JOB = 'SALESMAN';

--EX 003
select EMPNO, ENAME, JOB, SAL, DEPTNO 
from emp 
where DEPTNO in (20, 30) and SAL > 2000;

--EX 003 (UNION) 집합연산자 (Union) 를 사용하지 않는 방식
--EMP테이블에서 in 연산자를 이용하여 DEPTNO 가 20 또는 30인 
--사원의 SAL이 2000초과인
--사원을 조회하시오

--EX 003-1

select EMPNO, ENAME, JOB, SAL, DEPTNO  
from emp 
where DEPTNO in (20) and SAL > 2000
union
select EMPNO, ENAME, JOB, SAL, DEPTNO  
from emp 
where DEPTNO in (30) and SAL > 2000;

--EX 004 EMP테이블에서 NOT BETWEEN AND 연산자를 사용하지 않고 SAL이 2000이상 3000이하 값을 가진 데이터 아닌값을 조회 하시오.

Q1. 2000~3000 사이인값 표현 (2)
Q2. 2000~3000 사이가 아닌값 표현 NOT BETWEEN AND 사용 (1개)
Q3. 2000~3000 사이가 아닌값 표현 or 사용 (1개)

select * from emp where not SAL >= 2000 or not SAL <= 3000;
select * from emp where sal between 200 and 3000;
select * from emp where sal < 2000 or sal > 3000;
select * from emp where sal not betwwen 2000 and 3000;

--select * from emp where SAL not in (2000 && 3000);

--EX 005
select ENAME, EMPNO, SAL, DEPTNO 
from emp 
where ENAME Like '%E%' and DEPTNO = 30 and SAL not between 1000 and 2000;

select ENAME, EMPNO, SAL, DEPTNO 
from emp 
where ENAME Like '%E%' and DEPTNO = 30 and SAL < 1000
union
select ENAME, EMPNO, SAL, DEPTNO 
from emp 
where ENAME Like '%E%' and DEPTNO = 30 and SAL > 2000;

--EX 006 
select * from emp 
where COMM is NULL 
and MGR is not NULL 
and (JOB = 'MANAGER' 
or JOB = 'CLERK') 
and ENAME not like '_L%' order by JOB desc;

select * from emp 
where COMM is NULL 
and MGR is not NULL 
and JOB in ('MANAGER' , 'CLERK')
and ENAME not like '_L%';

select * from emp where ENAME not like '_L%';