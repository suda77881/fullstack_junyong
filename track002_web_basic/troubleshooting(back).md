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

