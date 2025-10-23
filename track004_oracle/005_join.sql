-- join(면접시 단골문제)
-- 여러테이블을 한 개의 테이블처럼 사용하는 것
-- 공토컬럼 기준으로 연결

-- 1-1. 내부조인
--      등가조인   (=)   : 매칭되는 행. where 절     emp.deptno = dept.deptno
--      비등가조인 (= X) :              sal between losal and hisal
--      자체조인         : emp e1, emp e2

-- 1-2. outer join : 매칭되지 않은 행도 포함. left, right, full outer join

-- ERD : Entity(테이블), Relationship (관계), diagram(표)
-- 특징 : Entity(테이블), Relationship (관계), Attribute(속성)


-- #1. 내부조인 (등가조인)
select *
from emp e, dept d
where e.deptno = d.deptno;  -- 14 * 4 = 56


select *
from emp e join dept d on( e.deptno = d.deptno);

select *
from emp e join dept d using (deptno );

select *
from emp e natural join dept d;


--# 2.  외부조인 ( 매칭되지 X )

SELECT * FROM DEPT;     -- DEPTNO 10, 20, 30, 40 ( 40 , OPERATIONS , BOSTON)
SELECT * FROM EMP;      -- DEPTNO 10, 20, 30

-- 1. (+) ORACLE에서만        -- (+) 없는 데이터 NULL 보충해줄께. (+) 안붙은 테이블의 데이터를 보장

SELECT E.ENAME , DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO(+); -- 14 EMP 테이블 보장 , DEPT 에서 모자라는 데이터 없는 데이터 NULL 채울께

SELECT E.ENAME , DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO; -- 15 DEPT 테이블 보장, EMP에서 모자라는 데이터 없는 데이터 NULL 채울께

-- 2. LEFT JOIN , RIGHT JOIN (ANSI조인 = 표준)
SELECT ENAME , DNAME

FROM   EMP E INNER JOIN DEPT D ON ( E.DEPTNO = D.DEPTNO); -- INNER JOIN, 내부조인, 겹치는 애들만 OUTER JOIN 아님 !!! INNER JOIN , 내부조인, 겹치는 애들만


SELECT ENAME , DNAME
FROM   EMP E RIGHT OUTER JOIN DEPT D 
ON    ( E.DEPTNO = D.DEPTNO); -- RIGHT 쪽에 있는 테이블 보장 (NULL, OPERATIONS)

SELECT ENAME , DNAME
FROM   EMP E LEFT OUTER JOIN DEPT D 
ON    ( E.DEPTNO = D.DEPTNO); -- LEFT 쪽에 있는 테이블 보장 (NULL, OPERATIONS)

-- 3. OUTER JOIN ( 두테이블에 있는 모든 데이터를 결합)
SELECT ENAME , DNAME
FROM    EMP E   FULL OUTER JOIN DEPT D
ON     E.DEPTNO = D.DEPTNO;

-- 각각의 테이블 보장

-- 비표준 = , (+)
-- 표준 NATURAL JOIN, JOIN ON, JOIN USING , LEFT JOIN, RIGHT JOIN , FULL JOIN






-- emp e, dept d 별명 / empno, ename, deptno, dname 관계를 맺어서 한테이블에 조인시키는것
select empno, ename, e.deptno, dname
from emp e, dept d
where e.deptno = d.deptno;

select empno, ename, e.deptno, dname
from emp e join dept d on ( e.deptno = d.deptno);

select empno, ename, deptno, dname
from emp e join dept d  using ( deptno);



--Q001
--EMP, DEPT 테이블을 이용하여 FROM 절에 여러 테이블을 선언해해 다음과 같이 출력하시오
--모든 행과 열이 곱해진 값 (위험한 코드 만개넘어가면 서버 멈춤)

select * 
from emp, dept
order by empno;

--Q002
--EMP, DEPT 테이블을 이용하여
--EMP의 DEPTNO와 DEPT테이블의 DEPTNO가 같은 데이터를 다음과 같이 출력하시오

select * 
from emp e, dept d
where e.deptno = d.deptno -- emp.deptno = dept.deptno
order by empno;

select *
from emp join dept on(emp.deptno = dept.deptno)
order by empno;

select *
from emp join dept using(deptno)
order by empno;

select *
from emp natural join dept
order by empno;


--Q003
--EMP, DEPT 테이블을 이용하여
--FROM 절에 EMP 테이블의 별칭은 E, DEPT 테이블의 별칭은 D로 다음과 같이 출력하시오

select * 
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select *
from emp join dept 
on (emp.deptno = dept.deptno)
order by empno;

select *
from emp join dept
using (deptno)  -- 똑같은 필드를 찾는다
order by empno;

select *
from emp e natural join dept d
order by empno;

--Q004
--EMP, DEPT 테이블을 이용하여
--두테이블에 부서번호가 같은 열의 이름이 포함되었을때 다음과 같이 출력하시오 (에러발생)
-- join 사용시 select에 어떤 테이블의 소유인지 테이블.열이름(테이블명 별칭가능)
select empno, ename, deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno
order by empno;


--Q005
--EMP, DEPT 테이블을 이용하여
--열 이름에 각각의 테이블 이름도 함께 명시시 다음과 같이 출력하시오 ( 위의 문제 해결 )
-- 겹치는 부분만 D. E. , 모든필드에 E
select e.empno, e.ename, d.deptno, d.dname, d.loc
--select empno, ename, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno
order by dname ;



--Q006 = , join on, join using , natural join
--EMP, DEPT 테이블을 이용하여
--급여가 3000이상인 사원의 사원번호, 이름, 급여, 근무부서를 다음과 같이 출력하시오
select e.empno, e.ename, sal, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno and sal >= 3000
order by dname ;

select empno, ename, sal, d.deptno, dname, loc
from emp e join dept d on (e.deptno = d.deptno)
where  sal >= 3000
order by dname ;

select *
from emp e join dept d using (deptno)
where  sal >= 3000
order by dname ;

select empno, ename, sal, deptno, dname, loc
from emp e natural join dept d
where  sal >= 3000
order by dname ;


--Q007
--EMP, SALGRADE 테이블을 이용하여
--유저 정보, 급여등급 , 그 등급의 최소급여와 최대급여를 다음과 같이 출력하시오

select empno, ename, job, mgr, hiredate,  sal, comm, deptno, grade, losal, hisal 
from emp e, SALGRADE s
where sal between losal and hisal
order by sal;

select *  -- 확인
from emp e, SALGRADE s
where e.sal >= losal and e.sal <= hisal;

select *
from emp e join salgrade s on (e.sal >= losal and e.sal <= hisal);

--select 
--from emp e join salgrade s using (겹치는 필드가 안보임 x- 서브쿼리로 가능 );

select *
from emp e, salgrade s
where e.sal between losal and hisal;

select *
from emp e join salgrade s on (e.sal >= losal and e.sal <= hisal);

--select *
--from emp e join SALGRADE s using (겹치는 필드가 안보임 x-  서브쿼리로 가능);,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,





--Q008
--EMP테이블을 2번 이용하여
--사원정보(EMPNO, ENAME, MGR) 와 직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오

select e1.empno , e1.ename, e1.mgr , e2.empno MGR_EMPNO, e2.ename EMG_ENAME
from emp e1 , emp e2
where e1.mgr = e2.empno
order by e2.empno; -- E1.MGR ASC;


select e1.empno , e1.ename, e1.mgr , e2.empno MGR_EMPNO, e2.ename EMG_ENAME
from emp e1 join emp e2 on (e1.mgr = e2.empno)
order by e2.empno; -- E1.MGR ASC;

--select empno , e1.ename, mgr , empno MGR_EMPNO, e2.ename EMG_ENAME
--from emp e1 join emp e2 USING  (같은필드 X) --(MGR, EMPNO) 동작은 하나 값이 틀림
--order by empno; -- E1.MGR ASC;



-- USING X , natural X

--Q009
--EMP테이블을 2번 이용하여
--사원정보(EMPNO, ENAME, MGR) 와 직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
--직속상관이 없는 사원의 정보도 출력하시오


SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+)
ORDER BY E1.EMPNO; -- (+) null 채워줄꼐

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1 left join  EMP E2 on (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO; -- 왼쪽 테이블의 데이터가 무조건 다나오게

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E2 right join  EMP E1 on (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO; -- 오른쪽테이블의 데이터가 무조건 다나오게

--Q010
--(+)의 위치를 바꿔서 출력해보고 다음이 의미하는 바를 적으시오

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR(+) = E2.EMPNO
ORDER BY E1.EMPNO; -- (+) null 채워줄게, 매니저들의 번호와 이름은 있으나, 관리하는 사원이 없음

-- 부하 직원이 없는 매니저도 을 출력 NULL 채워서

--Q011 표준문법 (NATURAL JOIN)
--EMP , DEPT 테이블 이용하여
--EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오
--NATURAL JOIN
--알아서 두 테이블의 이름과 자료형이 같은 열을 찾은 후
--그 열을 기준으로 등가조인을 해주는 방식
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, DNAME, LOC
FROM EMP E NATURAL JOIN DEPT D
ORDER BY DEPTNO, ENAME;


--Q012 표준문법 (JOIN USING)
--EMP , DEPT 테이블 이용하여
--EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오
--JOIN USING
--USING에 조인기준열 명시
--그 열을 기준으로 등가조인을 해주는 방식

SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, DNAME, LOC
FROM EMP E JOIN DEPT D USING (DEPTNO)
WHERE SAL >= 3000 --
ORDER BY DEPTNO, ENAME;

SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, DNAME, LOC
FROM EMP E JOIN DEPT D on (e.DEPTNO = d.deptno)
WHERE SAL >= 3000 --
ORDER BY DEPTNO, empno;


--Q013 표준문법 (JOIN ON)
--EMP , DEPT 테이블 이용하여 EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오
--
--
--JOIN ON
--ON에 조인기준열 명시
--그 열을 기준으로 등가조인을 해주는 방식

select empno, ename, job, mgr, hiredate, sal, comm, e.dept


SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, D.DNAME, D.LOC -- 명시를 해줘야하는듯 
FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
ORDER BY DEPTNO, ENAME;

--Q014 표준문법 (LEFT OUTER JOIN )
--EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오
--LEFT OUTER JOIN
--왼쪽 외부조인을 기준으로 NULL보장

select e1.empno, e1.ename, e1.mgr, e2.empno MGR_EMPNO , e2.ename MGR_ENAME
from emp e1 LEFT OUTER JOIN emp e2 on (e1.mgr = e2.empno)
order by e1.empno;

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO MGR_EMPNO , E2.ENAME MGR_NAME
FROM EMP E1 LEFT OUTER JOIN EMP E2
ON (E1.MGR = E2.EMPNO)
order BY E1.EMPNO;


--Q015 표준문법 (RIGHT OUTER JOIN )
--EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오
--RIGHT OUTER JOIN- 오른른쪽 외부조인을 기준으로 NULL보장

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO MGR_EMPNO , E2.ENAME MGR_NAME
FROM EMP E1 RIGHT OUTER JOIN EMP E2
ON (E1.MGR = E2.EMPNO)
order BY E1.EMPNO;

select e1.empno, e1.ename, e1.mgr, e2.empno MGR_EMPNO , e2.ename MGR_ENAME
from emp e2 RIGHT OUTER JOIN emp e1 on (e1.mgr = e2.empno)
order by e1.empno;



--Q016 표준문법 (FULL OUTER JOIN )
--EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오
--FULL OUTER JOIN - 양쪽모두두 외부조인을 기준으로 NULL보장

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO MGR_EMPNO , E2.ENAME MGR_NAME
FROM EMP E1 full OUTER JOIN EMP E2
ON (E1.MGR = E2.EMPNO)
order BY E1.EMPNO;

select e1.empno, e1.ename, e1.mgr, e2.empno MGR_EMPNO , e2.ename MGR_ENAME
from emp e2 FULL OUTER JOIN emp e1 on (e1.mgr = e2.empno)
order by e1.empno;


--EX001
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--급여(SAL)이 2000초과인 사원들의 부서정보, 사원정보를 출력하시오.


SELECT D.DEPTNO, DNAME, EMPNO, ENAME, SAL
FROM DEPT D, EMP E
WHERE D.DEPTNO = E.DEPTNO AND SAL > 2000;




SELECT D.DEPTNO, D.DNAME, E.EMPNO, E.ENAME, E.SAL
FROM DEPT D join EMP E on (D.DEPTNO = E.DEPTNO)and sal >2000
ORDER BY DEPTNO ;

SELECT D.DEPTNO, D.DNAME, E.EMPNO, E.ENAME, E.SAL
FROM DEPT D , EMP E 
where D.DEPTNO(+) = E.DEPTNO and sal >2000
ORDER BY DEPTNO, ENAME DESC;


--EX002
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--각 부서별 평균급여, 최대급여, 사원수를 출력하시오.

SELECT D.DEPTNO, DNAME, EMPNO, ENAME, SAL
FROM DEPT D JOIN EMP E ON (D.DEPTNO = E.DEPTNO)
WHERE SAL > 2000;

SELECT DEPTNO, DNAME, EMPNO, ENAME, SAL
FROM DEPT D JOIN EMP E USING ( DEPTNO)
WHERE SAL > 2000;

SELECT DEPTNO, DNAME, EMPNO, ENAME, SAL
FROM DEPT D NATURAL JOIN EMP 
WHERE SAL > 2000;


SELECT   D.DEPTNO, DNAME, TRUNC(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(*) CNT
FROM     DEPT D , EMP E
WHERE    D.DEPTNO = E.DEPTNO
GROUP BY D.DEPTNO , DNAME;



SELECT D.DEPTNO, DNAME, TRUNC(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(*) CNT
FROM EMP E, DEPT D
where D.DEPTNO(+) = E.DEPTNO
GROUP BY GROUPING SETS(D.DEPTNO), DNAME;


SELECT E.DEPTNO, D.DNAME, TRUNC(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(*) CNT
FROM EMP E LEFT OUTER JOIN  DEPT D
ON ( D.DEPTNO = E.DEPTNO )
GROUP BY E.DEPTNO, D.DNAME;

--EX003
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--모든 부서정보와 사원정보를 부서번호, 사원이름 순으로 정렬해 출력하시오.

SELECT D.DEPTNO, D.DNAME, EMPNO, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO(+) = D.DEPTNO
ORDER BY DEPTNO;


SELECT D.DEPTNO, D.DNAME, EMPNO, ENAME, JOB, SAL
FROM EMP E RIGHT OUTER JOIN  DEPT D
ON (D.DEPTNO = E.DEPTNO) 
ORDER BY DEPTNO;

SELECT D.DEPTNO, D.DNAME, EMPNO, ENAME, JOB, SAL
FROM  DEPT D LEFT OUTER JOIN  EMP E
ON (D.DEPTNO = E.DEPTNO) 
ORDER BY DEPTNO;


SELECT D.DEPTNO, D.DNAME, EMPNO, ENAME, JOB, SAL
FROM EMP E, DEPT D
WHERE D.DEPTNO(+) = E.DEPTNO
ORDER BY D.DEPTNO,E.ENAME;


--
--EX004
--EMP, DEPT 테이블을 이용하여
--SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.
--모든 부서정보와 사원정보, 급여등급정보, 각사원의 직속상관의 정보를
--부서번호, 사원번호 순서로 정렬해 출력하시오.

SELECT D.DEPTNO, D.DNAME, E.EMPNO, E.ENAME, E.MGR, E.SAL, E.DEPTNO, MIN(E.SAL) LOSAL, MAX(E.SAL) HISAL, DECODE(
,CASE 
WHEN E.SAL >= 1000 THEN '1' 
WHEN E.SAL >= 2000 THEN '2' 
WHEN E.SAL >= 3000 THEN '3' 
WHEN E.SAL >= 4000 THEN '4' 
ELSE 5 
END 
AS GRADE 
--, E.EMPNO MGR_EMPNO , E.ENAME MGR_ENAME
FROM EMP E, DEPT D
WHERE D.DEPTNO = E.DEPTNO
GROUP BY GROUPING SETS(D.DEPTNO), D.DNAME, E.EMPNO, E.ENAME, E.MGR, E.SAL, E.DEPTNO --, E.EMPNO, E.ENAME
ORDER BY D.DEPTNO;


SELECT  D.DEPTNO, DNAME, E1.EMPNO, E1.ENAME, E1.MGR, E1.SAL, E1.DEPTNO, LOSAL, HISAL, GRADE, E2.EMPNO MGR_EMPNO , E2.ENAME MGR_ENAME 
FROM    EMP E1, DEPT D, SALGRADE S, EMP E2
WHERE   E1.DEPTNO(+) = D.DEPTNO AND E1.SAL BETWEEN LOSAL(+) AND HISAL(+) AND E1.MGR = E2.EMPNO(+)
ORDER BY D.DEPTNO;











--Q009
--EMP테이블을 2번 이용하여
--사원정보(EMPNO, ENAME, MGR) 와 직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
--직속상관이 없는 사원의 정보도 출력하시오


SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO;

--Q010
--(+)의 위치를 바꿔서 출력해보고 다음이 의미하는 바를 적으시오

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR(+) = E2.EMPNO;
-- EMP E1에 NULL 을 채워서 E2데이터를 보장한다.

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+);
-- EMP E2에 NULL 을 채워서 E1데이터를 보장한다.

