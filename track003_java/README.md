
<!-- 주석 -->

<br/>
<br/>

# Contact & Link
<br/>


<image src="./me.png" alt="프로필" width="200">

<br/>
<br/>

|이름|신준용|
|-|-|
|Email|boody123@naver.com|
|Github|https://github.com/suda77881/fullstack_junyong|



<br/>
<br/>
<br/>

## 자기소개

<!--  -->

<span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;"> 🖐 안녕하세요 🖐 <br/><span style="color:red">문제 해결과 협력,</span> 그리고 <span style="color:red">기능 구현</span>의 효율성을 추구하는</span><span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold; text-decoration:underline"><br/>주니어 백엔드 개발자 지망생</span> <span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold; color:steelblue">신준용 </span> <span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;">입니다.</span><br/><span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;">전방위 기술 스택을 실무에 도입하여<br/>개발자간의 원할한 협업과 서비스 개선을 실현하려고 노력중입니다 😎</span>



<!-- <pre style="color:red">문제 해결과 더나은 유저 경험을 위해
사용자 경험 인터페이스를 구현하고, 맞춤형 인터페이스 </pre> -->

<!-- JAVA, HTML+CSS+JS/JQUERY .... -->
<!-- ##포트폴리오 
## 🧩 실전형 풀스택 개발자 포트폴리오

> 완벽보다는 완성을 향해  
**기획부터 배포까지, 사용자 흐름을 설계하고 끝까지 해결하는 개발자**
> 프론트엔드부터 백엔드, 인프라까지  
**전방위 기술 스택을 실전에서 다뤄본 경험**으로  
기획-개발-배포 전 과정을 주도하며  
**사용자 중심의 제품 개발**을 실현합니다.
---
## 기술스택 기반 cs역량

--- -->

<br/>
<br/>
<br/>


<!-- 1,2일 차에 넣은 트러블슈팅들 -->

<br/>
<br/>
<br/>

# 📌 Golds

<br/>

- <span style="font-weight:bold; font-size:16px">Git & GitHub</span> 

- <span style="font-weight:bold; font-size:16px">Java</span>

- <span style="font-weight:bold; font-size:16px">VS Code</span>

- <span style="font-weight:bold; font-size:16px">AI (Copilot, ChatGPT)</span>

- <span style="font-weight:bold; font-size:16px">HTML5 & CSS3</span>

- <span style="font-weight:bold; font-size:16px">Markdown</span>

<br/>
<br/>




<div class="stack java card">

|<Strong> Java </Strong>|
|-|
|Class 작성과 기본구조 학습|
|출력문의 종류와 출력 문법 학습|
|변수 종류, 저장 크기와 데이터 보장 범위 학습|
|변수 타입과 캐스팅(형변환) 학습|
|AI를 통한 문제 해결방법 학습|
|제어문과 삼항 연산자 학습|
|Scanner를 통한 사용자 입력방법 학습|
|연산자를 통한 값 계산 및 비교, 연산 우선순위 학습 |
|반복문과 switch를 통해 제어문 학습|
|for문을 while, do while문으로 변환하여 동일한 실행문 수행 및 문법 구조 학습 |
|배열과 반복문을 통한 변수 입 / 출력 학습|

</div>

<br/>
<br/>
<br/>

<div class="stack Github card">

|<Strong> Github & Git </Strong>|
|-|
|markdown 문서 작성 학습|
|브런치를 활용한 팀 프로젝트 구조 학습|
|외부 기여 방식의 프로젝트 참여방법 학습|

</div>



<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>



# 📌 트러블슈팅 
<br/>


**■ Java**
=

<br/>
<br/>



## case.1	//	(문법) 연결 연산자 누락

<!-- *2025.08.28* -->

```
Java

    Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
   Syntax error on token ""+"", invalid AssignmentOperator
   
a = b;
System.out.println(a"+"b);
```


<br/>

### 원인 

```
Java

System.out.println( a "+" b );
```

출력구문의  `(a "+" b);` 문법 오류, 이러한 형태로 작성된 경우 `+` 를 자바가 **문자열 연결 연산자**로 인식하여 `ab`라는 출력값을 만들려고 시도했으나 문법적으로 잘 못되어 오류가 발생함.


<br/>

### 해결방법 

```
Java

System.out.println(a + "+" + b);	//	연결 연산자 + 추가
```
문법 오류를 해결하려면 `변수 + "문자열" + 변수` 구조로 수정해주면 해결된다.

<br/>
<br/>

### 배운점 

> 출력문에서 변수, 연산자, 문자열을 연결할 때는 단순히 나열하는 것이 아니라 + 연산자를 사용해 명시적으로 연결해야 문법 오류를 피할 수 있다. 이를 통해 자바에서 문자열 연결 연산자의 중요성과 역할을 정확히 이해하게 되었다.


<br/>
<br/>
<br/>


<!-- *2025.09.06* -->

<br/>

## case.2	//	import 선언 누락

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Scanner cannot be resolved to a type
	Scanner cannot be resolved to a type
```

<br/>


### 원인

```
Java

package com.company.java002;

public class input1 { 
...
```

자바가 `Scanner 클래스 인식하지 못해서 발생한 문제`. 외부 클래스를 임포트 하지 않은 상태 따라서 main 메서드에서 사용 불가능.

<br/>

### 해결방법 

```
Java

package com.company.java002;

import java.util.Scanner;		//	Scanner import 구문 추가

public class input1 { 

...
 ```
 
 자바가 Scanner를 인식할 수 있도록, 패키지 선언과 현재 클래스 정의 사이에 `import java.util.Scanner;` 구문을 추가한다.

<br/>

### 배운점

> 외부 클래스를 사용할때, import 과정을 생략하면 자바가 인식하지 못하는 것이 주소도 안 알려주고 편지를 보내는 일과 비슷하다고 생각했다.

<br/>
<br/>
<br/>

## case.3	//	char 변수 문법 누락

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	z cannot be resolved to a variable
	a cannot be resolved to a variable
	Z cannot be resolved to a variable
	A cannot be resolved to a variable
```


<br/>



<br/>


### 원인

```
Java

if (ch <= z && ch >= a ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}
else if (ch <= Z && ch >= A ){System.out.println("당신이 입력한 문자는 대문자입니다.");}
```

특정 변수 사용시 그에 따른 문법이 필요한데 char형 변수가 그에 해당한다.

<br/>

### 해결방법

```
Java

if (ch <= 'z' && ch >= 'a' ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}	//	char형 변수와 계산할 값을 ''로 감싸준다.	
else if (ch <= 'Z' && ch >= 'A' ){System.out.println("당신이 입력한 문자는 대문자입니다.");}
```

### 배운점

> long변수 값 뒤에 L, float변수 값 뒤에 f를 붙이는 것처럼 char 변수 사용시 특정 문법이 필요한 것을 배웠다.

<br/>

## case.4	//	전원부 선언시 문법 오류

```
Java

오류: com.company.java004_ex.IfEx004 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.

 전원부 작성시 String[]로 선언되지 않았을때 발생하는 문제
```

<br/>

### 원인

```
Java

public Static void main(String args){
...
```

전원부 선언시 문법 오류로 발생한 문제다.

<br/>

### 해결방법

```
Java

public Static void main(String[] args){		//	문법 오류를 해결해준다.
...
```

String 뒤에 `[]`를 추가하여 문법 오류를 해결 해준다.

<br/>

### 배운점
> 배열기호 `[]`를 누락 시켰기 때문에 문제가 발생했다. 문자열을 여러개 받을 수 있는 배열을 의미하며 누락시 명령줄 인자를 전달 받을 수 없기 때문에 컴파일 오류가 발생했다는 점을 배웠다.

<!-- - 자바에서 main() 메서드를 선언할 때 String[] args처럼 배열 기호 []를 반드시 포함해야 한다.
- 이 배열은 프로그램 실행 시 외부에서 전달되는 여러 개의 문자열 인자를 받을 수 있게 해준다.
- 배열 기호를 생략하면 자바가 main()을 올바른 시작점으로 인식하지 못해 컴파일 오류가 발생한다.
- 이 과정을 통해 배열 기호의 중요성과 자바의 진입점 구조를 배웠다는 의미. -->

<br/>

## case.5	//	for문 세미콜론 사용 문제

```
Java

for (int i = 0; i < 5; i++); {
    System.out.println("Hello");
}
```
5회 반복문을 작성후 실행했지만, 출력문의 Hello가 한번만 출력되는 문제 발생,
컴파일 에러는 발생하지 않았지만 의도한 기능과 다르게 실행되었다.

<br/>

### 원인

```
Java

for (int i = 0; i < 5; i++); {		//	for (변수선언; 종료조건; 증감식) {실행문;} 형태로 작성되어야함
    System.out.println("Hello");
}
```
반복문 사용시 잘못된 위치에 `;(세미콜론)`이 반복문의 본문을 비워 버리게되어 발생한 문제.



<br/>

### 해결방법

```
Java

for (int i = 0; i < 5; i++) {		//	;(세미콜론) 제거
    System.out.println("Hello");
}
```
잘못된 위치에 작성된 세미콜론을 제거한다.



<br/>

#### 배운점

> 습관적으로 `';'`(세미콜론)을 붙이게 되지만, 대신 클래스나 메서드의 본문, 블록 `'{ }'`을 사용하는 경우도 있으니 의미를 알고 사용하는 것이 중요하다는 것을 배웠다. 


<br/>

## case.6	//	for문 중복된 case 값

```
Java

int num = 2;
switch (num) {
    case 1:
        System.out.println("One");  
		break;
    case 1:
        System.out.println("Also One");
        break;
}
```

case에 중복된 값이 입력되면서 컴파일 에러가 발생했다.

<br/>

### 원인

```
Java

int num = 2;
switch (num) {
    case 1:			//					case 1로 조건 분기
        System.out.println("One"); 
		break;
    case 1:			//					다시 같은 값으로 조건 분기
        System.out.println("Also One");
        break;
}
```

switch문은 각각의 case를 독립된 값을 써야 그에 맞는 조건분기가 이루어지기 때문에 중복된 값으로는 실행되지 않는다.



<br/>

### 해결방법

```
Java

int num = 2;
switch (num) {
    case 1:
        System.out.println("One");  
		break;
    case 2:			//					case 1과 겹치지않게 다른값으로 변경해준다.
        System.out.println("Also One");
        break;
}
```
해결방법은 두가지가 있다. `중복된 case 값을 다른 값으로 변경`, `해당 case 분기를 삭제` 하는것이다.


<br/>

#### 배운점

> switch문도 그렇지만 if문이나 for문에서도 중복된 조건이 else if, i값으로 존재하면 한쪽의 실행문이 정상적으로 작동안하거나, 무한 루프에 빠지는 상황이 생길 수 있다는 것을 알게되었다.


<br/>
<br/>
<br/>

<br/>

 반복문으로 인한 Unreachable code 경고 발생

```
Java

Unreachable code
```
해당 에러 메세지는 for문 아래에 위치한 구문에 생성되며, 해당 줄에 붉은색 밑줄이 표시됨.

<br/>

### 원인

```
Java

for (;;){
    System.out.print("출력테스트");
}

System.out.println("");     //      경고가 발생하며 빠른 수정 제안으로 코드 제거가 추천된다.
...
```

for문에 반복 종료 조건이 설정되지 않아 자바 컴파일러는 for문 이후 작성된 코드가 `절대로 실행되지 않는다고 판단`하여 경고가 표시된다.



<br/>

### 해결방법

```
Java

for (int i=5; i >= 1; i--){       //      for문 탈출 조건 설정으로 무한반복과 경고 해결
    System.out.print("출력테스트");
}

System.out.println(""); 
...
```
for문에 `반복 종료 조건`을 명시하거나 루프문 내부에 `break`를 추가하면 이후 코드에도 도달할 수 있다고 판단하여 경고가 사라지고 무한 반복 현상도 해결된다.

<br/>


<br/>

## case.8       // 주석 문법 오류  

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
```
에러메세지의 내용은 main 스레드에서 예외가 발생했고, 심각한 오류로 컴파일이 제대로 진행되지 않았음을 의미하며 컴파일 오류가 해결되지 않은 상태에서 실행을 시도했다 라는 내용이다.


<br/>

### 원인

```
Java

/* 
    * Step1. 무한반복으로 만드는 메뉴 만들기 
    * for(;;){//1-1 무한반복} 1-2 빠져나올조건 9 1-3 입력받은_입력받기 
    ...
        //비밀번호입력 > _입력받기 //잔액입력 > _입력받기 ///
*/
*/       ←  이 부분
```

블록 또는 주석의 시작과 끝이 짝이 맞지 않으면 발생하는 문제.


<br/>

### 해결방법

``` 
Java

/* 
    * Step1. 무한반복으로 만드는 메뉴 만들기 
    * for(;;){//1-1 무한반복} 1-2 빠져나올조건 9 1-3 입력받은_입력받기 
    ...
        //비밀번호입력 > _입력받기 //잔액입력 > _입력받기 ///
*/
       ←  짝이 안맞는 부분 제거
```

불필요한 주석 종료 부분을 제거하면 해결된다.


<br/>



### 배운점
> 이번 코딩에서 시작과 끝 맺음이 상당히 중요하다고 배웠다.
코드가 전체가 문제가 생기는 일도 있어서 심각한 오류다.


<br/>


<!-- 이후 용어적 수정필요 좀더 이해필요 -->

## case.8   //    Scanner 입력 스트림 누락 

```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
   The constructor Scanner() is undefined
   Syntax error, insert "( )" to complete Expression
```
컴파일에 실패하고 new Scanner 부분에 The constructor Scanner() is undefined(Scanner객체를 생성할 때 잘못된 방식으로 생성자 호출) 가 표시되는 오류가 발생했다.

<br/>

### 원인

```
Scanner sc = new Scanner();     //   오류가 발생된 부분
```
Scanner() 생성자 호출시 입력스트림이 누락되어 오류가 발생한 것이다.
Scanner는 사용자의 입력을 처리하기 위해 입력 소스가 반드시 필요하다.



<br/>

### 해결방법

```
Scanner sc = new Scanner(System.in);     //  빈 생성자 호출부분에 System.in을 입력
```
new Scanner이후에 ()안에 입력스트림을 작성해준다. 이때 **System.in** 키보드 입력을 의미하는 표준입력 스트림이다.




<br/>

#### 배운점
> 처음에 배운 Scanner의 기본적인 구조에서 System.in이 어떤 역할을 하는 입력스트림인지 알게되었다. 그리고 Scanner구조상 입력스트림을 누락시키면 동작하지 않는다는 것을 배웠다.

<!-- 이후 용어적 수정필요 -->


<!-- 표현 개선 제안
|  |  | 
| Scanner객체를 생성할 때 잘못된 방식으로 생성자 호출 | Scanner 객체를 생성할 때 입력 스트림을 지정하지 않아 컴파일러가 적절한 생성자를 찾지 못함 | 
| new Scanner()에 입력스트림이 누락되어 발생된 문제. | new Scanner() 호출 시 입력 스트림이 누락되어 컴파일 오류가 발생함. | 
| Scanner는 사용자의 입력값을 반환하기 위해 입력 소스가 반드시 필요하다. | Scanner는 사용자 입력을 처리하기 위해 반드시 입력 소스를 지정해야 한다. | 
| 빈 생성자 호출부분에 System.in을 입력 | 입력 스트림이 없는 생성자 대신 System.in을 전달하여 Scanner 객체를 생성 | 
| new Scanner이후에 ()안에 입력스트림을 작성해준다. | new Scanner() 호출 시 괄호 안에 입력 스트림을 명시해야 한다. | 
| System.in 키보드 입력을 의미하는 표준입력 스트림이다. | System.in은 키보드 입력을 의미하는 자바의 표준 입력 스트림이다. |  -->


<br/>

## case.9   //    

```

```

<br/>

### 원인

```

```



<br/>

### 해결방법

```

```



<br/>

### 배운점
> 


---
<br/> 
<br/>

## 🔧 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)
