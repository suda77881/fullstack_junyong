**🛠 트러블슈팅 🛠**
=

<br/>
<br/>

<!-- **■ Git & Github**
-

<br/>
<br/>

*2025.08.29*

<br/>


## 에러메세지

```
bash

$ git pull origin master
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 3 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 928 bytes | 10.00 KiB/s, done.
From https://github.com/suda77881/fullstack_junyong
 * branch            master     -> FETCH_HEAD
   7a2d154..b0edc2b  master     -> origin/master
Auto-merging day005.md
CONFLICT (content): Merge conflict in day005.md
Automatic merge failed; fix conflicts and then commit the result.
```

<br/>

### 원인 
 VSCode에서 'git pull origin master' 명령어를 실행했을 때, day005.md 파일에서 `병합 충돌 (Merge Conflict)`이 발생했다. <br/>이는 `로컬 저장소와 원격 저장소의 동일한 파일의 내용이 서로 다를 경우 자동 병합에 실패`하면서 나타나는 에러다.

<br/>

### 해결방안
 VSCode에서 충돌된 파일을 열면 `Accept Current Change`, `Accept Incoming Change`, `Accept Both Changes` 등의 옵션이 제공된다.
상황에 맞게 선택하여 충돌을 해결한 뒤, 변경사항을 커밋하면 된다.

<br/>
<br/>

#### 배운점 <br>
> Github에서 팀원이나 외부 기여자가 같은 파일을 수정했을 때 자주 발생할 수 있는 문제다. 권한이 있는 사용자라면, 코드의 방향성이 명확할 경우 승인 절차 없이 병합을 직접 처리할 수 있다는 점이 인상 깊었다.

<br/>
<br/>
<br/>
<br/>



<br/>
<br/>
<br/>


<br/>
<br/> -->

HTML & CSS
=

<br/>


<!-- 2025.08.29 -->

## 📖 case 1  / img 태그 필수 속성 누락


<br/>

```
validator.w3.org

Error: An img element must have an alt attribute, except under certain conditions. For details, consult guidance on providing text alternatives for images.
From line 12, column 16; to line 12, column 104
```

<br/>

### ⚠️ 원인

```
VSCode

<img src="#" />
```

 img 태그 사용시 `alt 속성(대체설명)` 이 누락되어 발생한 문제.<br/> 이미지 오류시 대체 텍스트, 검색엔진과 스크린 리더(시각 장애인용 보조기기)의 대신 읽어주기 기능을 담당하는 태그로 누락되면 웹 접근성 에러 메세지가 발생한다. 


<br/>

### 🛠 해결방법 ###


```
<img src="#" alt="..." /></p> 		// 	alt 속성 추가
```

위와 같은 방법으로 수정하여 웹 접근성 오류 해결.

<br/>

#### 💭 배운점

alt 속성이 누락되어도 이미지 표시 자체는 가능 그러나 이미지가 표시 안될 때의 텍스트, 시각 장애인을 위한 기기가 정상 동작하기 위해 그리고 검색엔진이 이미지를 이해할 수 있게 해주는 요소로 웹 접근성에 중요한 것이라고 알게되었다.

<br/>


---
<br/>
<br/>

<!-- 2025.09.05 -->

## 📖 case 2 / 클래스 누락 문제


<br/>

```
VSCode

<style>
.container {border:3px solid #333; border-radius:15px;}
...
    <body>
        <h1>나의 포트폴리오</h1>
        <div class="card">
            <p><img src="./img/portfolio1.jpg" 
					alt="포트폴리오1 프로젝트의 이미지"/>
            ...
        </div>
    </body>
</style>
```

내부 스타일로 card 클래스에 'margin:auto; width:50%;' 지정했지만 CSS 적용에 실패함.

<br/>


### ⚠️ 원인


<!-- VSCode -->

container 클래스가 속성에 없는 상태에서 style 만 구현되어 있어서 card 클래스에 스타일을 적용하지 못함.
 


<br/>

### 🛠 해결방법


```
VSCode

<style>
.container {border:3px solid #333; border-radius:15px;}

    <body>

      <div class="container"> 		// 	div 태그와 container class 추가

        <h1>나의 포트폴리오</h1>
        <div class="card">
            <p><img src="./img/portfolio1.jpg" 
					alt="포트폴리오1 프로젝트의 이미지"/>
            ...

        </div>
```

card class 의 margin, width를 담당할 `<div class="container">` 태그를 추가하여 스타일이 정상적으로 적용되었다.

<br/>

#### 💭 배운점 

> style을 지정하더라도 짝이되는 class, 태그, id 가 원하는 위치에 존재해야 style을 적용할 수 있다고 배웠다.

<br/>

---

<br/>
<br/>

<!-- 2025.09.05 -->

## 📖 case 3 / 우선순위 문제 





<br/>


```
VSCode

   .card::before{
    content: "";
    position: absolute;
    top:-3px; left: -3px; right: -3px; bottom: -3px;
    background-image: linear-gradient(45deg, #00c9ff,#92fe9d);
    border-radius: 15px;
    opacity:0;
    transition: opacity 0.5s ease;
   }
   .card:hover:before{
    opacity:1;
   }
```

카드를 구현하고 아래에 그라디언트 테두리를 구현할 목적으로 배경 이미지를 생성했다. 마우스를 올렸을 때 before의 요소가 카드내용을 가리는 문제 발생.

<!-- “마우스를 올렸을 때 ::before 요소가 카드 내용보다 위에 렌더링되어, 내용이 가려지는 문제가 발생함” -->



<br/>


### ⚠️ 원인

카드에 마우스를 올렸을 때 테두리와 카드의 우선 순위가 바뀌는 것이 원인이다. 
 


<br/>

### 🛠 해결방법



```
VSCode

   .card::before{
    content: "";
    position: absolute;
    top:-3px; left: -3px; right: -3px; bottom: -3px;
    background-image: linear-gradient(45deg, #00c9ff,#92fe9d);
    border-radius: 15px;
    opacity:0;
    z-index: -1              	// 	z축 우선 순위를 -1로 설정
    transition: opacity 0.5s ease;
   }
   .card:hover:before{
    opacity:1;
   }
```

card::before 속성에 **z-index**: -1 를 추가하여 명시적으로 z축 우선순위를 -1로 설정한다 (기본값:auto)

<!-- 기본적으로 ::before는 부모 요소와 같은 z축에 위치하며, 명시적으로 z-index: -1을 설정해 카드 뒤로 배치함. -->

<br/>

#### 💭 배운점 

> 화면상에 출력되는 HTML & CSS 요소에 우선순위가 있으며, 임의로 설정하여 배경이나 테두리를 구현할 수 있다는 것을 배웠다.


<br/>
<br/>
<br/>

<!-- 2025.09.15 -->

## 📖 case 4 / 폼 요소 연결 오류: Label과 Input ID 불일치



<br/>


```
Error: The value of the for attribute of the label element must be the ID of a non-hidden form control.

```

외부 템플릿에서 폼 태그를 적용할때 수정을 진행하다가 기존 입력된 아이디와 폼 부분을 연결할때 오탈자 발생

<!-- “마우스를 올렸을 때 ::before 요소가 카드 내용보다 위에 렌더링되어, 내용이 가려지는 문제가 발생함” -->



<br/>

<!-- 
### ⚠️ 원인

카드에 마우스를 올렸을 때 테두리와 카드의 우선 순위가 바뀌는 것이 원인이다.  -->
 


<br/>

### 🛠 해결방법



```
<label for="title" class="form-label">제목:</label> // 이부분(tile → title). 
<input type="text" class="form-control" id="title" ... >
```

id="title" 에 나와있는 요소와 label for="title"으로 이름을 동일하게 변경해준다.(연결누락)


<!-- 기본적으로 ::before는 부모 요소와 같은 z축에 위치하며, 명시적으로 z-index: -1을 설정해 카드 뒤로 배치함. -->

<br/>

#### 💭 배운점 

> 대부분의 태그 속성, css값의 미적용이 우선순위 문제가 아니면 오탈자로 인한 문제라는 것을 배우고있다.


<br/>
<br/>
<br/>


<!-- 2025.09.23 -->

## 📖 case 4 / 폼 요소 연결 오류: Label과 Input ID 불일치



<br/>


```
Error: The value of the for attribute of the label element must be the ID of a non-hidden form control.

```

외부 템플릿에서 폼 태그를 적용할때 수정을 진행하다가 기존 입력된 아이디와 폼 부분을 연결할때 오탈자 발생

<!-- “마우스를 올렸을 때 ::before 요소가 카드 내용보다 위에 렌더링되어, 내용이 가려지는 문제가 발생함” -->



<br/>

<!-- 
### ⚠️ 원인

카드에 마우스를 올렸을 때 테두리와 카드의 우선 순위가 바뀌는 것이 원인이다.  -->
 


<br/>

### 🛠 해결방법



```
<label for="title" class="form-label">제목:</label> // 이부분(tile → title). 
<input type="text" class="form-control" id="title" ... >
```

id="title" 에 나와있는 요소와 label for="title"으로 이름을 동일하게 변경해준다.(연결누락)


<!-- 기본적으로 ::before는 부모 요소와 같은 z축에 위치하며, 명시적으로 z-index: -1을 설정해 카드 뒤로 배치함. -->

<br/>

#### 💭 배운점 

> 대부분의 태그 속성, css값의 미적용이 우선순위 문제가 아니면 오탈자로 인한 문제라는 것을 배우고있다.


<br/>
<br/>
<br/>


<!-- 2025.09.23 -->

## 📖 case 5 / JavaScript 스타일 적용 문제


<br/>

```
VSCode // JavaScript

<div class="container card  my-5">
  <h2  class="card-header">005.선택자 -   Step3. document.getElementById Ex2 </h2>
  <div class="card-body" id="card-border">
    <pre class="alert alert-secondary"> 
        0. 스크립트는 어디서든 동작 가능
        1. 아이디가 borderStyleBtn인 버튼을 선택
        2. 클릭 시 테두리 스타일 입력받음 (solid, dashed, dotted 등)
        3. 카드에 입력한 테두리 스타일 적용
    </pre>
    <input type="button" value="Change Border Style" 
           id="borderStyleBtn" class="btn btn-danger" />

    <script>

       window.addEventListener("load", function(){
        document.getElementById("borderStyleBtn").onclick = function(){
          document.getElementById("card-border").style.border = "15px" + prompt("테두리스타일(solid, dashed, dotted)") + "red";        
        };
      });

</Script>

</div>
</div>  

```
id가 'card-border'인 카드 클래스에 경계선을 적용하려고 시도했으나, 지속적으로 실패하고, '15px', 'red'의 값을 조정해보았으나, 적용 되지않음.



<br/>

 
### ⚠️ 원인

```
document.getElementById("card-border").style.border = "15px" + prompt("테두리스타일(solid, dashed, dotted)") + "red";
```

이 부분에서 각종 스타일의 속성값을 입력받아서 변경할수있지만, 정확한 문법을 지켜야함

style에서 border속성값을 입력할 때 `15pxsolidred` 같은 형태가 되었기 때문에 계속 실패



<br/>

### 🛠 해결방법



```
document.getElementById("card-border").style.border = "15px " + prompt("테두리스타일(solid, dashed, dotted)") + " red"; // 속성값 사이 공백추가
```
문법에 맞게 `15px solid red` 입력값에 공백을 붙여줘서 성공적으로 스타일을 적용시킴.

<br/>

#### 💭 배운점 

> 보이지 않는 부분에서도 문법에 맞게 적용시키지 않으면 안된다는 것을 배웠다.


<br/>
<br/>
<br/>


<!-- 2025.09.24 -->

## 📖 case 6 / JavaScript 스타일 지정 문제


<br/>

```
VSCode // JavaScript

<script>  

window.addEventListener("load", function(){
        let color = document.getElementById("color");
        let lis   = document.getElementsByTagName("li");
        lis[0].style.fontWeight="bold";
      });

</script>

```
id = "color" 요소 안에 <li> 태그에 스타일을 지정하기 위해 스크립트를 작성했으나. 원하는 태그에 지정되지 않는 현상 발생


<br/>

 
### ⚠️ 원인

```
        let color = document.getElementById("color");
        let lis   = document.getElementsByTagName("li");  // 이 부분의 범위설정이 잘못됨.
        lis[0].style.fontWeight="bold";
```

document.getElementsByTagName("li")는 페이지 전체의 <li> 요소를 가져온다. 하지만 원하는 대상은 id="color" 내부의 <li>이므로, 범위를 color 요소로 범위를 제한해야 한다.

<!-- JavaScript의 요소로 태그를 변경할 때 단수 > 복수 지정 그리고, 'document.getElementById("color").getElementsByTagName("li")' 형태로 지정해줘야 하기 때문에
문법상 맞지 않고 복수는 바로지정해서 사용할 수 없다. -->




<br/>

### 🛠 해결방법



```
        let color = document.getElementById("color");
        let lis   = color.getElementsByTagName("li");  // color로 범위수정
        lis[0].style.fontWeight="bold";
```
color 변수로 앞에 범위값을 조정해주고 실행하면 의도한대로의 실행이 이루어졌다.

<br/>

#### 💭 배운점 

> 자바스크립의 지정방식에 대해 하나더 배웠다.


<br/>
<br/>
<br/>




<!-- **■ Java**
=

<br/>
<br/>



case.1  //  변수와 문자열 문법 오류
-

<br/>
<br/>

*2025.08.28*

<br/>

에러메세지
-

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

System.out.println(a + "+" + b);    //  변수와 문자열 사이에 +를 추가
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

case.2  //  외부 클래스 인식문제
-

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

import java.util.Scanner;   //  import Scanner 추가

public class input1 { 

...

 ```
 
 자바가 Scanner를 인식할 수 있도록, 패키지 선언과 현재 클래스 정의 사이에 `import java.util.Scanner;` 구문을 추가한다.

<br/>

#### 배운점

> 외부 클래스를 사용할 때는 반드시 import를 추가 해야한다는 점을 배웠다.

<br/>
<br/>
<br/>


case.3  //  char 변수 사용시 문법 오류
-

### 에러메시지

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	z cannot be resolved to a variable
	a cannot be resolved to a variable
	Z cannot be resolved to a variable
	A cannot be resolved to a variable
```

<br/>

### 원인

```
if (ch <= z && ch >= a ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}
else if (ch <= Z && ch >= A ){System.out.println("당신이 입력한 문자는 대문자입니다.");}
```

char 변수 값을 비교할때 대상이 되는 값에 ''가 필요하다

<br/>

### 해결방법

```
if (ch <= 'z' && ch >= 'a' ) {System.out.println("당신이 입력한 문자는 소문자입니다.");}		//	비교값에 ''추가
else if (ch <= 'Z' && ch >= 'A' ){System.out.println("당신이 입력한 문자는 대문자입니다.");}	//	비교값에 ''추가
```

문법에 맞게 변수와 비교하는 값에 `' '`를 추가해준다.

<br/>

#### 배운점

>char 타입 변수를 값과 계산하거나 비교할때 `' '`로 감싸주는것 처럼, long 타입 변수는 뒤에 L, float타입 변수는 f값을 뒤에 붙여야 문법 상의 오류가 없다는 것을 알게되었다.

<br/>
<br/>
<br/>

<!-- 설명 수정 필요 -->

<!-- case.4   //  main 메서드 선언 시 문자열 배열 누락
-

<br/>

### 에러메세지

```
오류: com.company.java004_ex.IfEx004 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
   public static void main(String[] args)
또는 JavaFX 애플리케이션 클래스는 javafx.application.Application을(를) 확장해야 합니다.
```

<br/>

### 원인

```
public static void main(String args)    //  String 뒤에 [ ] 가 누락되어있다.
``` 

String으로 선언된 경우 자바가 실행인자를 배열로 받을 수 없기 때문에 [ ]를 붙여서 배열로 받을 수 있도록 수정을 요구하는 것이다.

<br/>

### 해결방법

```
public static void main(String[] args)    //  자바가 실행 인자를 배열로 받을 수 있도록 String[] arg 형태로 수정해준다.
``` 

에러메세지에서 제시한 해결법을 따라 String이 문자열을 배열로 받을 수 있도록 수정해준다.

<br/>

#### 배운점

>기본 메서드를 정의할때 string으로 정의하는 경우 문자열을 하나만 담을 수 있기 때문에 클래스에서 필요로 하는 여러가지 기능을 수행하기엔 부족하다는것을 배웠다.

<!-- 설명 수정 필요 -->

<!-- <br/>
<br/>
<br/>


case.5 // 세미콜론( ; ) 오기 문제
-


### 에러메세지

```
Java

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
   Syntax error on token(s), misplaced construct(s)
   Syntax error on token ")", { expected after this token

   at com.company.java005_ex.ForEx001.main(ForEx001.java:80)
```
컴파일 단계에서 문법 오류가 발생해서 main 메서드가 실행되지 못한 상태 라고 축약가능?

### 원인

```
 for (int i=0; i<=18; i=i+2) {System.out.print((i==0? "": ",") + i +"t";)}

```

세미콜론(;)의 위치가 잘못 입력되어서 발생한 문제

for (int i=0; i<=18; i=i+2) {System.out.print((i==0? "": ",") + i +"t");}

세미콜론(;)의 위치를 수정해주면 정상적으로 작동한다. -->
