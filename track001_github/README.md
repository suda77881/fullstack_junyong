
<!-- 주석 -->

<br/>


## Contact & Link



<image src="./me.png" alt="프로필" width="200">

|이름|신준용|
|-|-|
|Email|boody123@naver.com|
|Github|https://github.com/suda77881/fullstack_junyong|


<br/>


---

<br/>


## 📌 Golds

<br/>

- GitHub의 핵심 기능을 직접 실습하며 실무 감각 익히기
- Markdown을 활용한 체계적인 문서화 역량 강화
- 효율적인 협업을 위한 GitHub 워크플로우 완전 정복
- AI 도구를 활용한 스마트한 개발 환경 경험

<br/>


---

<br/>


## 🔧 기술스택 기반 CS 역량

<br/>


| 기술스택         | CS 역량 및 실무 적용 사례                                                                                   |
|------------------|-----------------------------------------------------------------------------------------------------------|
| **Git & GitHub** | 버전 관리, 브랜치 전략, 협업 프로세스 이해. **GitHub Actions** 등 **자동화 도구**로 CI/CD **파이프라인 구축 경험**      |
| **Markdown**     | **개발 문서** / **README** / **기술 블로그** 작성. **가독성**과 **유지보수성**을 고려한 체계적 문서화 역량                         |
| **VS Code**      | **확장 기능** 및 **디버깅 도구** 활용. 코드 품질 향상과 생산성 증대, **실시간 협업 환경 경험**                         |
| **HTML5 & CSS3** | **웹 표준**, **시맨틱 태그**, **반응형 디자인 원칙** 실습. **사용자 경험 중심의 UI 구조 설계**                             |
| **AI 프롬프트**  | **Copilot**, **ChatGPT** 등 **AI 도구 활용**. 문제 해결 속도 향상, 코드 리뷰 자동화 등 **현대 개발 환경 적응력** |

<br/>


---
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

<br/>
<br/>
<br/>

--- -->
<!-- 1,2일 차에 넣은 트러블슈팅들 -->

<br/>


## 📌 트러블슈팅 (Github에서 발생)

<br/>
<br/>

🔧 트러블슈팅 정리

<br/>

🧩 트러블슈팅 (1)

<br/>
<br/>

$ git commit -m "git 수정 후 다시올리기"
...
no changes added to commit (use "git add" and/or "git commit -a")

<br/>

1. 문제점
수정된 파일이 존재하지만 git add를 하지 않아 커밋 대상에 포함되지 않음.
즉, 스테이징되지 않은 변경사항이 있어 커밋이 실패함.

<br/>

2. 해결방안
수정된 파일을 커밋에 포함시키기 위해 아래 명령어 실행:
git add day001.md
git commit -m "수정사항 반영" 

또는 전체 변경사항을 자동으로 포함하려면:
git commit -a -m "수정사항 반영"


3. 느낀점 : 순서대로 명령어를 실행하지 않아 생긴 문제로 다시 절차대로 진행하여 해결할 수 있는 간단한 문제라고 생각함

<br/>
<br/>

🧩 트러블슈팅 (2)
<br/>
$ git pull origin master
...
CONFLICT (content): Merge conflict in day002.md


1. 문제점
원격 저장소와 로컬 저장소 간의 동일 파일(day002.md)에 내용 충돌(Merge Conflict) 발생.
자동 병합이 불가능하여 수동으로 충돌을 해결해야 함.
<br/>
2. 해결방안
- 충돌 파일 열기 (day002.md)
- <<<<<<<, =======, >>>>>>> 구문을 기준으로 원하는 내용을 선택 및 수정
- 수정 후 저장
- 충돌 해결 완료 후 커밋:
git add day002.md
git commit -m "Merge conflict 해결"

3. 느낀점 : 같은 코드를 작업할 때 발생할 수 있는 문제로 다른 사용자와 같은 파일을 작업하게되면 이런 문제가 발생하여, 혼란을 겪을 수 있다고 생각했으나, 생각보다 간단하게 merge 또는 수정사항을 반영하여 최종적으로 업로드가 가능하다고 느낌

<br/>
<br/>

🧩 트러블슈팅 (3)

<br/>
$ git pull origin master
error: You have not concluded your merge (MERGE_HEAD exists).

<br/>
<br/>

1. 문제점
이전 병합(Merge)이 완료되지 않은 상태에서 다시 git pull을 시도함.
Git은 병합 중인 상태에서는 새로운 병합을 허용하지 않음.
<br/>

2. 해결방안
먼저 병합을 완료하거나 취소해야 함.
- 병합 완료:
git add .
git commit -m "병합 완료"
<br/>

- 병합 취소:
git merge --abort

그 후 다시 git pull을 시도하면 정상적으로 작동함.

3. 느낀점 : 먼저 발생한 트러블 슈팅을 완료하지 않을 경우 발생한 문제로 기존 발생한 문제 해결후 새로운 병합을 허용하는 상태로 바뀜 


---

## 🔧 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)
