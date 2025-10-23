--1
select * from emp;

--2.집계함수 - sum, count, max, min, avg
select sum(sal) from emp;   -- 1개

--3. 부서별 직업별 급여의 평균
select deptno , job , avg(sal) from emp group by deptno, job;   -- 집계함수앞에 있는 것들은 그룹바이로 다들어와야함

--4. where vs having -- 급여의 평균에서 2000이상
select   deptno , job ,        avg(sal) -- 5.
from     emp                    -- 1 
where    sal >= 1500            -- 2 전체 데이터에서 필터
group by deptno , job           -- 3 [부서의 직업별], 급여의 평균
having   avg(sal)    > 2000;    -- 4. 3번에서 나온 급여의 평균으로 having 



-- 5. rollup , cube, grouping sets / pivot, unpivot 
--       [부서의 직업별] , 명수, 급여의 평균
-- rollup : 10부서의 직업 급여의 평균, 20부터의 급여의 평균 , 30부서의 급여의 평균 = 전체 총계
select       deptno, job , count(*) , round ( avg(sal) , 1)
from         emp
group by     rollup(deptno , job) ;

-- cube :    deptno + job전체총계 , deptno 총계 , deptno + job 각각의 세부내용 (rollup과 순서반대)
select       deptno, job , count(*) , round ( avg(sal) , 1)
from         emp
group by     cube(deptno , job) ;

-- grouping  뭘로 묶였는지 확인 - 해당컬럼이 실제로 그룹화되었니?  0 그룹화에 포함됨 / 그룹화에 포함이 되지 않음.
select       deptno, job ,grouping(deptno) , grouping(job)
from         emp --1
group by     cube(deptno , job) ; -- 2 -- deptno + job , job, deptno , 둘 다세부

-- pivot
select  *
from    (  seledct 컬럼1, 컬럼2 , 집계대상 컬럼 from 테이블명       )   -- 원본데이터 : pivot을 적용할 대상
pivot   (  집계함수(집계대상) for 컬럼기준 in (값1, 값2, 값3 ,,,)   );  -- 집계함수   : 어떤 컬럼 기준으로 만들 것인지 지정

select *
from    (   select deptno, job, sal from emp    )
pivot   (   max(sal) for deptno in(10, 20, 30)  );  -- job 별 부서 10, 20, 30의 최대 급여


-- #### https://sally03915.github.io/stackventure_250825/004_oracle/oracle005_select_group#38

--Q025
--EMP 테이블에서 ROLLUP 함수를 이용하여
--부서별(큰그룹) 직책(소그룹)의
--사원수, 가장 높은 급여, 급여의 합, 평균급여를 출력하시오.


select deptno, job, count(*), max(sal), sum(sal), avg(sal)
from emp
group by deptno, job;

select       deptno, job , count(*), max(sal), sum(sal) , avg(sal)
from         emp
group by     rollup(deptno , job) ;


--Q026
--EMP 테이블에서 CUBE(DEPTNO, JOB) 함수를 이용하여
--부서별(큰그룹) 직책(소그룹)의
--사원수, 가장 높은 급여, 급여의 합, 평균급여를 출력하시오.


select       deptno, job , count(*), max(sal), sum(sal) , avg(sal)
from         emp
group by     cube(deptno , job) 
order by     deptno;


--Q027
--EMP 테이블에서
--DEPTNO를 먼저 그룹화한후 ROLLUP 함수에 JOB을 지정하여
--사원수를 출력하시오.

select       deptno, job , count(*)
from         emp
group by     deptno ,rollup( job);


--Q028
--EMP 테이블에서
--JOB을 먼저 그룹화한후 ROLLUP 함수에 DEPTNO을 지정하여
--사원수를 출력하시오.

select       deptno, job , count(*)
from         emp
group by     job ,rollup( deptno);


--Q029
--EMP 테이블에서
--GROUPING SETS (DEPTNO, JOB) 함수를 사용하여
--열별 그룹으로 묶어어 결과로 출력하시오.

select     deptno, job, count(*)
from emp
group by grouping sets(deptno, job);

--Q030
--EMP 테이블에서 DEPTNO JOB열의 그룹화결과를 GROUPING 함수로 출력하시오.

select deptno , job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp 
group by grouping sets(cube(deptno, job))
order by deptno, job;


--Q031
--DECODE문으로 GROUPING 함수를 적용하여 결과를 표기하시오

select deptno , job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp 
group by grouping sets(cube(deptno, job))
where decode(job, null, ALL_JOB)
order by deptno, job;



