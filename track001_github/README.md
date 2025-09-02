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

<span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;"> 🖐 안녕하세요 🖐 <br/><span style="color:red">문제 해결과 협력,</span> 그리고 <span style="color:red">기능 구현</span>의 효율성을 추구하는</span><span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold; text-decoration:underline"><br/>주니어 개발자 지망생</span> <span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold; color:steelblue">신준용 </span> <span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;">입니다.</span><br/><span style="font-size:20px; font-family:'seoge UI', sans-serif; font-weight:bold;">전방위 기술 스택을 실무에 도입하여<br/>개발자간의 원할한 협업과 서비스 개선을 실현하려고 노력중입니다 😎</span>


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


<!-- # 🔧 기술스택 기반 CS 역량 
<br/> -->


| <p style="font-size:20px"><strong>기술 스택</strong></p>       | <strong><p style="font-size:20px">CS 역량 및 학습 / 실습 경험</strong></p>                                                                 |
|----------------|------------------------------------------------------------------------------------------|
| <strong>Git & GitHub</strong>   | 로컬 환경 설정, 원격 저장소 연결, CI/CD 흐름 이해, Merge Conflict 문제 해결 경험         |
| <strong>Java (Eclipse)</strong> | Java 코딩 환경 구축, 패키지와 클래스의 계층 구조 이해, 변수·상수·입출력 문법 학습, Scanner 등 라이브러리 활용 경험 |
| <strong>AI 도구 활용</strong>   | Copilot, ChatGPT 등을 활용한 코드 트러블슈팅 해결 및 개선 피드백 점검 학습               |
| <strong>VS Code</strong>        | 프로젝트 구조 관리, 확장 기능 설치/활용, HTML/CSS 문서 작성 지원 학습                    |
| <strong>HTML5 & CSS3</strong>   | HTML 문서 구조 설계, 인라인 CSS 스타일 적용, 웹 접근성 점검 및 개선 실습                 |
| <strong>Markdown</strong>       | 문서 구조화, 가독성 중심 작성법 학습, README 및 학습 기록 문서 작성 경험                |


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

## Github & Git

<br/>
<br/>


<!-- 2025.08.25 -->

## 📖 case 1

<br/>



```
gitbash

 $ git commit -m "git 수정 후 다시올리기"
...
 no changes added to commit (use "git add" and/or "git commit -a")
```
<br/>


### ⚠️ 문제 발생 명령어


```gitbash
 $ git commit -m "..."
```
<br/>
<br/>

### 🔎 문제점 분석 <br/>

> 수정된 파일이 존재하지만 **'git add '** 를 선행 하지 않아 커밋 대상에 포함되지 않고 트러블 슈팅이 발생함.
<br/>
즉, `스테이징되지 않은 변경사항이 있어 커밋이 실패`함.

<br/>
<br/>

### 🛠 해결방법

<br/>


수정된 파일을 커밋에 포함시키기 다음 순서로 진행
<br/><br/> 1. 커밋할 대상이되는 `파일을 저장`<br/> 2. `git add (파일명.md)` 또는  `git add .`(변경된 파일을 모두 스테이지에 포함시킬 경우)<br/> 3. `git commit -m "..."` 
또는 전체 변경사항을 자동으로 포함하려면:
`git commit -a -m "..."` 

<br/>

#### 💭 느낀점 <br/>

이 문제는 명령어 실행 순서를 지키지 않아 발생한 단순한 오류였으며, 절차를 정확히 따르면 쉽게 해결할 수 있다는 점을 깨달았다.

<br/>
<br/>
<br/>
<br/>


<!-- 2025.08.26 -->

## 📖 case 2
<br/>

```
gitbash

$ git pull origin master
...
CONFLICT (content): Merge conflict in *.md
```


<br/>

### ⚠️ 문제 발생 명령어


```gitbash
$ git pull origin master
```
<br/>

### 🔎 문제점 분석

> 원격 저장소와 로컬 저장소 간의 동일 파일(*.md)에 병합 충돌(Merge Conflict) 발생.<br/>자동 병합이 불가능하여 수동으로 충돌을 해결해야 함.

<br/>

### 🛠 해결방법

1. 충돌 파일 열기
2. `<<<<<<<, =======, >>>>>>>` 구문을 기준으로 원하는 내용을 선택 및 수정<br/>
3. 수정 후 저장
4. 충돌 해결 완료 후 커밋 진행 `git add (파일명)` 입력후
`git commit -m "..."`

<br/>

#### 💭 느낀점 <br/>

파일을 작업할 때 발생할 수 있는 문제로 다른 사용자와 같은 파일을 작업하게되면 이런 문제가 발생하여, 혼란을 겪을 수 있다고 생각했으나, 생각보다 간단하게 채택 또는 수정사항을 반영하여 최종적으로 업로드가 가능하다고 느낌

<br/>
<br/>
<br/>
<br/>


## 📖 case 3
<br/>

```
git bash

$ git pull origin master
error: You have not concluded your merge (MERGE_HEAD exists).
```

<br/>
<br/>

### ⚠️ 문제 발생 명령어


```gitbash
$ git pull origin master
```

<br/>

### 🔎 문제점 분석

 > 이전 `병합(Merge)`이 완료되지 않은 상태에서 다시 `'git pull'`을 시도함. <br/>Git은 병합 중인 상태에서는 새로운 병합을 허용하지 않는다.</p>

<br/>

### 🛠 해결방법
<br/>

1. 먼저 병합을 완료하거나 취소해야 함.<br/><br/>
2. 병합 완료 : `git add (파일명)` ->
`git commit -m "..."`<br/>병합 취소 : `git merge --abort` <br/><br/>
3. 그 후 다시 'git pull'을 시도하면 정상적으로 작동함.

<br/>

#### 💭 느낀점 <br/>

 먼저 발생한 트러블 슈팅을 완료하지 않을 경우 발생한 문제로 기존 문제 해결후 새로운 병합을 허용하는 상태로 바뀜 순차적으로 문제해결을 진행해야 된다는점을 알게되었다. 


<br/>
<br/>
<br/>
<br/>


## 📖 case 4 <!-- 2025.08.29 -->
<br/>

```
git bash

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
<br/>

### ⚠️ 문제 발생 명령어


```gitbash
$ git pull origin master
```

<br/>

### 🔎 문제점 분석

 > git pull origin master 명령어를 실행했을 때, day005.md 파일에서 병합 충돌 (Merge Conflict)이 발생했다. 이는 로컬 저장소와 원격 저장소의 해당 파일 내용이 서로 다를 경우 자동 병합에 실패하면서 나타나는 에러다.

<br/>

### 🛠 해결방법
<br/>

VSCode에서 충돌된 파일을 열면 **Accept Current Change, Accept Incoming Change, Accept Both Changes** 등의 옵션이 제공된다.
상황에 맞게 선택하여 충돌을 해결한 뒤, 변경사항을 커밋하면 된다.

<br/>

#### 💭 느낀점 <br/>

 이전 발생한 Merge Conflict와 같은 문제로 로컬과 원격 저장소 간의 파일 내용이 충돌한 것이다. 이번 해결은 각각의 옵션의 내용을 확인하여 수동으로 Merge Conflict를 해결해 보았다, 이후 배우게될 브런치를 사용해서 좀 더 원할한 수정 배포 전략이 가능하다고 느꼈다.

<br/>
<br/>
<br/>
<br/>


 ## HTML & CSS

<br/>


<!-- 2025.08.29 -->

## 📖 case 1 웹 접근성 점수 / 필수 속성 누락


<br/>

```validator.w3.org
Error: An img element must have an alt attribute, except under certain conditions. For details, consult guidance on providing text alternatives for images.
From line 12, column 16; to line 12, column 104
```

<br/>


### ⚠️ 문제 발생 코드


```VS Code
<img src="..." />
```

<br/>
<br/>

### 🔎 문제점 분석 <br/>

> img 태그 사용시 필수 `alt 속성(대체설명) 이 누락`되어 발생한 문제로 이는 이미지 오류시 alternative text(대체 텍스트), 검색엔진(이해를 돕는)과 스크린 리더(시각 장애인용 보조기기)등의 기능을 최적화 하는 요소로서 누락되었을때 웹 접근성 오류가 발생한다. 

<br/>
<br/>

### 🛠 해결방법

<br/>

* `<img src="profile.jpg" alt="프로필 사진" />`<br>
img 태그의 src 속성 이후로 `alt 속성`을 `추가`해주면 웹 접근성 오류가 해결되는것을 확인할 수 있다.

<br/>

#### 💭 느낀점 <br/>

img 태그 자체는 alt 속성이 누락되어도 이미지 표시 자체는 가능 그러나 이미지가 표시 안될때, 시각 장애인을 위한 기기가 정상 동작하기 위해 그리고 검색엔진이 이미지를 이해할 수 있게 해주는 요소로 웹 접근성에 중요한 것이라고 느낌.

<br/>
<br/>


---
<br/>
<br/>

## 🔧 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)
