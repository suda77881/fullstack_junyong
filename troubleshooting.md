**⚙트러블슈팅**
=


**■ Git & Github**
-
---

*2025.08.29*


```bash
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

발생문제 : 로컬과 원격 저장소의 파일이 일치하지않아 생긴 문제.
해결방안 : 해결방안에는 가 있다, 첫 번째, merge를 실행해서 inc
```

```bash
$ git push origin master
To https://github.com/suda77881/fullstack_junyong.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/suda77881/fullstack_junyong.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```


**■ HTML**
-
---

**■ CSS**
-
---

*2025.08.29*
<br>

- **case.1**

오류메세지

```validator.w3.org
Error: An img element must have an alt attribute, except under certain conditions. For details, consult guidance on providing text alternatives for images.
From line 12, column 16; to line 12, column 104
```
<br>
<br>
🛠️ 해결 방법 

당신의 코드에서 문제된 부분은:

`<img src="#.png" style="..." />`


여기서 alt 속성이 빠져 있어요. 아래처럼 수정하면 오류가 사라집니다:

`<img src="#.png" style="..." alt="사용자 프로필 사진" />`



💡 언제 alt를 생략할 수 있을까?
아주 특별한 경우에만 alt를 생략할 수 있어요:
- 이미지가 **순수 장식용(decorative)**이고, role="presentation" 또는 빈 alt=""를 명시한 경우
- <figure> 요소 안에 <figcaption>으로 설명이 충분히 제공된 경우
- 이메일처럼 이미지를 볼 수 있는 대상에게만 전달되는 문서일 경우
하지만 일반적인 웹페이지에서는 항상 alt를 넣는 게 원칙입니다.

> 느낀점 : img 태그에서 alt 요소를 누락시켜서 발생한 문제로 접근성 향상을 위해 설계되고 검색엔진과 브라우저에 인식 시켜주는 요소라는것을 알게되었다. 



- **case.2**

오류메세지

```validator.w3.org

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

**■ Java**
=
---

*2025.08.28*


오류메세지:
```ECLIPS
    >Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
   Syntax error on token ""+"", invalid AssignmentOperator
   at com.company.java002_ex.VarEx002.main(VarEx002.java:15)
a = b;
System.out.println(a"+"b);
```

실행값 : `System.out.println(a"+"b);`

결과값을 `a+b(a==b)`로 기대했으나, 트러블 슈팅이 발생함

```
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

```
해결방법 : `System.outprintln(a"+"b);` 에서 `System.outprintln(a+"+"+b);` 로 문법에 맞춰 수정하여 기대한 출력 값을 얻음 

느낀점 : 문법 문제로인해 발생한 오류였음, 자바 문법이 굉장히 어렵다고 느낌.
