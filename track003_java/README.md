
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
|다차원 배열을 통한 가로/세로 방향 계산 학습|
|클래스의 상속과 Override 구조 학습|
|method / heap / stack의 변수 클래스 메서드 작업 구조와 사용 범위 학습|
|지정 접근자를 통한 변수 사용범위 제한과 getter setter 학습|
|추상화와 다형성을 이용한 Bank 시스템 설계|

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


## case.7	//	반복문에서 Unreachable code 경고 발생

 

```
Java

Unreachable code
```
해당 에러 메세지는 for문 아래에 위치한 구문에 생성되었고, 해당 줄에 붉은색 밑줄이 표시됨.

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


#### 배운점 
> for을 사용하는 경우 탈출 조건을 만들거나 break; 사용해서 나와야 한다는것을 배웠다.

<br/>
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



#### 배운점

> 이번 코딩에서 시작과 끝 맺음이 상당히 중요하다고 배웠다.
코드가 전체가 문제가 생기는 일도 있어서 심각한 오류다.

<br/>
<br/>
<br/>


<!-- 이후 용어적 수정필요 좀더 이해필요 -->

## case.9   //    Scanner 입력 스트림 누락 

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
<br/>
<br/>


## case.10   //  for문 사용시 인덱스 초과 문제

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

	at com.company.java007_ex.Array2Ex008_3.main(Array2Ex008_3.java:2)
```

<br/>

### 원인

```
        int[][] datas = {	//	datas의 인덱스 범위 [4 x 3]
            {10, 10, 10, 10},
            {20, 20, 20, 20},
            {30, 30, 30, 30}
        };

        int[][] result = new int[datas.length + 1][datas[0].length + 1]; // datas의 인덱스값에서 + 1씩 더한 [4 x 3]



for (int ch = 0; ch < datas.length; ch++) {
            for (int kan = 0; kan < datas[ch].length+1; kan++) {	//	이부분에 data[ch].length+1;
                result[ch][kan] = datas[ch][kan]; 

```

for문 사용시 잘못지정된 인덱스 범위 초과 문제로 저장된 값을 불러오지 못하고 컴파일 에러가 발생했다.



<br/>

### 해결방법

```
for (int ch = 0; ch < datas.length; ch++) {
            for (int kan = 0; kan < datas[ch].length; kan++) {	//	+1을 제거하고 인덱스 범위를 변수에서 불러올 수 있는 범위로 변경해준다.
                result[ch][kan] = datas[ch][kan]; 
```
datas[ch].length+1 일때 kan==4 가 되므로 datas에서 인덱스값 0~3까지만 갖고있기 때문에 동작 가능한 범위로 수정해주면 해결된다.

<br/>

#### 배운점

> 인덱스 범위 지정에 대한 어려움에 대해 많이 느끼고 다시 한번 공부하게되었다.

<br/>
<br/>
<br/>


<!-- 25.09.16 -->


<br/>
<br/>
<br/>

## case.11   //  메서드 return ; 사용시 데드코드 발생

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code

	at com.company.java008.Method003.sign(Method003.java:8)
	at com.company.java008.Method003.main(Method003.java:14)
```

<br/>

### 원인

```
       public static String sign() {
		return "🎭 「전설의_마법의_도끼를_든_초코우유_중독자_용감한_불꽃전사」 🎭";
	System.out.println(".........나짤려요~~............");  //   Unreachable code
	}
    ...
    System.out.println("1. 당신의 이름은? " + sign());
```

return은 메서드를 즉시 종료시키기 때문에, 그 뒤에 있는 코드는 실행되지 않으며 컴파일 오류(Unreachable code)가 발생한다.



<br/>

### 해결방법

```
       public static String sign() {
		return "🎭 「전설의_마법의_도끼를_든_초코우유_중독자_용감한_불꽃전사」 🎭";
	    // Unreachable code 제거
	}
    ...
    System.out.println("1. 당신의 이름은? " + sign());
```
Unreachable code로 된 부분의 코드를 제거하거나, 세미콜론 앞 쪽으로 출력문의 내용을 포함시킨다(이때 호출한 부분이 `System.out.println`의 내용 입력 부분이므로 System.out,print 종류의 출력문을 중복으로 포함 시킬 수 없다.). 

<br/>

### 배운점

> 메서드는 return; 부분에서 종료되므로. 뒷부분을 반환할 수 없다는 점을 알게되었다.




<!-- 에러메시지 2

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	This method must return a result of type int

	at com.company.java008_ex.MethodEx004.return_num(MethodEx004.java:6)
	at com.company.java008_ex.MethodEx004.main(MethodEx004.java:39)



원인 

```

public static int return_num() {return ; } // 리턴으로 돌려줄 값이 비어있음
...
System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); 

```


해결방법 :

```
public static int return_num() {return 1 ; } // return으로 돌려줄 값을 입력한다.
```

배운점 :

>reuturn; 세미콜론 위치에서 리턴이 종료되기 때문에 반환하려면 세미콜론과 return 사이에 담아야한다는 것을 알았다.


<br/>
<br/>
<br/> -->

<br/>
<br/>
<br/>

<!-- 25_09_17 -->

## case.12   //  메서드에서 return ; 제어문 사용시 문제

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	This method must return a result of type String

	at com.company.test.Repeat_0917.stdAvg(Repeat_0917.java:30)
	at com.company.test.Repeat_0917.main(Repeat_0917.java:44)

```

<br/>

### 원인

```
Java

        public static String stdAvg(int score) {
		if (score >= 90) {return "A";}else if (score >= 80) {return "B";}else if (score >= 70) {return "C";}; // 70미만일 때 ?
	}
...
System.out.println("당신의 평균은?" + stdAvg(88)); // B 출력
```

`retrun` 타입이 있는 메서드의 경우 `모든 실행경로에서 값을 반환`해야한다.
이 코드의 경우 score가 70미만일 경우, return 이 실행되지 못하여 발생하는 문제 





<br/>

### 해결방법

```
       public static String stdAvg(int score) {
		if (score >= 90) {return "A";}else if (score >= 80) {return "B";}else if (score >= 70) {return "C";} else return "D"; // 70미만일 때 ?
	}
...
System.out.println("당신의 평균은?" + stdAvg(88)); // B 출력
```

나머지 70미만일 경우의 반환 값을 만들어준다.

### 배운점
> retrun 사용시 반드시 모든 값에 대한 반환이 필요하다는 것을 배웠다.


<br/>
<br/>
<br/>

## case.13   //  메서드 return ; 반환값 누락

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
   This method must return a result of type int

   at com.company.java008_ex.MethodEx004.return_num(MethodEx004.java:6)
   at com.company.java008_ex.MethodEx004.main(MethodEx004.java:39)

```

<br/>

### 원인

```
        public static int return_num() {return ; } // 리턴의 반환 값이 비어있음
    ...
    System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); 
```


<br/>

### 해결방법

```
       public static int return_num() {return 1 ; } //  반환값 데이터를 입력하여  오류를 해결하였다.
    ...
    System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); 
```
return;이 존재하는 경우 반드시 값을 돌려줘야하기 때문에(제어문은 모든 경우의 수를 포함해서) 원하는 값을 입력해준다. 

#### 배운점

> return 사용시에 반환값을 공백으로 두고 사용할 수 없다는 것을 알았다.

<br/>
<br/>
<br/>



## case.14   //  public class의 중복

```
Java 

The public type Coffee must be defined in its own fil
```
Java의 파일-클래스 규칙 때문에 발생하는 컴파일 오류
실행은 IDE에서 자동으로 분리하거나 무시해서 될 수 있지만, 정상적인 구조는 아님.

<br/>

### 원인

```
public class Coffee{
	...
	}
	
	
	}	// class Coffee end 

public class ClassEx003_2 {
	   public static void main(String[] args) {
	   ...
	  }
}
```
하나의 .java 파일에는 public class는 단 하나만 존재해야 하며, 그 클래스의 이름은 파일명과 반드시 일치해야 한다.



<br/>

### 해결방법

```
class Coffee {   // public 제거
	...
	}
	}	// class Coffee end 

public class ClassEx003_2 {
	   public static void main(String[] args) {
	   ...
	  }
}
```
이렇게 하면 public class Coffee가 자기 파일에 정의되므로 오류 없음

#### 배운점

> Class 문서 규칙에 따라 최상위 클래스는 하나의 문서에 public 사용은 한개만 된다는 것을 배웠다. (하위 클래스 예외)
<br/>
<br/>
<br/>



---
<br/> 
<br/>


## case.14   //  public class의 중복

```
Java 

public class Score{
	
    ...

   // 5. iron.show(); hulk.show(); [각각, this] 인스턴스메서드

   public void show() {   
	   
	   process_total(); process_avg (); process_p (); process_s (); process_rank ();
	   
	   System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f\t%-5s\t%-5s\t%-5s\n",name,kor,eng,math,total,aver,p,s,rank);
   }
   
   public void process_total () {this.total = this.kor + this.eng + this.math;}
   public void process_avg () {this.aver = this.total/3.0;}
   public void process_p () {this.p = this.aver >= 60 && this.kor > 40 && this.eng > 40 && this.math > 40 ? "합격" : "불합격";}
   public void process_s () {this.s = this.aver >= 80 ? "장학생" : "---";}
   public void process_rank () {this.rank = "";for(int i = 1; i <= (this.aver/10); i++) {this.rank += "*";}}

   ...
  
   
} 
```
show라는 메서드를 호출 했을때, 연산이 완료된 변수들을 출력해야하지만.
생각한 값과 다르게 초기값이 표시됨.

<br/>

### 원인

```
public class Score{
	
    ...

   // 5. iron.show(); hulk.show(); [각각, this] 인스턴스메서드

   public void show() {   
	   
	   System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f\t%-5s\t%-5s\t%-5s\n",name,kor,eng,math,total,aver,p,s,rank);
   }
   
   
   public void process_total () {this.total = this.kor + this.eng + this.math;}
   public void process_avg () {this.aver = this.total/3.0;}
   public void process_p () {this.p = this.aver >= 60 && this.kor > 40 && this.eng > 40 && this.math > 40 ? "합격" : "불합격";}
   public void process_s () {this.s = this.aver >= 80 ? "장학생" : "---";}
   public void process_rank () {this.rank = "";for(int i = 1; i <= (this.aver/10); i++) {this.rank += "*";}}

   ...
  
   
} 
```
연산을 담당하는 process 메서드가 따로 존재하므로 호출없이는 연산된 결과값을 사용할 수 없다.


<br/>

### 해결방법

```
public class Score{
	
    ...

   // 5. iron.show(); hulk.show(); [각각, this] 인스턴스메서드

   public void show() {   
	   
	   process_total(); process_avg (); process_p (); process_s (); process_rank ();    // 메서드 호출
	   
	   System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f\t%-5s\t%-5s\t%-5s\n",name,kor,eng,math,total,aver,p,s,rank);
   }
   
   
   public void process_total () {this.total = this.kor + this.eng + this.math;}
   public void process_avg () {this.aver = this.total/3.0;}
   public void process_p () {this.p = this.aver >= 60 && this.kor > 40 && this.eng > 40 && this.math > 40 ? "합격" : "불합격";}
   public void process_s () {this.s = this.aver >= 80 ? "장학생" : "---";}
   public void process_rank () {this.rank = "";for(int i = 1; i <= (this.aver/10); i++) {this.rank += "*";}}

   ...
  
   
} 
```
show 메서드에서 process 메서드들을 호출하여 정상적으로 처리를 받았다. 그리고 호출 순서에 따라 결과값이 바뀔 수 있으므로 유의해야한다.

#### 배운점

> 역할에 따라 메서드를 분리하는 경우 서로가 담당하는 역할을 공유하기 위해서는 메서드 호출이 필요하다는 점을 배웠다. 
<br/>
<br/>
<br/>



<!-- Java 트러블 슈팅틀 -->

<br/>

## case.15	//	bank 시스템 구축시 마이너스 계좌 발생

```
출금할 금액입력 > 
50000
출금하실 금액은 :50000.0원 입니다.
잔액은 : -19999.0원 입니다.
```
bank 시스템을 코드로 구축했으나, 의도치 않게 출금 금액이 보유 잔고보다 낮은 경우에도 수치에 제한없이 출금이 되어서 마이너스 계좌가 가능해지는 현상이 발생했다.

<br/>

### 원인

```

public Withdraw() { super(); }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo;}

		public void exec() {

            // 출금 금액에 대한 유효성 검사가 누락됨
			
			double money = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("출금할 금액입력 > "); money = sc.nextDouble();
			System.out.println("출금하실 금액은 :" + money + "원 입니다.");
			this.userinfo.setBalance(this.userinfo.getBalance() - money);
			System.out.println("잔액은 : " + this.userinfo.getBalance() + "원 입니다.");
			
			
		}
```

별도의 금액제한사항을 제어문을 통해 구현해 놓지 않는 것이 원인이다.



<br/>

### 해결방법

```

public Withdraw() { super(); }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo;}

		public void exec() {

            // 별도의 금액 상한 하한선 제한없음
			
			double money = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액입력 > "); money = sc.nextDouble();

            if (money > 0 && money <= this.userinfo.getBalance()) {
			System.out.println("출금하실 금액은 :" + money + "원 입니다.");
			this.userinfo.setBalance(this.userinfo.getBalance() - money);
			System.out.println("잔액은 : " + this.userinfo.getBalance() + "원 입니다.");
			}
            else {System.out.println("잔액이 부족합니다!");
            }
			
		}

```
조건문을 추가하여 금액에 대한 조건분기를 작성하여 마이너스 계좌가 가능하지않도록 제한하였다.



<br/>

#### 배운점

> 출금 로직을 구현할 때, 입력값에 대한 유효성 검사를 반드시 선행해야 한다는 점을 배웠다. 수치 조건을 정밀하게 제어하지 않으면, 시스템이 의도치 않은 방향으로 동작할 수 있으며, 특히 금융 시스템에서는 마이너스 잔액과 같은 오류를 방지하는 로직이 필수적이다.



---
<br/> 
<br/>


<!-- 25.09.29 -->

<br/>

## case.15	//	bank 시스템 구축시 마이너스 계좌 발생

```
출금할 금액입력 > 
50000
출금하실 금액은 :50000.0원 입니다.
잔액은 : -19999.0원 입니다.
```
bank 시스템을 코드로 구축했으나, 의도치 않게 출금 금액이 보유 잔고보다 낮은 경우에도 수치에 제한없이 출금이 되어서 마이너스 계좌가 가능해지는 현상이 발생했다.

<br/>

### 원인

```

public Withdraw() { super(); }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo;}

		public void exec() {

            // 출금 금액에 대한 유효성 검사가 누락됨
			
			double money = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("출금할 금액입력 > "); money = sc.nextDouble();
			System.out.println("출금하실 금액은 :" + money + "원 입니다.");
			this.userinfo.setBalance(this.userinfo.getBalance() - money);
			System.out.println("잔액은 : " + this.userinfo.getBalance() + "원 입니다.");
			
			
		}
```

별도의 금액제한사항을 제어문을 통해 구현해 놓지 않는 것이 원인이다.



<br/>

### 해결방법

```

public Withdraw() { super(); }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo;}

		public void exec() {

            // 별도의 금액 상한/하한선 제한없음
			
			double money = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액입력 > "); money = sc.nextDouble();

            if (money > 0 && money <= this.userinfo.getBalance()) {
			System.out.println("출금하실 금액은 :" + money + "원 입니다.");
			this.userinfo.setBalance(this.userinfo.getBalance() - money);
			System.out.println("잔액은 : " + this.userinfo.getBalance() + "원 입니다.");
			}
            else {System.out.println("잔액이 부족합니다!");
            }
			
		}

```
조건문을 추가하여 금액에 대한 조건분기를 작성하여 마이너스 계좌가 가능하지않도록 제한하였다.



<br/>

#### 배운점

> 출금 로직을 구현할 때, 입력값에 대한 유효성 검사를 반드시 선행해야 한다는 점을 배웠다. 수치 조건을 정밀하게 제어하지 않으면, 시스템이 의도치 않은 방향으로 동작할 수 있으며, 특히 금융 시스템에서는 마이너스 잔액과 같은 오류를 방지하는 로직이 필수적이다.


<!-- 25.09.30 -->

<br/>

## case.16	//	추상화 클래스에서 protected 변수 활용시 변수 활용불가문제

```

출력내용 

--- 우주 탐사 대원 시뮬레이션 ---
null 엔지니어 탐사: 기계 장치 점검 완료!
null 보고서: 에너지 시스템 안정적
Nova는 충분한 체력을 유지 중입니다. 
현재 스테미나 : 75
null 생물학자 탐사: 외계 식물 샘플 채취!
null 보고서: 생명체 흔적 발견
null 휴식: 생체 리듬 조절 중...
현재 스테미나 : 60
null 파일럿 탐사: 항로 재설정 및 우주선 조종!
null 보고서: 궤도 진입 성공
Jet는 충분한 체력을 유지 중입니다. 
현재 스테미나 : 85

```
대원의 이름과 탐사내용, 보고서, 스테미나를 측정해 휴식 또는 계속할 것인지 진행하는 우주 탐사 시뮬레이션을 구축할때, 이름을 표시하려고 했으나, 배열에 들어간 names를 출력하지 못하는 문제가 일어났다.

<br/>

### 원인

```

class Engineer extends Astronaut {

@Override public String toString() { return "Engineer [name=" + name + ", stamina=" + stamina + "]"; }
@Override void explore() { System.out.println(name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
}

```
protected 로 선언된 stamina의 getter, setter기능이 존재하고있으나, name 필드에 값이 설정되지 않았기 때문에 출력 시 null이 나왔으며, 이를 해결하기 위해 setName()을 호출해야 했다.



<br/>

### 해결방법

```
String[] names = { "Nova", "Flora", "Jet" };
int[] stamina = { 75, 60, 85 };

	for (int i = 0; i<crew.length; i++) {
		
		crew[i].setName(names[i]); // 이 부분 추가
        crew[i].setStamina(stamina[i]);
		crew[i].explore();
		crew[i].report();
		
		if (crew[i].stamina < 70) {crew[i].rest(); System.out.print("\n현재 스테미나 : " + crew[i].stamina + "\n"); }
		else {System.out.print(crew[i].names + "는 충분한 체력을 유지 중입니다. \n현재 스테미나 : " + crew[i].stamina + "\n");};
	};
}
```
추상화를 담당하는 부모 클래스에 Astronaut에 getName() 메서드를 추가하고, 배열을 name 변수에 담고 출력할수 있도록 setName부분을 작성했다.



<br/>

#### 배운점

> private를 사용할 때만 getter, setter 설정이 필요하다고 알고있었으나, protected를 사용할 때도 같은 패키지내에서도 필요하다는것을 알았다.


<!-- 25.10.01 -->

<br/>

## case.17	//	List 사용시 값 추가 문법 오류

```

출력내용 

--- 우주 탐사 대원 시뮬레이션 ---
null 엔지니어 탐사: 기계 장치 점검 완료!
null 보고서: 에너지 시스템 안정적
Nova는 충분한 체력을 유지 중입니다. 
현재 스테미나 : 75
null 생물학자 탐사: 외계 식물 샘플 채취!
null 보고서: 생명체 흔적 발견
null 휴식: 생체 리듬 조절 중...
현재 스테미나 : 60
null 파일럿 탐사: 항로 재설정 및 우주선 조종!
null 보고서: 궤도 진입 성공
Jet는 충분한 체력을 유지 중입니다. 
현재 스테미나 : 85

```
대원의 이름과 탐사내용, 보고서, 스테미나를 측정해 휴식 또는 계속할 것인지 진행하는 우주 탐사 시뮬레이션을 구축할때, 이름을 표시하려고 했으나, 배열에 들어간 names를 출력하지 못하는 문제가 일어났다.

<br/>

### 원인

```

class Engineer extends Astronaut {

@Override public String toString() { return "Engineer [name=" + name + ", stamina=" + stamina + "]"; }
@Override void explore() { System.out.println(name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
}

```
protected 로 선언된 stamina의 getter, setter기능이 존재하고있으나, name 필드에 값이 설정되지 않았기 때문에 출력 시 null이 나왔으며, 이를 해결하기 위해 setName()을 호출해야 했다.



<br/>

### 해결방법

```
String[] names = { "Nova", "Flora", "Jet" };
int[] stamina = { 75, 60, 85 };

	for (int i = 0; i<crew.length; i++) {
		
		crew[i].setName(names[i]); // 이 부분 추가
        crew[i].setStamina(stamina[i]);
		crew[i].explore();
		crew[i].report();
		
		if (crew[i].stamina < 70) {crew[i].rest(); System.out.print("\n현재 스테미나 : " + crew[i].stamina + "\n"); }
		else {System.out.print(crew[i].names + "는 충분한 체력을 유지 중입니다. \n현재 스테미나 : " + crew[i].stamina + "\n");};
	};
}
```
추상화를 담당하는 부모 클래스에 Astronaut에 getName() 메서드를 추가하고, 배열을 name 변수에 담고 출력할수 있도록 setName부분을 작성했다.



<br/>

#### 배운점

> private를 사용할 때만 getter, setter 설정이 필요하다고 알고있었으나, protected를 사용할 때도 같은 패키지내에서도 필요하다는것을 알았다.



<!-- 25.10.10 -->

<br/>

## case.18	//	상속 클래스에서 자식 클래스 인스턴스 변수 호출

```
class Papa extends Object{
	int money = 10000;

	public Papa() { super();  }
	public void sing() {
			System.out.println("GOD - 거짓말");}
	} // end class

class Son extends Papa{
	int money = 1500;

	public Son() { super();  }

	@Override public void sing() { super.sing(); System.out.println("빅뱅 - 거짓말"); }

	public Son(int money) {
		super();
		money = this.money;
	}
	
}

public class Polymorphism7 {

	public static void main(String[] args) {
		
		Papa mypapa = new Son();
		System.out.println(mypapa.money);	// 1. 10000
		mypapa.sing();
		
	}// end main

}// end class

```
위와 같은 구조로 된 자바 파일에서 son 클래스가 부모 클래스인 papa클래스와 동일한 구조일때 자식 클래스의 메서드는 오버라이드하여 사용하면 되지만
인스턴스 변수는 오버라이드가 되지않고, papa.money를 호출했을때 자식의 것이 호출되지 않기 때문에 원하는 값을 출력할 수 가 없었다.

<!-- 문제 설명 -->

<br/>

### 원인

```
'Papa mypapa = new Son();' 이 부분에서 직접 호출할 수 있는 부분은 mypapa의 객체들이기 때문에 직접 호출할 수 없고 캐스팅(형변환)이 필요하다. 
```
<!-- 원인 설명 -->


<br/>

### 해결방법

```
'System.out.println(((Son)mypapa).money);' 형변환을 사용해서 출력하면 원하는 Son클래스의 인스턴스 변수를 사용할 수 있다.
```
<!-- 해결방법 -->



<br/>

#### 배운점

> 대입 또는 연산이 필요할 때만 형변환을 사용하여 해결하는 것을 알았는데 업캐스팅 또는 다운캐스팅시에도 형변환이 필요하다는 것을 배웠다.
<!-- 배운점 느낀점 연관되어서 설명 -->



<!-- 25.10.13 -->

<br/>

## case.19	//	향상된 for문 사용시 remove 사용 문제

```Java
class IceCreamDTO{
	private static int cnt = 0;
	private final  int 		no;

	public IceCreamDTO() { 	super(); this.no = cnt++;  }
	public IceCreamDTO(String name, int price) { this.no = cnt++;	this.name = name; this.price = price; }
}
...

for (IceCreamDTO i : ice) {
	if (i.getName().equals(tempName)) 
	{
		ice.remove(no);
		System.out.println("제거완료!");}
		else {System.out.println("해당 아이스크림이 존재하지 않습니다.");
		}break;
	}
```

향상된 for문을 사용해서 조건문과 조합해 ArrayList의 .remove 메서드를 이용한 제거를 시도했으나. ConcurrentModificationException 오류가 발생함

<!-- 문제 설명 -->

<br/>

### 원인

```
향상된 for문으로 리스트를 순회하는 도중 remove()를 호출하면, 리스트의 구조가 변경되어 순회가 정상적으로 이어지지 못하고 ConcurrentModificationException이 발생한다.
```
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

## 🔧 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)
