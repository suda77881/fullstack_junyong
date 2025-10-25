
# 📌 트러블슈팅 
<br/>


**■ SQL**
=

<br/>
<br/>

<!-- 25.10.16 -->

<br/>

## case.1	//	SQL 사용시 자료형 불일치 문제

```SQL

-- scott

select nvl(         comm     , '입력안됨.') from   emp; 

```
NVL, NVL2 함수는 주어진 값이 NULL인지 검사하고, 그에 따라 대체 값을 반환하는 함수이다, 값이 null 일때, true값과 false값을 각각 반환하는 파라미터로 되어있는데, 이 때 사용법 `select nvl(comm , '입력안됨.') from emp;` 형태이다, 그러나  `ORA-01722: invalid number` 에러가 발생했다.


<br/>

### 원인

```sql
select nvl(         comm     , '입력안됨.') from   emp; -- x 오류
```
Java에서 캐스팅을 통해 자료형을 맞추는 것처럼, SQL에서도 함수의 매개변수 간 자료형이 일치해야 오류가 발생하지 않는다.



<br/>

### 해결방법

```sql

select nvl( to_char(comm)    , '입력안됨.') from   emp; -- o 자료형을 맞춰야함. (문자형, 문자형)


```
COMM은 숫자형 컬럼이므로, '입력안됨.'과 같은 문자열과 함께 NVL 함수에 사용할 경우 TO_CHAR(COMM)으로 변환하여 자료형을 일치시켜야 한다.



<br/>

#### 배운점

> 일부 언어에서는 자동 형변환을 지원하지만, SQL에서는 명시적으로 자료형을 맞춰주는 것이 오류를 방지하는 핵심이라는 점을 배웠다.




<!-- 25.10.23 -->

<br/>

## case.2	// 함수사용문제

```SQL

-- scott

select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
from emp
group by grouping sets (deptno), job;

```
NVL, NVL2 함수는 주어진 값이 NULL인지 검사하고, 그에 따라 대체 값을 반환하는 함수이다, 값이 null 일때, true값과 false값을 각각 반환하는 파라미터로 되어있는데, 이 때 사용법 `select nvl(comm , '입력안됨.') from emp;` 형태이다, 그러나  `ORA-01722: invalid number` 에러가 발생했다.


<br/>

### 원인

```sql
select nvl(         comm     , '입력안됨.') from   emp; -- x 오류
```
Java에서 캐스팅을 통해 자료형을 맞추는 것처럼, SQL에서도 함수의 매개변수 간 자료형이 일치해야 오류가 발생하지 않는다.



<br/>

### 해결방법

```sql

select nvl( to_char(comm)    , '입력안됨.') from   emp; -- o 자료형을 맞춰야함. (문자형, 문자형)


```
COMM은 숫자형 컬럼이므로, '입력안됨.'과 같은 문자열과 함께 NVL 함수에 사용할 경우 TO_CHAR(COMM)으로 변환하여 자료형을 일치시켜야 한다.



<br/>

#### 배운점

> 일부 언어에서는 자동 형변환을 지원하지만, SQL에서는 명시적으로 자료형을 맞춰주는 것이 오류를 방지하는 핵심이라는 점을 배웠다.






## case.3 // 서브쿼리에서 다중 행 반환 오류
```sql
-- scott

select EMPNO, ENAME, SAL, 
       (select grade from salgrade where sal between losal and hisal) GRADE
from EMP
where sal > (select max(sal) from emp where job = 'SALESMAN')
order by EMPNO;

```
이 쿼리는 EMP 테이블에서 SALESMAN 직무를 가진 사원의 최고 급여보다 높은 급여를 받는 사원들을 조회하고, 그들의 급여 등급(GRADE)을 SALGRADE 테이블에서 조회하려는 목적이다. 하지만 실행 시 ORA-01427: single-row subquery returns more than one row 오류가 발생할 수 있다.
<br/>
원인

```sql
(select grade from salgrade where sal between losal and hisal) -- x 오류 발생 가능
```

SALGRADE 테이블에서 SAL 값이 LOSAL과 HISAL 사이에 있는 GRADE를 찾는 서브쿼리는, EMP 테이블의 각 행마다 실행된다. 이때 SAL 값이 여러 등급 범위에 동시에 포함되는 경우는 없지만, SALGRADE 테이블에 중복된 범위가 존재하거나 데이터 정합성이 깨졌을 경우, 하나의 SAL 값에 대해 여러 GRADE가 반환될 수 있다. 이로 인해 서브쿼리가 다중 행을 반환하게 되어 오류가 발생한다.
<br/>

해결방법

```sql

-- 서브쿼리를 스칼라 서브쿼리 대신 인라인 뷰로 변경하여 조인 처리

select e.EMPNO, e.ENAME, e.SAL, s.GRADE
from EMP e
join SALGRADE s
  on e.SAL between s.LOSAL and s.HISAL
where e.SAL > (select max(sal) from emp where job = 'SALESMAN')
order by e.EMPNO;
```


SALGRADE 테이블과 EMP 테이블을 JOIN하여 SAL 값이 등급 범위에 포함되는 경우에만 GRADE를 가져오도록 수정하면, 다중 행 오류 없이 정확한 결과를 얻을 수 있다.


<br/>
배운점

> 서브쿼리를 사용할 때는 반환되는 행의 수를 항상 고려해야 하며, 다중 행이 반환될 가능성이 있는 경우에는 JOIN을 활용한 인라인 뷰 방식이 더 안전하고 명확하다는 점을 배웠다.




<br/> 
<br/>
