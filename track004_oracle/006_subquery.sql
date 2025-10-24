-- join
-- emp( deptno ), dept (deptno) 한테이블처럼 사용하는 방법

SELECT  E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
FROM    EMP E, DEPT D
WHERE   E.DEPTNO = D.DEPTNO;

-- (1) JOIN ON sql-99 표준

SELECT  E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME
FROM    EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO);

-- (2) JOIN USING sql-99 표준

SELECT  EMPNO, ENAME, DEPTNO, DNAME
FROM    EMP E JOIN DEPT D using (deptno);

-- (3) NATURAL JOIN sql-99 표준

SELECT  EMPNO, ENAME, DEPTNO, DNAME
FROM    EMP E natural join DEPT D ;

-- (4) 
select * from dept;

select empno, ename, d.deptno, dname
from   emp e, dept d
where  e.deptno(+) = d.deptno   ;

-- (5) right outer join
select  empno, ename, d.deptno, dname
from    emp e right outer join dept d on (e.deptno (+) = d.deptno);


-- (6) left outer join
select  empno, ename, d.deptno, dname
from dept d left outer join emp e on (e.deptno (+) = d.deptno);

-- (7) full outer join
select  empno, ename, d.deptno, dname
from dept d full outer join emp e on (e.deptno (+) = d.deptno);


-- 서브쿼리 select 안에 select

-- #1. 단일행 서브쿼리 평균 급여보다 많이 받는 사원들
-- step1)
--select ename, sal
--from emp
--where sal > 2073평균급여
--order by sal desc;

-- step2)
select ename, sal
from emp
where sal > (select avg(sal) from emp)
order by sal desc;


-- #2. 다중행(IN) DEPTNO 가 10인 부서의 사원들 ENAME, SAL
--SELECT  ENAME, SAL
--FROM    EMP
--WHERE   JOB = DEPTNO가 10인 부서의 JOB (SELECT DEPNO =10 FROM EMP)
--ORDER BY SAL DESC;

SELECT  ENAME, SAL
FROM    EMP
WHERE   JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 10)
ORDER BY SAL DESC;

-- #3. 다중행 연산자
-- 1. in   "이 값이 목록에 있나요?"  DEPTNO IN (10, 20, 30)
-- 2. any , some  " [하나라도 만족하면] ok "  ■ 최소값 기준비교
--    컬럼 > any(서브쿼리) 최소값보다 크면 true
--    컬럼 > any(서브쿼리) 최대값보다 작으면 true


--          컬럼 > any( 1,2,3 )         | (1)   |(2)    |(3)        암기) 컬럼 > any(1) 최소값보다 크다
--          컬럼 < any( 1,2,3 )         | (1)   |(2)    |(3)

-- 3. all  "[모두 만족해야] ok"               ■ 최대값 모든선

--  컬럼 > all (서브쿼리) 최대값보다 크면 true 
--  컬럼 < all (서브쿼리) 최소값보다 작으면 true

--         컬럼 > all( 1,2,3 )          | (1)   |(2)    |(3)        
--         컬럼 < all ( 1,2,3 )         | (1)   |(2)    |(3)

-- 암기 ) 컬럼 > any 1          컬럼 > all 3

-- 4. exists "서브쿼리가 존재하면 ok"


create table atest            as  select 1  num  from dual
                        union all select 2       from dual
                        union all select 3       from dual
                        union all select 4       from dual
                        union all select 5       from dual
                        union all select 6       from dual;

select * from atest;

-- 2. 컬럼 > any 1   최소값보다 크다 , 최대값 작다 ,  컬럼 > all 3  최대값보다 크다 최소값 작다
-- 애니 1, 올 3 kia > any 1 kia > all 3
select num  from atest where  num < any(select num from atest  where num in(3,4,5)) order by num;   -- 5보다 작다 1 2 3 4
select num  from atest where  num > any(select num from atest  where num in(3,4,5)) order by num;   -- 3보다 크다 4 5 6
select num  from atest where  num < all(select num from atest  where num in(3,4,5)) order by num;   -- 3보다 작다 1 2
select num  from atest where  num > all(select num from atest  where num in(3,4,5)) order by num;   -- 5보다 크다 6

-- #4. 다중 열 서브쿼리
-- where        sal > any,  sal in any
 select ename , deptno, job
 from   emp
 where  (deptno, job) in ( select deptno, job from emp where sal > 2000 );

-- #5. 인라인뷰 (   from    )
select empno, ename, d.deptno, dname
from    ( select * from emp where deptno = 20 ) e, 
        ( select * from dept) d
where   e.deptno = d.deptno;

-- #6. WITH (단일 쿼리)

with
  e6 as ( select * from emp where deptno = 30 )
, d6 as ( select * from dept )
select empno, ename, d6.deptno, dname
from  e6 , d6
where e6.deptno = d6.deptno;

with 
 e6 as ( select * from emp where deptno = 30 )
select count(*) from e6;

-- #7. 스칼라 서브쿼리 짧은 행에서만
-- 데이터가 많은 경우 성능 저하 비선호
select     empno, ename, sal 
           ,( select grade from salgrade where  emp.sal between losal and hisal ) salgrade
           , deptno
           , (select loc from dept where emp.deptno = dept.deptno) location
from       emp; 




--Q001
--EMP 테이블에서 다음과 같이 출력하시오.
--사원이름이 JONES 인 사원의 급여를 출력하시오.




SELECT SAL
FROM EMP
WHERE ENAME = (SELECT ENAME FROM EMP WHERE ENAME = 'JONES') ;



--Q002
--EMP 테이블에서 다음과 같이 출력하시오.
--급여가 2975보다 높은 사원정보를 출력하시오.

SELECT *
FROM EMP
WHERE SAL IN (SELECT SAL FROM EMP WHERE SAL > 2975) 
ORDER BY JOB DESC;



--Q003
--EMP 테이블에서 다음과 같이 출력하시오.
--JONES의 급여보다
--높은급여를 받는 사원정보를 출력하시오.

SELECT *
FROM EMP
WHERE SAL > (SELECT SAL FROM EMP WHERE ENAME = 'JONES')  
ORDER BY JOB DESC;

--Q004
--EMP 테이블에서 다음과 같이 출력하시오.
--SCOTT보다 빨리 입사한 사원목록을 출력하시오.

SELECT *
FROM EMP
WHERE HIREDATE < (SELECT HIREDATE FROM EMP WHERE ENAME = 'SCOTT');

--Q005
--EMP 테이블에서 다음과 같이 출력하시오.
--20번부서에 속한 사원 중
--전체사원의 평균급여보다 높은 급여를받는 사원정보와 소속부서정보를 출력하시오.

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO, DNAME, LOC
FROM EMP E NATURAL JOIN DEPT D
WHERE DEPTNO = 20 AND SAL > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = 20);


SELECT EMPNO, ENAME, JOB, SAL, DEPTNO, DNAME, LOC
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
WHERE E.DEPTNO = 20
AND   SAL > (SELECT AVG(SAL) FROM EMP);
--EMP 테이블에서 다음과 같이 출력하시오.
--부서번호가 20이거나 30인 사원의 정보를 출력하시오.

SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE DEPTNO = 20 OR DEPTNO = 30);

SELECT *
FROM   EMP
WHERE  DEPTNO IN(20, 30);


--Q007
--EMP 테이블에서 다음과 같이 출력하시오.
--각 부서별 최고급여와 동일한 급여를 받는 사원정보를 출력하시오.


--SELECT *
--FROM EMP
--WHERE SAL = (부서별 최고급여);

SELECT *
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO) ;






--Q008
--EMP 테이블에서 다음과 같이 출력하시오.
--부서번호 별로 최대 급여를 출력하시오.
--7번문제가 잘풀렸는지 확인하시오.
-- select *
-- from emp
-- where sal in (select max(sal) from emp group by deptno);

select *
from emp
where sal in (select max (sal) from emp group by deptno);


select *
from emp
group by deptno;


--Q009
--EMP 테이블에서 다음과 같이 출력하시오.
--ANY 연산자를 이용하여 다음과같이 출력해보시오

select *
from emp
where sal = any (select max (sal) from emp group by deptno);

select *
from emp
where any 


select *
from emp
where sal = any (select max(sal) from emp group by deptno);

--Q010
--EMP 테이블에서 다음과 같이 출력하시오.
--ANY 연산자를 이용하여 다음과같이 출력해보시오

select *
from emp
where sal = some (select max (sal) from emp group by deptno);

select *
from emp
where sal = any (select max(sal) from emp group by deptno);


--Q0011
--EMP 테이블에서 다음과 같이 출력하시오.
--ANY를 이용하여 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원정보를 출력하시오.
-- 필드 > any 1   필드 > all 3  최소값 크다, 최대값 작다

select *
from   emp 
where sal < any ( select distnct sal from emp where deptno = 30 )
order by sal, empno ;


select *
from emp
where sal < any (select max(sal) from emp where deptno = 30 group by deptno)
order by sal, empno;

--Q012
--EMP 테이블에서 다음과 같이 출력하시오.
--부서번호가 30인 사원들의 급여를 출력하시오.

select sal
from emp
where deptno = 30;

select distinct sal
from emp
where deptno = 30;

--Q013
--EMP 테이블에서 다음과 같이 출력하시오.
--ANY를 이용하여 30번 부서 사원들의 최소 급여보다 많은은 급여를 받는 사원정보를 출력하시오.
-- 필드 > any 1   최소값 보다 크다 / 최대값보다 작다
-- [2850 , 1250, 1600, 1500], 950
select *
from emp
where sal > any ( select sal from emp where deptno = 30 ) ;



select *
from emp
where sal > any ( select min(sal) from emp where deptno = 30)
order by sal desc; 

--Q014
--EMP 테이블에서 다음과 같이 출력하시오.
--ALL를 이용하여 30번 부서 사원들의 최소 급여보다 더 적은 급여를 받는 사원정보를 출력하시오.
--  필드 > all 3 최대값 크다   ,   < 최소값 작다

select *
from   emp
where  sal < all (select min(sal) from emp where deptno = 30);

select *
from emp
where sal < all (select min(sal) from emp where deptno = 30);


-- ■ 암기 ) any1 all3
-- 필드 > any 1 최소값보다 크다,     < 최대값 작다
-- 필드 > all 3 최대값보다 작다,     < 최소값 작다



--Q015
--EMP 테이블에서 다음과 같이 출력하시오.
--ALL를 이용하여 30번 부서 사원들의 최대 급여보다 더 많은 급여를 받는 사원정보를 출력하시오.


select *
from emp
where sal > all (select max(sal) from emp where deptno = 30)
order by sal , ename;



-- ■ 암기 ) any1 all3
-- 필드 > any 1 최소값보다 크다,     < 최대값 작다
-- 필드 > all 3 최대값보다 작다,     < 최소값 작다


--Q016
--EMP 테이블에서 다음과 같이 출력하시오.
--EXISTS - 서브쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 TRUE, 아니면 FALSE 됨
--결과값이 모두 존재하기때문에 EMP 모든행이 출력됨.
-- in(), any(), all(), exists() 다중


select *
from emp
where exists (select deptno from emp where deptno = 10);

select *
from emp
where exists (select dname from dept where deptno=10);



select *
from emp;


--Q017
--EMP 테이블에서 모든 행을 선택하되, 다음 조건을 만족하는 경우에만 출력한다:
--DEPT 테이블에 DEPTNO = 50인 행이 하나라도 존재하는 경우

select *
from emp
where exists (select dname from dept where deptno = 50);


--Q018
--EMP 테이블에서 다음과 같이 출력하시오.
--다중열 서브쿼리를 이용하여 WHERE (DEPTNO, SAL) IN ( ... )
--부서별 최대급여를 받는 사원정보를 출력하시오.

select *
from emp
where (DEPTNO, SAL) IN (select deptno, MAX(sal) from emp group by deptno);

select *
from emp
where (deptno, sal) in (select deptno, max(sal) from emp group by deptno)
order by deptno desc;

--Q019
--인라인 뷰를 이용
--FROM 절에서 사용하는 인라인 뷰를 이용하여
--부서번호가 10인 사용자 정보와 부서정보를 가져와
--EMPNO, ENAME, DEPTNO, DNAME, LOC 를 출력하시오.

select EMPNO, ENAME, d.DEPTNO, DNAME, LOC
from   (select * from emp where deptno = 10) e
    , (select * from dept) d
where e.deptno = d.deptno;

select empno, ename, d.deptno, dname, loc
from   emp e join dept d on e.deptno = d.deptno
where e.deptno = 10;

select empno, ename, d.deptmo, dname, loc
from   emp e  natural join dept d
where deptno =10;

select e10.empno, e10.ename, e10.deptno, d.dname, d.loc
from (select * from emp where deptno = 10) e10, (select * from dept) d
where e10.deptno = d.deptno;


--Q020
--WITH 이용
--FROM 절에 명시하는 방식보다 몇십, 몇백줄의 규모가 되었을때 유용하게 사용됨.
--emp 테이블에서 부서번호가 10인 사원정보
--dept 테이블의 모든정보


select e.empno, e.ename, e.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = 10 and d.dname = 'ACCOUNTING';

with
    e6 as ( select * from emp where deptno = 10)
    ,d6 as ( select * from dept where dname = 'ACCOUNTING')
select empno, ename, e6.deptno, d6.dname, loc
from e6, d6
where e6.deptno = d6.deptno;

with
e as (select * from emp where deptno = 10)
d as (select * from dept)
select EMPNO, ENAME, d.DEPTNO, DNAME, LOC
from e, d
where e.deptno = d.deptno;





--Q0021
--열에 명시하는 스칼라서브쿼리이용
--EMP 테이블의 EMPNO, ENAME, JOB, SAL
--EMP 테이블의 SAL을 이용하여 SALGRADE에서 등급(GRADE)을 구하고
--EMP 테이블의 DEPTNO를 이용하여 DEPTNO가 같은 부서명(DNAME)을 구하시오.




select empno, ename, job, sal, salgrade, d.deptno, dname
from emp e, dept d, salgrade s;

select *
from salgrade;


select empno, ename, job, sal
    , (select grade from salgrade where e.sal between losal and hisal) grade
    , (select DNAME from dept where e.DEPTNO = deptno )
from emp e;


--SELECT EMPNO, ENAME, JOB, SAL,
--       (
--SELECT GRADE
--          FROM SALGRADE
--         WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE,
--       DEPTNO,
--      (
--SELECT DNAME
--         FROM DEPT
--        WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME
--FROM EMP E;


--EX001
--EMP 테이블에서 다음과 같이 출력하시오.
--전체 사원 중 ALLEN과 같은 직책(JOB)인 사원들의 사원정보, 부서정보를 다음과 같이 출력하시오.

select job, empno, ename, sal, e.deptno, dname
from emp e, dept d
where job in (select job from emp where ename = 'ALLEN' and d.dname = 'SALES') ;

--EX002
--EMP 테이블에서 다음과 같이 출력하시오.
--전체 사원의 평균급여(SAL) 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하시오.
--급여가 많은 순으로 정렬하되 급여가 같은경우에는 사원번호를 기준으로 오름차순으로 정렬

select empno, ename, dname, hiredate, d.loc, sal, (select grade from SALGRADE where sal between losal and hisal )as grade
from emp  join dept d on sal > all (select avg(sal) from emp) 
where dname = 'SALES'
order by sal desc ,empno;

--select EMPNO, ename, DNAME, hiredate, loc, sal
--from 

--select job, empno, ename, sal, d.deptno, d.dname
--from emp e, dept d
--where job in (select ename , job from ) 
--order by sal desc;

--EX003
--EMP 테이블에서 다음과 같이 출력하시오.
--10번부서에서 근무하는 사원 중 30번부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보를 다음과 같이 출력하는 SQL문을 작성하시오.

-- ★★★★★
select EMPNO, ENAME, JOB, DEPTNO, DNAME, LOC 
from emp natural join dept
where job in (select job from emp where deptno = 10) and job not in ( select job from emp where deptno = 30); 

--EX004
--EMP 테이블에서 다음과 같이 출력하시오.
--직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보를 다음과 같이 출력하시오.
--다중행 함수 사용하지 않는 방법, 다중행 함수 사용하는 방법 2가지로 작성하시오.
--사원번호를 기준으로 오름차순으로 정렬하시오.

--select EMPNO, ENAME, SAL, GRADE
--from EMP
--where 직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보
--order by 사원번호를 기준으로 오름차순으로 정렬하시오.

select EMPNO, ENAME, SAL, (select grade from salgrade where sal between losal and hisal) GRADE
from EMP
where sal >  ( select max(sal) from emp where job = 'SALESMAN') 
order by EMPNO;


select EMPNO, ENAME, SAL, (select grade from salgrade where sal between losal and hisal) GRADE
from EMP
where sal > all ( select sal from emp where job = 'SALESMAN') 
order by EMPNO;






-- 1-4. EXISTS
SELECT JOB, EMPNO, DNAME, HIREDATE, LOC, SAL, GRADE
FROM   EMP E , DEPT D
WHERE E.DEPTNO;



-- 3-3. 

SELECT EMPNO, ENAME, SAL, GRADE
FROM   EMP E , SALGRADE
WHERE  E.SAL BETWEEN S.LOSAL AND S.HISAL
AND    SAL > ( SELECT MAX (SAL) FROM EMP WHERE JOB='SALESMAN')
ORDER  BY EMPNO;


