**⚙트러블슈팅**
---


**■ Git & Github**
---
---

**■ HTML**
---
---

**■ CSS**
---
---


**■ Java**
---
---

**20250828**

---

- 오류메세지:

    >Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
   Syntax error on token ""+"", invalid AssignmentOperator
   at com.company.java002_ex.VarEx002.main(VarEx002.java:15)
a = b;
System.out.println(a"+"b);

실행 값 : **System.out.println(a"+"b);**

결과값을 **a+b(a==b)**로 기대했으나, 트러블 슈팅이 발생함

---

🔍 오류 메시지 분석
>    Exception in thread "main" java.lang.Error: Unresolved compilation problem:  
    Syntax error on token ""+"", invalid AssignmentOperator


핵심 오류:
- "+"라는 토큰에서 **문법 오류(Syntax error)**가 발생했다는 뜻
- 자바가 "+"를 **대입 연산자(=)**처럼 해석하려다가 실패한 상황
- 즉, 문자열 연결이나 출력 구문에서 잘못된 문법이 들어간 거예요

✅ 가장 흔한 원인
System.out.println(""+"");  // ← 이런 식으로 작성했을 경우


- 빈 문자열끼리 +로 연결하려고 했지만, 따옴표나 연산자 위치가 잘못되었거나, 전체 문장이 잘못 구성되었을 가능성이 높아요

🛠️ 해결 방법
- 문자열 연결 구문 확인하기
- "" + ""는 문법적으로 가능하지만, 불필요하거나 잘못된 위치에 있으면 오류 발생
- 예를 들어 아래처럼 작성하면 오류가 납니다:
String result = ""+;  // ❌ 잘못된 대입
- 출력 구문을 명확하게 작성하기
System.out.println("X" + "Y");         // ✅ 출력: XY
System.out.println("" + "XYZ");        // ✅ 출력: XYZ
System.out.println("Hello " + "World"); // ✅ 출력: Hello World
- 변수와 문자열 연결 시에도 주의
String name = "Jack";
System.out.println("이름: " + name);  // ✅ 정상 출력



💡 추천 점검 포인트
- + 연산자 앞뒤에 문자열 또는 변수가 제대로 들어갔는지 확인
- ""+""처럼 의미 없는 연결은 제거하거나 명확하게 작성
- System.out.println() 안에 쉼표(,) 대신 +를 사용해야 함

>**해결방법** : **System.outprintln(a"+"b);** 에서
**System.outprintln(a+"+"+b);** 로 문법에 맞춰 수정하여 기대한 출력 값을 얻음 

느낀점 : 문법 문제로인해 발생한 오류였음, 자바 문법이 굉장히 어렵다고 느낌.

---