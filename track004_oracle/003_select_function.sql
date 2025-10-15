--------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열 
-- 2. 숫자
-- 3. 날짜
-- 4. 변환
-- 5. 조건


--------------------------------------------------------------------------------------
-- 003_select_function.sql

-- 1. 문자열 

-- 1-1. upper  대문자, lower 소문자, initcap 대소문자 변환
-- 1-2. length 문자열길이
-- 1-3. substr 부분문자열 , instr 위치문자열(번호반환) 
-- 1-4. replace 바꾸기 , lpad, rpad 채우기
-- 1-5. trim (양쪽), ltrim, rtrim 공백빼기
-- 1-6. concat 문자열연결

-- #1. 대소문자
select ename, upper(ename), lower(ename), initcap(ename) 
from   emp;

-- #2. 문자열길이
select ename, length(ename) , '킹' , length('킹') , lengthb('킹')
from emp;

-- #3. substr(문자열, 어디서부터, 몇개) 부분문자열 , instr 위치문자열
select ename, substr(ename, 1,2) , substr(ename, 1,3) , substr(ename, 2,2) , substr (ename, 3,2) from emp;
select        substr('oracle' , -1) , substr('oracle' , -3)                 , substr('oracle' , -3,2)   from dual;
--              e 뒤에서 1번부터 끝까지  cle 뒤에서부터 세번째부터 끝까지             cl 뒤에서 번째 부터(cle) 2개(cl)
--   -붙이면 끝에서 부터 계산(오른쪽부터)
select        substr('oracle' , -2) , substr('oracle' , -2,1) from dual; -- le

select        instr('oracle' , 'a') from dual;      -- o(1) r(2) a(3) c(4) l(5) e(6)
select ename, instr(ename, 'A') from emp; -- 있으면 위치, 없으면 0


-- #4. replace 문자열 , 대상, 치환 , lpad , rpad 채우기
select repalce( '010-1234-5678' , '-' , ' ') from dual;
select lpad('oracle' , 10 , '#') from dual; -- l (left 남은 공간 채우기) r(right 남은 공간 채우기)

-- #5. trim, ltrim, rtrim 공백제거
select trim(' _oralce_ ') , ltrim(' _oracle_ ') , rtrim(' *oracle* ')
from dual;

-- #6. concat 문자열연결
select concat('Hello' , 'Oracle')
from dual; 
select concat( concat('Hello ' , 'Oracle') , ' ★') from dual; -- concat 중첩해서 사용

select 'Hello '  || 'Oracle' || ' ♥' str from dual;


--------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제 (1~18)
-- 

--q1
select ENAME, upper(ENAME), lower(ENAME), initcap(ENAME) 
from emp;

--q2
select upper(ENAME) 
from emp 
--where ENAME = 'KING';
where upper(ename)=upper('king'); 
-- where lower(ename)=lower('king');

--q3
select ENAME from emp where ENAME in upper('king');
select ename 
from emp 
where upper(ename) like upper('%king%'); -- 정답
select ename 
from emp
where upper(ename) like upper('%a%'); -- 포함되는



--q4
select ENAME, LENGTH(ENAME) 
from emp;

--q5
select ENAME, length(ENAME) 
from emp 
where length(ENAME) >= 5; 

--q6
select length('한글'), lengthb('한글') from dual;

--q7
select JOB,  substr(JOB, 1,2) , substr(job,3,2) , substr(job,5) from emp; 

--q8
-- -의 의미? 오른쪽부터 시작 (-5 오른쪽 5번째 부터 시작, length 앞에 붙이는 경우 역순)
select JOB, SUBSTR(JOB, -LENGTH(JOB)), SUBSTR(JOB, -lENGTH(JOB),2), SUBSTR(JOB, -3) 
from emp;
--                          역순             길이의 역순에서 2개          오른쪽 세번째부터?

--q9 
-- INSTR (문자열, 찾을거, 시작위치, 몇번쨰)
select 'HELLO, ORACLE!'
, INSTR('Hello, ORACLE!' , 'L' ) as instr_1
, INSTR('Hello, ORACLE!' , 'L' , 5) as instr_2
, INSTR('Hello, ORACLE!' , 'L' , 2, 2) as instr_3
from dual;

--q10
select * --EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from emp where INSTR (ENAME, 'S') >= 1 ;

--q11
select * --EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
from emp where ENAME like '%S%';

--q12
--select CNUMBER('010-1234-5678'), replace("010-1234-5678", '-',' ') REPLACE_1, replace("010-1234-5678", '-','') REPLACE_2;
select '010-1234-5678' as BEFORE
, REPLACE('010-1234-5678', '-',' ') as REPLACE1
, REPLACE('010-1234-5678', '-') as REPLACE2
from dual;

--q13
select 'Oracle' as ORACLE
, LPAD('Oracle', 10 , '#') as LPAD_1 
, RPAD('Oracle', 10, '*') RPAD_1
, LPAD('Oralce', 10 ) LPAD_2
, RPAD('Oracle', 10 ) RPAD_2 
from dual; -- 채울문자 공백 생략가능

--q14
select RPAD('911225-', 13, '*' ) as RPAD_JMNO 
, RPAD ('010-1234-', 13, '*') as RPAD_PHONE from dual;

--q15
select CONCAT(EMPNO, ENAME), CONCAT(CONCAT(EMPNO, ' : ') 
, ENAME ) 
from emp 
where ENAME = UPPER('Scott');

--Q016 ========== 이해필요
-- TRIM을 이용하여 다음과 같이 공백을 제거하고 출력하시오.
select
   '[' ||  trim(' ■ ■Oracle■ ■ ') || ']' as trim  -- 양쪽공백제거 (중간에 있는공백은 제거하지 않음)
,  '[' ||  trim( LEADING   FROM   ' ■ ■Oracle■ ■ ') || ']' as trim --  앞쪽공백제거
,  '[' ||  trim( TRAILING  FROM   ' ■ ■Oracle■ ■ ') || ']' as trim   --  뒤쪽공백제거
,  '[' ||  trim( BOTH      FROM   ' ■ ■Oracle■ ■ ') || ']' as trim  -- 양쪽공백제거
from   dual;

select
   '[' ||  trim(' ■ ■Oracle■ ■ ') || ']' as trim  -- 양쪽공백제거 (중간에 있는공백은 제거하지 않음)
,  '[' ||  ltrim(' ■ ■Oracle■ ■ ') || ']' as trim -- 왼쪽공백없애기
,  '[' ||  rtrim(' ■ ■Oracle■ ■ ') || ']' as trim -- 오른쪽공백제거
,  '[' ||  trim(' ■ ■Oracle■ ■ ') || ']' as trim  -- 양쪽공백제거
from   dual;

--Q017  RIM을 이용하여 삭제할 문자 삭제후
select
   '[' ||  trim(' ■ ■Oracle■ ■ ') || ']' as trim1   
,  '[' ||  trim( LEADING  '■' FROM   '■ ■Oracle■ ■') || ']' as trim2  
,  '[' ||  trim( TRAILING '■' FROM   '■ ■Oracle■ ■') || ']' as trim3    
,  '[' ||  trim( BOTH     '■' FROM   '■ ■Oracle■ ■') || ']' as trim4  
from   dual;   -- '■ ■Oracle■ ■'

--Q018  .....
select
   '[' ||      trim(' ■ ■Oracle■ ■ ')         || ']' as trim0     -- trim 양쪽공백없애기
,  '[' ||      ltrim(' ■ ■Oracle■ ■ ')        || ']' as ltrim1    -- ltrim 왼쪽공백없애기
,  '[' ||      ltrim('■-Oracle-■' , '■')      || ']' as ltrim2  -- ltrim 원하는문자열없애기
,  '[' ||      rtrim(' ■ ■Oracle■ ■ ')        || ']' as rtrim1    -- rtrim 오른쪽공백없애기
,  '[' ||      rtrim('■-Oracle-■' , '■')      || ']' as rtrim2  -- rtrim 원하는 문자열없애기
from   dual;