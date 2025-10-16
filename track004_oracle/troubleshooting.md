
# 📌 트러블슈팅 
<br/>


**■ SQL**
=

<br/>
<br/>

<!-- 25.10.16 -->

<br/>

## case.20	//	SQL 사용시 자료형 불일치 문제

```SQL

-- scott

select nvl( NULL   , '대체값')              from  dual; -- null 이면 대체값         / null  value   logic ( replacement )
select nvl(         comm     , '입력안됨.') from   emp; -- x 오류
select nvl( to_char(comm)    , '입력안됨.') from   emp; -- o 자료형을 맞춰야함.

select nvl2( NULL, 'A' , 'B' )   from dual; -- null 일때 b, 아니면 a

select nvl2( mgr,          mgr,  '--' )   from emp; -- 오류나는 이유는? 매개변수가 값, ture(null) 인경우 표시값, false(null) 인경우 표시값 을 입력해야한다.
select nvl2( mgr,  to_char(mgr),  '상위관리자 x' )   from emp; -- 해결방안 to_char로 문자열로 변환시켜 자료형을 일치시킨다.    (nvl nv2 null일 때 값 반환 / 자료형 맞추기)

```
함수 nvl, nvl2는 현재 변수의 상태가 null 인지 검사해주는 변수 이다, 값이 null 일때, true값과 false값을 각각 반환하는 파라미터로 되어있는데, 이 때 사용법 `select nvl(comm , '입력안됨.') from emp;` 형태이다, 그러나  `ORA-01722: invalid number` 에러가 발생했다.

<!-- 문제 설명 -->

<br/>

### 원인

```sql
select nvl(         comm     , '입력안됨.') from   emp; -- x 오류
```
Java에서 자료형을 캐스팅을 통해 일치 시키는 것처럼 이때 파라미터상에서도 자료형이 같아 오류가 발생하지 않는다.
<!-- 원인 설명 -->


<br/>

### 해결방법

```Java
case 3 : {
    System.out.print("제거할 아이스크림 이름: ");
    String tempName = sc.next();
    int no = -1;

    for (IceCreamDTO i : ice) {
        if (i.getName().equals(tempName)) {
            no = i.getNo();
        }
    }

    if (no != -1) {
        ice.remove(no);
        System.out.println("제거 완료!");
    } else {
        System.out.println("해당 아이스크림이 존재하지 않습니다.");
    }
    break;
}

```
반복문 내에서 직접 제거하지 않고, 먼저 제거할 대상의 번호를 저장한 뒤 반복문이 끝난 후 remove()를 호출함으로써 문제를 해결하였다.

<!-- 해결방법 -->

<br/>

#### 배운점

> 반복문을 사용해 리스트를 순회할 때는, 요소 제거를 반복문 내부에서 직접 수행하지 말고, 반복이 끝난 후 처리하는 것이 안전하다는 점을 배웠다.
<!-- 배운점 느낀점 연관되어서 설명 -->

---
<br/> 
<br/>