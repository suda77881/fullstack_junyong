--
select * from emp;

-- 집계 sum , max , min , avg , count

select sum(sal)  from emp;   --  급여의 합계
select sum(comm) from emp;   --  null 값이 있어도 계산가능

--     14줄  1줄 
--select sal, sum(sal), max(sal), min(sal), avg(sal), count(sal) from emp; -- error
select sum(sal) 합 , max(sal) 최대, min(sal) 최소 , round(avg(sal) , 2) 평균, count(sal) 갯수 from emp; -- error

-- 3. group by 
--select    --5
--from      --1
--where     --2  (전체 필터링)
--group by    --3 그룹핑
--having      --4 그룹핑안에서 조건 (그룹핑 후 필터링)
--order by;   --6
-- 부서별 급여의 합
select  deptno   , sum(sal) 
from    emp
group by deptno;


-- 4. having (합계를 구했을때 9000이상인 그룹)
select      deptno, sum(sal) , count(*)
from        emp
group by    deptno
having      sum(sal) >= 9000;


--####

--1
select sum(sal)
from emp;

--2 error 이유 14, 1  그룹핑 대상의 갯수가 안맞다. 
--select ename, sum(sal) from emp;
--select ename, sum(sal) from emp group by ename;
--select        sum(sal) from emp;

--ORA-00937: not a single-group group function

--https://docs.oracle.com/error-help/db/ora-00937/00937. 00000 -  "not a single-group group function"
--*Cause:    A SELECT list cannot include both a group function,
--           such as AVG, COUNT, MAX, MIN, SUM, STDDEV, or VARIANCE, and an
--           individual column expression, unless the individual column
--           expression was included in a GROUP BY clause.
--*Action:   Drop either the group function or the individual
--           column expression from the SELECT list or add a GROUP BY
--           clause that includes all individual column expressions listed.
--40행, 8열에서 오류 발생
-- 해결방안 group by를 넣던가

select ENAME , sum(sal)
from emp;

-- 각각의 행갯수가 다르다.

--3

select sum(comm) -- 1400 + 300 + 500 , null 미포함
from emp;

select sal+comm from emp;   -- null 포함

--4 EMP 테이블에서 sum (distinct, all) 함수를 이용하여 급여 합계를 출력하시오 -- 중복 안빼고 다처리
slect * from emp;

select sum(distinct sal), sum(all sal), SUM(SAL)
from emp;

--5

select count(*)
from emp;

--6

select count(*)
from emp
--group by deptno
--having deptno = 30;
where deptno =30;

--7


select count (distinct sal), count(all sal), count(sal)
from emp;

--8

select count(comm)
from emp;

--9 



select count(comm)      --3
from emp                --1
where comm is not null; --2


--10

select max(sal)
from emp
--group by deptno
--having deptno = 10;
where deptno = 10;

--1) select *        from emp    where deptno = 10;
--2) select max(sal) from emp where deptno = 10;



--11

select min(sal)     --3
from emp            --1
--group by deptno
--having deptno = 10; --2
where deptno = 10; --2

--12 ?

select max(hiredate)
from emp
--group by deptno
--having deptno = 20;
where deptno = 20;


--13

select min(hiredate)
from emp
group by deptno
having deptno = 20;

--select *
--from emp
--where deptno = 20;


--14

select round (avg(sal) ,2)
from emp
group by deptno
having deptno = 30;

--15

select avg(distinct sal)
from emp
group by deptno
having deptno = 30;

--16

select avg(sal), deptno
from emp 
group by deptno
having deptno = 10
union all
select avg(sal), deptno
from emp
group by deptno
having deptno = 20
union all
select avg(sal), deptno
from emp
group by deptno
having deptno = 30;

select avg(sal), '10' as deptno
from emp 
where = 10
union all
select avg(sal), '20' as deptno
from emp
where deptno = 20
union all
select avg(sal), '30' as deptno
from emp
where deptno = 30;


--17

select   deptno, avg(sal)
from     emp
group by deptno;

--18 Q018 EMP 테이블에서 부서번호(DEPTNO) 및 직책별(JOB) 평균급여(SAL)로 정렬한 후 출력하시오.

select  deptno, job, avg(sal)
from    emp
group by deptno, job -- 집계 함수 ( avg, sal, min, max, count) 빼고 다 그룹핑
order by deptno asc;

-- Q019 EMP 테이블에서 GROUP BY절에 없는 열을 SELECT절에 포함하면 에러가 난다. 그이유를 적으시오.
-- 기준을 그룹 바이로 잡고 조건을 만들기 때문에?
select ename, deptno, avg(sal)
    from emp
group by depno; -- ename, deptno,

-- 20 Q020 EMP 테이블에서 GROUP BY 와 HAVING 절을이용하여 각부서의 
-- 직책별 평균급여를 구하되 그 평균급여가 2000이상인 그룹만 출력하시오.

select deptno, job, avg(sal)
from   emp
group by sal, deptno, job
having avg(sal) >= 2000
order by deptno asc, job asc;

--21 Q021 다음 코드가 오류나는 이유를 적으시오

--그룹바이 조건에 sal이 없기 때문에?

--22 Q022 WHERE 절을 사용하지 않고 HAVING절만 사용한 경우

select deptno , job, avg(sal)
from emp
group by deptno, job, sal
having avg(sal)>=2000
order by deptno asc;

--23 Q023 WHERE절과 HAVING절을 모두 사용한경우
select deptno , job, avg(sal)   -- 5
from emp    -- 1    14줄
--where avg(sal) > 2000 -- 2 300이하인 애들
group by deptno, job, -- 3 deptno , hob 그룹의 평균
having avg(sal)>=2000 -- 4
order by avg(sal) asc; -- 6

--select deptno , job, avg(sal)
--from emp
--where sal < 5000
--group by deptno, job, sal
--Having avg(sal) > 2000;



--Q024 EMP 테이블에서 부서별(큰그룹) 직책(소그룹)의 사원수, 가장 높은 급여, 급여의 합, 평균급여를 출력하시오.
select deptno, job, count(job), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job
order by deptno asc ;


--Q025 EMP 테이블에서 ROLLUP 함수를 이용하여
--부서별(큰그룹) 직책(소그룹)의
--사원수, 가장 높은 급여, 급여의 합, 평균급여를 출력하시오.

select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by rollup(deptno, job);



--Q026
--EMP 테이블에서 CUBE(DEPTNO, JOB) 함수를 이용하여
--부서별(큰그룹) 직책(소그룹)의
--사원수, 가장 높은 급여, 급여의 합, 평균급여를 출력하시오.

select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by cube(deptno, job)
order by deptno, job;

--Q027
--EMP 테이블에서
--DEPTNO를 먼저 그룹화한후 ROLLUP 함수에 JOB을 지정하여
--사원수를 출력하시오.

select deptno, job, count(*)
from emp
group by deptno, rollup(job);

--Q028
--EMP 테이블에서
--JOB을 먼저 그룹화한후 ROLLUP 함수에 DEPTNO을 지정하여
--사원수를 출력하시오.

select deptno, job, count(*)
from emp
group by job, rollup(deptno);

--Q029
--EMP 테이블에서         
--GROUPING SETS (DEPTNO, JOB) 함수를 사용하여
--열별 그룹으로 묶어어 결과로 출력하시오.

select deptno, job, count(*)
from emp
group by grouping sets(deptno, job);

--Q030
--EMP 테이블에서 DEPTNO JOB열의 그룹화결과를 GROUPING 함수로 출력하시오.

select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp
group by rollup (deptno, job);


--Q031
--DECODE문으로 GROUPING 함수를 적용하여 결과를 표기하시오

select decode(grouping(deptno), 1 , 'ALL_DEPT', deptno ) AS DEPTNO ,
       decode(grouping(job), 1 , 'ALL_JOB', job ) AS job , count(*), max(sal), sum(sal), avg(sal)
from emp
group by rollup (job), rollup (deptno)
order by deptno, job asc;


--Q032
--DEPTNO, JOB을 함께 명시한 GROUPING_ID 함수를 사용하시오.

select deptno, job, count(*), sum(sal), grouping(deptno), grouping(), grouping(deptno)
from emp;

--Ex001
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--부서번호(DEPTNO) , 평균급여(AVG_SAL) , 최고급여(MAX_SAL) , 최저급여(MIN_SAL) , 사원수(CNT) 를 조회하시오
--평균급여를 출력시 소수점을 제외하고 각 부서번호별로 출력하시오.

select deptno "부서번호", trunc(avg(sal)) "평균급여", max(sal) "최고급여", min(sal) "최저급여", count(*) "사원수"
from emp
group by deptno;

--SELECT 
--FROM
--WHERE
--GROUP BY
--WHERE
--HAVING
--ORDER BY


--Ex002
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--같은직책(JOB)에 종사하는 사원이 3명 이상인 직책과 인원수를 출력하시오.

select job, count(*)
from emp
group by grouping sets(job)
having count(*) >= 3  -- 기억
order by COUNT(*) DESC, JOB DESC;


--Ex003
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--사원들의 입사년도(HIRE_YEAR)를 기준으로 부서별 몇명이 입사했는지 조회하시오.

select to_char(hiredate, 'yyyy') HIRE_YEAR, deptno, count(*) CNT
from emp
group by to_char(hiredate, 'yyyy'), (deptno)
order by deptno;

SELECT  TO_CHAR( HIREDATE, 'YYYY') HIRE_YEAR , DEPTNO, COUNT(*) CNT 
FROM    EMP
GROUP BY TO_CHAR( HIREDATE, 'YYYY'), DEPTNO -- 순서지정밑 그룹지정할떄 정확한 이름으로 함수명 포함해서
ORDER BY TO_CHAR( HIREDATE, 'YYYY'), DEPTNO;

--Ex004
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--추가수당(COMM)을 받는 사원수와 받지않는 사원수를 조회하시오.

SELECT  NVL2( COMM , 'O' , 'X') EXIST_COMM , COUNT(*) CNT
FROM     EMP
GROUP BY NVL2(COMM,'O','X');


SELECT DECODE(COMM, NULL, 'O', 'X'), COUNT(*) CNT
FROM EMP
GROUP BY DECODE(COMM, NULL, 'O', 'X');

SELECT 
CASE WHEN COMM IS NULL THEN 'X' ELSE 'O' END 
EXITM_COMM, COUNT(*) CNT
FROM    EMP
GROUP BY CASE WHEN COMM IS NULL THEN 'X' ELSE 'O' END;


--Ex005
--EMP 테이블을 이용하여 다음과 같이 출력하시오.
--각 부서의 입사연도별 사원수, 최고급여, 급여합, 평균급여를 출력하고
--각 부서별 소계와 총계를 출력하시오. (ROLLUP)


select DEPTNO, TO_CHAR(HIREDATE, 'YYYY') HIRE_YEAR, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL)
from emp
group by ROLLUP(DEPTNO, TO_CHAR(HIREDATE, 'YYYY'));
