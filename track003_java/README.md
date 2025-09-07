
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



**case.1**
-

<br/>
<br/>

*2025.08.28*

<br/>

## 오류메세지

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

System.out.println(a + "+" + b);
```
문법 오류를 해결하려면 `변수 + "문자열" + 변수` 구조로 수정해주면 해결된다.

<br/>
<br/>

#### 배운점 

> 출력문에서 변수, 연산자, 문자열을 연결할 때는 단순히 나열하는 것이 아니라 + 연산자를 사용해 명시적으로 연결해야 문법 오류를 피할 수 있다. 이를 통해 자바에서 문자열 연결 연산자의 중요성과 역할을 정확히 이해하게 되었다.


<br/>
<br/>
<br/>


*2025.09.06*

<br/>

---
### 에러메세지

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

import java.util.Scanner; 

public class input1 { 

...

 ```
 
 자바가 Scanner를 인식할 수 있도록, 패키지 선언과 현재 클래스 정의 사이에 `import java.util.Scanner;` 구문을 추가한다.

<br/>

#### 배운점

> 외부 클래스를 사용할때, import 과정을 생략하면 자바가 인식하지 못하는 것이 주소도 안 알려주고 편지를 보내는 일과 비슷하다고 생각했다.

<br/>
<br/>
<br/>


2. char 변수 사용시 ''로 값을 감싸주지 않아서 발생하는 문제

### 에러메시지

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	z cannot be resolved to a variable
	a cannot be resolved to a variable
	Z cannot be resolved to a variable
	A cannot be resolved to a variable
```


### 원인

>	if (ch <= z && ch >= a ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}
else if (ch <= Z && ch >= A ){System.out.println("당신이 입력한 문자는 대문자입니다.");}

3. 전원부 작성시 String[]로 선언되지 않았을때 발생하는 문제

오류: com.company.java004_ex.IfEx004 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.


에러가 발생한 부분

>public static void main(String args) {}  


---
<br/>
<br/>

## 🔧 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)
