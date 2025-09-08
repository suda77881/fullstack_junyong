**🛠 트러블슈팅 🛠**
=

<br/>
<br/>

**■ Git & Github**
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

**■ HTML**
=

<br/>
<br/>

**case.1**
-

<br/>

*2025.08.29*

<br/>

### 에러 메세지

```
validator.w3.org

Error: An img element must have an alt attribute, except under certain conditions. For details, consult guidance on providing text alternatives for images.
From line 12, column 16; to line 12, column 104
```
<br>

### 원인  

```
HTML

<img src="#.png" style="..." />
```


img 태그안에 `alt` 속성이 누락되어 있음

<br>
<br>

### 해결 방법


```
HTML

<img src="#.png" style="..." alt="대체설명" />
```

문제가 발생한 img 태그에 `alt` 속성을 추가하면 웹 접근성 관련 에러가 해결됨


<br>

### 예외

- 이미지가 장식용(decorative)이거나, role="presentation" 또는 빈 alt=""를 명시한 경우 
- `<figure>` 요소 안에 `<figcaption>` 으로 설명이 충분히 제공된 경우
- 이메일처럼 이미지를 볼 수 있는 대상에게만 전달되는 문서일 경우 

<br>

#### 배운점

> `img` 태그에서 `alt` 속성을 누락하면 웹 접근성 문제가 발생할 수 있다는 점을 알게 되었고,  
> 이는 검색엔진과 브라우저가 이미지를 올바르게 인식하도록 돕는 중요한 요소임을 이해하게 되었다.

<br/>
<br/>
<br/>

**case.2**
-

### 에러 메세지

```
validator.w3.org

Error: Element ol not allowed as child of element ol in this context. (Suppressing further errors from this subtree.)

From line 35, column 31; to line 35, column 34

React</li><ol>↩     

Contexts in which element ol may be used:
Where flow content is expected.
Content model for element ol:
Zero or more li and script-supporting elements.

React</li><ol>↩
```

```validator.w3.org

Error: Garbage after </.
At line 52, column 15

</ㅇl></d>
```

<br/>
<br/>
<br/>

**■ CSS**
=

<br/>
<br/>
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

