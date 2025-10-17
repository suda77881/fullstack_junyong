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

-- 19번에서 44번은 훑고 
-- ex문제위주로

-- Q019
--ROUND를 이용하여 반올림 된 숫자 출력하기
select  round(1234.5678)     r 
,       round(1234.5678 , 0) r1
,       round(1234.5678 , 1) r2
,       round(1234.5678 , 2) r3
,       round(1234.5678 , -1) "r4 -숫자제거"
,       round(1234.5678 , -2) r5
from    dual;

-- Q020
--TRUNC를 이용하여 반올림 된 숫자 출력하기
select  TRUNC(1234.5678)     "r 버리기 "
,       TRUNC(1234.5678 , 0) r1
,       TRUNC(1234.5678 , 1) r2
,       TRUNC(1234.5678 , 2) r3
,       TRUNC(1234.5678 , -1) "r4 -숫자제거"
,       TRUNC(1234.5678 , -2) r5
from    dual;

-- Q021 ceil , floor
--          4              3             -3            -4
select ceil(3.14)  , floor(3.96) , ceil(-3.14)  , floor(-3.96)
from   dual;

-- Q22  MOD
--   10을 3으로 나눴을때 나머지  , 10을 2로 나눴을때 나머지 , 
select   mod(10,3)                 , mod(10,2)          , mod(10,4) 
from     dual;

-- Q23  SYSDATE 함수를 사용하여 날짜 출력 - 하루이전, 이후
select  sysdate 오늘 ,   sysdate-1 어제 , sysdate+1 내일
from dual;


-- Q24 ADD_MONTHS 3개월
select sysdate, add_months()
from   dual;

-- Q25 -- [ADD_MONTHS 연습문제] 
-- EMP 테이블에서 입사 10주년 (1년 12, 10년 12*10)이 되는 사원들의 데이터

select empno, ename, hiredate, add_months( hiredate, 120 ) "10주년"
from emp;
-- sysdate, next_day, add_months , last_day
-- Q026
--EMP 테이블에서 입사 42년 미만인 사원데이터를 출력하시오.
--12*42 = 504
--42년이 지나 안나올 수 도 있음. 안나오면 개월수 늘려서 테스트해볼것

select empno , ename, hiredate, sysdate, add_months( hiredate, 504 ) "42년"
from emp
where add_months( hiredate, 504 ) > sysdate;

-- Q027
-- 24/12/21 기준으로 다음과 같이 구분
-- EMP 테이블에서 HIREDATE와 SYSDATE사이의 개월수를 출력하시오.
-- empno , ename, hiredate, sysdate, months1, months2, months3
select empno , ename, hiredate, to_date('2024-12-21' , 'YYYY-MM-DD')
,    MONTHS_BETWEEN ( hiredate, to_date('2024-12-21', 'YYYY-MM-DD')    )  months1
,    MONTHS_BETWEEN ( to_date('2024-12-21', 'YYYY-MM-DD') , hiredate )  months2
,    TRUNC (    MONTHS_BETWEEN ( to_date('2024-12-21' , 'YYYY-MM-DD') , hiredate   )    )   months3
from emp;

-- Q028 SYSDATE, ADD_MONTHS , NEXT_DAY / LAST_DAY / MONTHS_BETWEEN
-- 돌아오는 요일에 해당하는 날짜와 달의 마지막 날짜를 자도으로 계산산
select sysdate , next_day(sysdate , '월요일'   ) , LAST_DAY(SYSDATE)
from dual;

-- Q029 -- ROUND ( 반올림 기준 )
select sysdate
, ROUND(  SYSDATE , 'CC' ) "CC 세기 - Century"
, ROUND(  SYSDATE , 'YYYY' ) "YYYY - ★ Year"
, ROUND(  SYSDATE , 'Q' ) "Q - 분기 " 
, ROUND(  SYSDATE , 'DDD' ) "DDD - 연중일수"
, ROUND(  SYSDATE , 'HH' ) "HH 시간"
FROM    DUAL;

-- Q030 -- trunc ( 버리기 )
select sysdate
, trunc(  SYSDATE , 'CC' ) "CC 세기 - Century"
, trunc(  SYSDATE , 'YYYY' ) "YYYY - ★ Year"
, trunc(  SYSDATE , 'Q' ) "Q - 분기 " 
, trunc(  SYSDATE , 'DDD' ) "DDD - 연중일수"
, trunc(  SYSDATE , 'HH' ) "HH 시간"
FROM    DUAL;

-- Q031 숫자와 문자열을 더하여 출력하시오
-- empno 숫자 + '500' ( 문자열 500이지만, 알파벳포함X A) = 자동변환
select empno, ename , empno + '500'
from emp
where ename='SCOTT';

select empno, ename , empno + TO_NUMBER( '500' )
from emp
where ename='SCOTT';

-- Q032 문자열과 숫자를 더하여 출력하시오. 오류가 난다면 그이유를 적으시오.
select empno, ename , empno + '500a'
from emp
where ename='SCOTT';

-- Q33. sysdate
select sysdate, to_char( sysdate, 'YYYY/MM/DD HH24:MI:SS')
from dual;


-- Q34 ~ 38
    
-- Q6-34
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;

-- Q6-35
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;

-- Q6-36
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;

-- Q6-37
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;

-- Q6-38
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;
    
-- Q39 숫자 - '숫자로만 이뤄진 문자열 ' 연산 가능
select 1300 - '1500' , '1300' + 1500
from dual;

-- Q40 '숫자로만 이뤄진 문자열'
select 1300 - '1500' , '1300' + 1500
from dual;

select '1500' - '1300'
from dual; -- X

-- Q41. TO_NUMBER
select TO_NUMBER('1,500' , '999,999') - TO_NUMBER('1,300', '999,999')
from dual;

-- Q42. TO_CHAR
select  TO_DATE( '2025-10-17', 'YYYY-MM-DD' )
from    dual;


-- Q6-43
SELECT *
  FROM EMP
 WHERE HIREDATE > TO_DATE('1981/06/01', 'YYYY/MM/DD');

-- Q6-44
SELECT TO_DATE('49/12/10', 'YY/MM/DD') AS YY_YEAR_49,
       TO_DATE('49/12/10', 'RR/MM/DD') AS RR_YEAR_49,
       TO_DATE('50/12/10', 'YY/MM/DD') AS YY_YEAR_50,
       TO_DATE('50/12/10', 'RR/MM/DD') AS RR_YEAR_50,
       TO_DATE('51/12/10', 'YY/MM/DD') AS YY_YEAR_51,
       TO_DATE('51/12/10', 'RR/MM/DD') AS RR_YEAR_51
  FROM DUAL;

----------------------------------------------------------------------------------------

--힌트1) 
-- Ex1. EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.
--EMP 테이블에서 ENAME이 다섯글자 이상이며 여섯글자 미만인 사원을 조회하시오.
--MASKING_EMPNO 는 EMPNO 앞두자리외 뒷자리를 *로 출력
--MASKING_ENAME 는 사원이름의 첫글자만 보여주고 나머지는 *로 출력
--※ 앞자리 추출 - SUBSTR(문자열, 어디에서, 몇개)
--※ RPAD - RPAD( 문자열, 몇자리, 채울값)

-- Step1)   select     from   where  구문적기
-- Step2)   from  채우기
-- Step3)   where  채우기  -  ENAME이 다섯글자 이상이며 여섯글자 미만인 사원을 조회
--          length(ename)  이상  5   그리고      length(ename)  이하 6
-- Step4)   오른쪽채우기 rpad  (  substr(empno에서 , 첫번째부터, 2글자  )  , 4자리 맞추기 , '*'로 채우기   ) 

select empno , rpad( substr( empno, 1,2 ) , 4   ,'*'             )   MASKING_EMPNO  
      , ename , rpad( SUBSTR( empno, 1,1 ), length(ename)  , '*'   )   MASKING_EMPNO
from emp
where length(ename) >= 5 and length(ename) <6; --ENAME 이 다섯글자 이상이며 여섯글자 미만인 사원을 조회


--힌트2)  -- EX002
--EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.
--EMP 테이블에서 사원들의 월 평균 근무일 수는 21.5일
--2 하루 근무시간을 8시간으로 보았을때 사원들의 하루급여(DAY_PAY) 와 시급(TIME_PAY)을 계산하여 결과를 조회하시오.
--※ 하루급여는 소수점 세번째 자리에서 버리고(TRUNC), 시급은 두번째 소수점에서 반올림(ROUND)하시오 --##

-- Step1)   select     from   where  구문적기
-- Step2)   from  채우기
-- Step4)   select 채우기    -  trunc( 급여(sal)/21.5  , 2 )  소수점 버리기 /  round( 급여(sal)/21.5/8 , 1   )
-- 한달급여 sal
-- 일일급여 sal/21.5        시급 sal/21.5/8

select empno, ename, sal, trunc( sal/21.5 ,2) day_pay , round(sal/21.5/8 , 1) time_pay
from   emp;

--where

--힌트3)  --EX003
---  EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오. 
--1. EMP테이블에서 사원들은 입사일(HIREDATE)을 기준으로 3개월이 지난 후 첫 월요일에 정직원이 됨
--2. 사원들이 정직원이 되는 날짜(R_JOB)를 YYYY-MM-DD 형식으로 오른쪽과 같이 출력하시오.
--3. 추가 수당(COMM)이 없는 사원들의 추가수당은 N/A로 출력하시오.

-- Step1)   select     from   where  구문적기
-- Step2)   from  채우기
-- Setp3)   입사일(HIREDATE)을 기준으로 3개월이 지난 후 첫 월요일에 정직원이 됨  ADD_MONTHS(HIREDATE, 3)  3개월뒤
--           첫월요일   - NEXT_DAY(ADD_MONTHS(HIREDATE, 3), '월요일')
--           문자열로   - TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE, 3), '월요일'), 'YYYY-MM-DD')
--          추가수당이 있는지 확인      NVL(  TO_CHAR(COMM)  , 'N/A'  ) null 이라면 'N/A'

select  empno, ename, hiredate
    , TO_CHAR(NEXT_DAY(ADD_MONTHS(HIREDATE,3) , '월요일') , 'YYYY-MM-DD')  R_JOB   -- 1부터 7까지 넣을수있음.
    --  3개월이 (ADD_MONTHS) / 첫 월요일 NEXT_DAY ( 날짜 , '월요일' ) 1-7 '일'(1) '월'(2) / TO_CHAR YYYY-MM-DD 
    , NVL( TO_CHAR( COMM ) , 'N/A' ) COMM
from    emp;


--힌트4) --Ex004) EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.
--1. 직속상관의 사원번호(MGR)를 다음과 같은 조건을 기준으로 변환해서 CHG_MGR열에 출력하시오
--1) 직속상관의 사원번호가 존재하지 않을경우 : 00000
--2) 직속상관의 사원번호 앞 두자리가 75일 경우 : 5555
--3) 직속상관의 사원번호 앞 두자리가 76일 경우 : 6666
--4) 직속상관의 사원번호 앞 두자리가 77일 경우 : 7777
--5) 직속상관의 사원번호 앞 두자리가 78일 경우 : 8888
--6) 그 외 직속상관 사원번호의 경우 : 본래 직속상관의 사원번호 그대로 출력

-- Step1)   select     from   where  구문적기
-- Step2)   from  채우기
-- Step3)   case  when   then  end   구문 채우기
--      case   처리대상(mgr)
--          when   사원번호가 존재하지 않을경우(mgr  is null)  then   '00000'
--          when   직속상관의 사원번호 앞 두자리(문자열일부분)   substr(  mgr , 첫글자부터(1), 몇개(2) ) = '78'   then   '8888'
--          when   직속상관의 사원번호 앞 두자리(문자열일부분)   substr(  mgr , 첫글자부터(1), 몇개(2) ) = '77'   then   '7777'
--          when   직속상관의 사원번호 앞 두자리(문자열일부분)   substr(  mgr , 첫글자부터(1), 몇개(2) ) = '76'   then   '6666'
--          when   직속상관의 사원번호 앞 두자리(문자열일부분)   substr(  mgr , 첫글자부터(1), 몇개(2) ) = '75'   then   '5555'
--          else   to_char(mgr)
--      end   CHG_MGR

--ex 004 )
--

select  empno, ename, mgr, # chg_mgr
case MGR
when mgr is null then '00000'
when substr( mgr , 1, 2 ) = '78' then '8888' 
when substr( mgr , 1, 2 ) = '77' then '7777' 
when substr( mgr , 1, 2 ) = '76' then '6666' 
when substr( mgr , 1, 2 ) = '75' then '5555' 
else to_char(mgr)
end chg_mgr
from  emp;

--where
----------