char형 변수를 사용할땐 값을 ''이것을 붙여서 사용해야한다.

연산자 중

+= -= /= *= 이거 사용법을 기억해야겠다




var1.equals(var2) 문자열끼리 비교할때 사용된다

var1 == var2 ?  이렇게 사용하면 주소값을 

비교하는거라 오류가 나는듯


char형 변수로는 그냥 계산하면 되는듯


연산기호를 쓸때 변수를 좌측에 배치하고 

우측에 숫자를 쓰는형태를 선호한다.

A > 3 || A < 10 

( A > 3 || 10 > A 이것도 같은의미이긴함 )

변수 부등호 값 || 


삼항 연산자?

상항연산자를 기억할 필요가있다

같은 구문내에 Q ? true값 : Q2 ? true값 : false값("") ;

마지막에 :하고 false값을 써줘야함 ""를 
써주면 false값을 안주고 스킵가능




Eclipse


삼항연산자 중 false값이 누락 되서 오류를 반환

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error on token ":", Expression expected after this token


변수 초기화가 안되서 발생하는 문제


The local variable result may not have been initialized


세미콜론 누락 문제

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert ";" to complete Statement


%-5s 포맷 불일치 문제 printf를 사용해서 변수를 호출할때 

Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%-5s'
	at java.base/java.util.Formatter.format(Formatter.java:2790)
	at java.base/java.io.PrintStream.implFormat(PrintStream.java:1367)
	at java.base/java.io.PrintStream.format(PrintStream.java:1346)
	at java.base/java.io.PrintStream.printf(PrintStream.java:1245)
	at com.company.java004_ex.IfEx008_test.main(IfEx008_test.java:39)



box-sizing:border-box;

자동으로 사이즈를 잡아줌?






/* Q1: 페이지 전체에 배경 그라디언트를 적용하고 기본 글꼴과 안쪽 여백을 주려면?
   - 배경: 135도 방향의 그라디언트 (#f0f9ff → #e0f7fa)
   - 글꼴: Arial
   - 안쪽 여백: 30px */

*      {margin:0; 
                padding:0; 
                box-sizing: border-box;} 


body   {font-family:Arial; 
                padding:30px; 
                background-[color]:linear-gradient(135deg, #f0f9ff, #e0f7fa);}	; 이미지써야함


/* Q2: 제목(h1)을 가운데 정렬하고 색상과 아래 여백을 주려면?
   - 정렬: 가운데
   - 글자 색상: #00796b (청록색 계열)
   - 아래 여백: 40px */


h1 {
            text-align:center; 
            color:#00796b; 
            margin-bottom:40px;}

/* Q3: 콘텐츠 박스를 가운데 배치하고 너비를 50%로 설정하려면?
   - 너비: 50%
   - 좌우 자동 마진으로 가운데 정렬 */


div에 container 잡고 거기에 margin: auto값을 주면 가운데 정렬

.container {margin:auto; 
                    box-sizing:border-box; 
                    width:50%;}


/* Q4: 카드 박스를 가로로 배치하고 시각적 스타일을 주려면?
   - float: left (가로 정렬)
   - 너비: 250px
   - 바깥 여백: 20px
   - 안쪽 여백: 20px
   - 배경색: 흰색 (#ffffff)
   - 모서리 둥글게: 15px
   - 그림자: 흐림 효과 (10px)
   - 위치 기준점: relative
   - 텍스트 가운데 정렬
   - 애니메이션: 등장 시 아래에서 위로 이동 (translateY)
   - 테두리: 투명 3px, 배경 클립 설정 */

.card {float:left; 
                width:250px; 
                margin:20px; 
                padding:20px; 
                background-color:#fff;
                border-radius:15px; 
                box-shadow:[0 0 ]10px[ rgba(0,0,0,0.1)]; (틀림) 10px만 쓰면안됨
                position:relative; 
                text-align:center;
                transform:translateY(10px); 
                border: 3px solid [transparent];
                [background-clip:padding-box;}
	    [transition:all 0.3s ease;]
	    
        

/* Q5: 두 번째 카드에 애니메이션 지연을 주려면?  - 지연 시간: 0.3초 
                .card를 대상으로 nth-of-type
                부모를 기준으로   nth-child */
        
            .card:nth-of-type(1) {
                animation-delay: 0.3s;
                background-color:red;
            }
            .card:nth-of-type(2) {
                animation-delay: 0.6s;
                background-color:green;
            }
            .card:nth-of-type(3) {
                animation-delay: 0.9s;
                background-color:blue;

            }


/* Q6: 카드에 마우스를 올렸을 때 효과를 주려면?
   - 위로 이동: 5px
   - 그림자 강조: 15px
   - 테두리 색상 변경: #00796b */



        .card:hover {
            transform:translateY(5px); 
            box-shadow:0 0 15px rgba(0,0,0,0.2); 
            border-color:3px solid #00796b; 
            background:linear-gradient(45deg, #00c9ff, #92fe9d); 
            border-radius:18px;}



/* Q7: 카드에 마우스를 올렸을 때 그라디언트 테두리를 나타내려면?
   - 위치: 카드 바깥쪽 (-3px)
   - 배경: 45도 방향의 그라디언트 (#00c9ff → #92fe9d)
   - 둥근 테두리: 18px
   - 투명도: hover 시 1로 변경 */




/* Q8: 카드 이미지에 크기와 스타일을 주려면?
   - 너비: 120px
   - 높이: 80px
   - 둥근 모서리: 10px
   - 이미지 비율 유지: object-fit: cover
   - 테두리 색상: #00796b */

.card img {
            width:120px; 
            height:80px; 
            border-radius:10px; 
            object-fit:cover; 
	border:[3px solid #00796b];}


/* Q9: 카드 제목(h2)에 글자 크기와 여백, 색상을 주려면?
   - 글자 크기: 18px
   - 여백: 위 15px, 아래 10px
   - 색상: #333 (진회색) */




/* Q10: 카드 설명(p)에 글자 크기와 색상, 아래 여백을 주려면?
   - 글자 크기: 14px
   - 색상: #555 (중간 회색)
   - 아래 여백: 10px */



자기소개 페이지에서 오늘 배운 애니메이션 효과써보기 1개


/* Q11: 카드 오른쪽 상단에 고정된 버튼을 만들고 스타일을 주려면?
   - 위치: absolute (top:10px, right:10px)
   - 배경색: #00796b
   - 글자색: 흰색
   - 패딩: 8px 12px
   - 둥근 모서리: 12px
   - 글자 크기: 13px */

	(class 부여하는게 좋음 a태그에 more-btn(관리를위해서))




/* Q12: 버튼에 마우스를 올렸을 때 색상 변경과 흔들림 효과를 주려면?
   - 배경색 변경: #004d40
   - 애니메이션: shake (0.3초) */




/* Q13: 흔들림(shake) 애니메이션을 정의하려면?
   - 좌우/상하로 2px씩 이동 반복 */




/* Q14: 카드가 아래에서 위로 부드럽게 등장하도록 애니메이션을 정의하려면?
   - 시작: opacity 0, translateY(20px)
   - 종료: opacity 1, translateY(0) */

	옵파시티 투명도 (1원본)


@keyframes fadeInUp {
    to{
        opacity:1;  
        transform: translateY(0)

    }

}

애니메이션 구문 

/* Q15: float를 끊고 아래 설명 박스를 만들려면?
   - clear: both
   - 위 여백: 50px
   - 안쪽 여백: 15px
   - 배경색: #e0f2f1
   - 둥근 모서리: 10px
   - 텍스트 가운데 정렬, 글자색: #333 */


@keyframes 로 애니메이션을 만들고 


animation: fadeInUp      0.8s               ease                        forwards;
애니메이션: 이름       지속시간    처음과 처음과 끝느리게    애니메이션이끝나도 마지막 상태유지


.card::before {
          content:"";
          position:absolute;
          top:-3px; left:-3px; right:-3px; bottom:-3px;
          background-image: linear-gradient(45deg, #00c9ff, #92fe9d);
          opacity:0;
          z-index:-1;
          transition:opacity 0.5s ease;
        }
        .card:hover::before {
            opacity: 1;
        }


제트인덱스로 우선순위를 뒤로 밀어야 밑으로 깔림
안그럼 애니메이션 위로 달려서 덮여버림
