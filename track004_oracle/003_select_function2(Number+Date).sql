------------------------------------------------------------------------------------
-- 003_select_function.sql
-- 1. 문자열
-- 2. 숫자    :   round / trunc ( 반올림/버림), ceil(올림) , floor (내림) , mod (나머지)
-- 3. 날짜    :   sysdate(날짜계산) (시스템날짜), add_months(몇달뒤에), next_day, last_day 마지막날
-- 4. 변환    :   to_char (날짜형식변환) , to_date 
-- 5. 조건    :   decode, case, nvl, nvl2
------------------------------------------------------------------------------------
-- 2. 숫자    :   round / trunc(반올림/버림), ceil(올림), floor(내림), mod(나머지)

select 

    round( 1234.5678 ) --1235   
,   round( 1234.5678 , 2) --1234.57
,   trunc( 1234.5678 , 2) --1234.56 무조건 버림

,   ceil(1.1) -- 2 
,   floor(4.8) -- 4
,   mod(10,3) -- 1

from dual;


------------------------------------------------------------------------------------
-- 3. 날짜    :   sysdate(날짜계산) (시스템날짜), add_months(몇달뒤에), next_day, last_day 마지막날
select  sysdate , add_months ( sysdate, 2)  , months_between(   '25-12-1'   , '24-12-1' ) -- 달차이계산
from    dual;

select 
    NEXT_DAY(SYSDATE, '월요일') --다음주 월요일 
,   LAST_DAY(SYSDATE)    --해당월의 마지막 날짜
from    dual;

select 
    NEXT_DAY(SYSDATE, 1) --다음주 월요일 
,   LAST_DAY(SYSDATE)    --해당월의 마지막 날짜
from    dual;

------------------------------------------------------------------------------------
-- 4. 변환    :   to_char (날짜형식변환) , to_date
--                날짜를      문자로                         문자를          날짜로
select  TO_CHAR( sysdate, 'yyyy-mm-dd' ) ,  TO_DATE (  '2025-10-16' , 'YYYY-MM-DD')
from dual;

--      숫자 1234를 문자열로 변환한 다음 +1 (자동변환해서 오류가 안날수 있음 자료형이 맞아야함)
select  TO_CHAR(1234)                    + 1 ,    TO_NUMBER('5678') + 1
from    dual;

select  TO_CHAR('일이삼사')               + 1 ,    TO_NUMBER('5678') + 1      -- 오류
from    dual;

select              "1234"      + 1 , 1+"1234"       --  자료형이 안맞으면 오류남.
from        dual;


------------------------------------------------------------------------------------
-- 5. 조건    :   nvl, nvl2 ( null) , decode, case ( 조건분기) 

select nvl( NULL   , '대체값')              from  dual; -- null 이면 대체값         / null  value   logic ( replacement )
select nvl(         comm     , '입력안됨.') from   emp; -- x 오류
select nvl( to_char(comm)    , '입력안됨.') from   emp; -- o 자료형을 맞춰야함.

select nvl2( NULL, 'A' , 'B' )   from dual; -- null 일때 b, 아니면 a

select nvl2( mgr,          mgr,  '--' )   from emp; -- 오류나는 이유는? 매개변수가 값, ture(null) 인경우 표시값, false(null) 인경우 표시값 을 입력해야한다.
select nvl2( mgr,  to_char(mgr),  '상위관리자 x' )   from emp; -- 해결방안 to_char로 문자열로 변환시켜 자료형을 일치시킨다.    (nvl nv2 null일 때 값 반환 / 자료형 맞추기)

select decode( deptno, 10, '부서10', 20, '부서20', 30, '부서30')
from   emp;

select case 
           when deptno=10 then '부서10' 
           when deptno=20 then '부서20' 
           when deptno=30 then '부서30' 
           else '부서x'
       end
from   emp;
----
select case deptno
           when 10 then '부서10' 
           when 20 then '부서20' 
           when 30 then '부서30' 
           else '부서x'
       end
from   emp;

------------------------------------------------------------------------------------
-- ##1. 문자열 연습문제    (45~49)
-- https://sally03915.github.io/stackventure_250825/004_oracle/oracle004_select_fn#61

--45
select EMPNO, ENAME, SAL, COMM, SAL+COMM, NVL(COMM,0), SAL+NVL(COMM,0) from emp;

--46
select EMPNO, ENAME, COMM, NVL2(COMM,'O','X'), SAL*12+NVL2(COMM,COMM,0) ANNSAL FROM EMP;

--47
select EMPNO, ENAME, JOB, SAL, 
    decode(JOB
    , 'MANAGER', SAL+(SAL*0.1)      --when then
    , 'SALESMAN', SAL+(SAL*0.05)    --when then
    , 'ANALYST' , SAL               --when then
    , (sal+(sal*0.03))  -- else
    ) UPSAL  
from emp;

--48
select EMPNO, ENAME, JOB, SAL,
        case job
            when 'MANAGER'  THEN SAL+(SAL*0.1) 
            when 'SALESMAN' THEN SAL+(SAL*0.05) 
            when 'ANALYST'  THEN SAL
            ELSE SAL+(SAL*0.03)
            END AS UPSAL
from emp;

--49
select EMPNO, ENAME, COMM,
CASE 
when COMM is NULL then '해당사항 없음' 
when COMM = 0    then '수당없음'
--when COMM > 0    then '수당 : ' || COMM
when COMM > 0    then concat( '수당 : ', COMM)
end AS COMM_TEXT
from emp;

