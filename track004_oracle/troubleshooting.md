
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




---
<br/> 
<br/>