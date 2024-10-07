## 반려동물과 함께 만들어 가는 나의 이야기 펫토리

![펫토리 아이콘](./images/어플_아이콘.PNG)

# 2조 펫토리

김지민, 박지훈, 이은서, 연건창, 한동주, 황희순

### 프로젝트 배경

![프로젝트 배경 1.PNG](./images/프로젝트_배경1.PNG)

![프로젝트 배경 2.PNG](./images/프로젝트_배경2.PNG)

### 반려동물과 함께하는 사람이 많아진 요즘 반려동물과 관련된 여러 행동을 타인과 함께 하세요.

### 서비스 소개

1. 다른 사람들과 함께 산책하는 모임 - 산책 모임
2. 다른 사람들과 함께 구매하는 반려동물 물품 - 공동 구매
3. 나의 반려동물에 대한 고민 해결 - 상담
4. 다른 사람들과 여러가지 정보를 공유 - 게시판
5. 나의 반려동물과의 함께 남기는 기록 - 반려동물 기록

### 

# 프로젝트 설계
## 요구사항 명세서
<details>
<summary>요구사항 명세서</summary>
<div markdown="1">


    [GitHub](https://docs.google.com/spreadsheets/d/1xn3WYrcm1DOls6SgFvD8YYsPRyOG0y4JGV1NGI4js7w/edit?gid=0#gid=0)
    

  <img src="./images/요구사항_명세서1.PNG" alt="요구사항 명세서 1">
  <img src="./images/요구사항_명세서2.PNG" alt="요구사항 명세서 2">
  <img src="./images/요구사항_명세서3.PNG" alt="요구사항 명세서 3">
  <img src="./images/요구사항_명세서4.PNG" alt="요구사항 명세서 4">
  <img src="./images/요구사항_명세서5.PNG" alt="요구사항 명세서 5">
  <img src="./images/요구사항_명세서6.PNG" alt="요구사항 명세서 6">

</div>
</details>

   ### BoundedContext

   <details>
   <summary> BoundedContext</summary>
   <div markdown="1">

- BoundedContext
    
    ![회원.png](/images/회원.png)
    
    ![프로필.png](/images/프로필.png)
    
    ![게시판.png](./images/게시판.png)
    
    ![상담.png](./images/상담.png)
    
    ![산책 모임.png](./images/산책%20모임.png)
    
    ![공동 구매.png](./images/공동%20구매.png)
    
    ![채팅.png](./images/채팅.png)

</div>
</details>
    
## 데이터베이스

### 논리 모델링


 <details>
   <summary> 논리 모델링</summary>
   <div markdown="1">
   
- 논리모델링 사진
    
    <img src="./images/논리_모델링3.PNG" alt="논리 모델링 3">

    <img src="./images/논리_모델링4.PNG" alt="논리 모델링 4">


    </div>
</details>
    

### 물리 모델링

 <details>
   <summary> 물리 모델링</summary>
   <div markdown="1">


- 물리 모델링 사진
    
    ![물리 모델링3.PNG](./images/물리_모델링3.PNG)
    
    ![물리 모델링4.PNG](./images/물리_모델링4.PNG)

    ![물리 모델링5.PNG](./images/물리_모델링5.PNG)   

    ![물리 모델링6.PNG](./images/물리_모델링6.PNG)   

    ![물리 모델링7.PNG](./images/물리_모델링7.PNG)   

    ![물리 모델링8.PNG](./images/물리_모델링8.PNG)   

    ![물리 모델링9.PNG](./images/물리_모델링9.PNG)   

    </div>
</details>   

### DDL
 <details>
   <summary>DDL</summary>
   <div markdown="1">

    [DDL 다운로드](./images/펫토리%20DDL%20v.07.txt)

    </div>
</details> 

## 기능 설계서(API)
<details>
  <summary>기능 설계서</summary>
  <div markdown="1">

  ![API 명세 1](./images/API%20명세%201.png)  
  ![API 명세 2](./images/API%20명세%202.png) 

    </div>
</details>  


## 테스트 결과 보고서
<details>
  <summary>테스트 결과</summary>
  <div markdown="1">



### 채팅

 <details>
   <summary>채팅</summary>
   <div markdown="2">

- 채팅
    
    ## 채팅 방 생성 기능
    
    - 산책 모임 방, 공동 구매 모임 방이 생성되었을 때 해당 URL 이 호출되어 채팅 방이 자동으로 만들어진다.
    
    ![채팅방 생성 기능](./images/채팅방_생성기능.png)
    
    ## 실시간 채팅 기능
    
    - 실시간으로 서버에 채팅을 전송 할 수 있다.
    
    ![실시간 채팅 기능](./images/실시간_채팅기능.png)
    
    - DB
    
    ![채팅 DB](./images/채팅.png)
    
    ## 채팅 수정 기능
    
    - 작성한 채팅을 수정할 수 있다.
    
    ![채팅 수정 기능](./images/채팅_수정기능.png)
    
    ## 채팅 소프트 삭제
    
    - 채팅 상태를 DELETE 로 바꾸고 DB에서는 삭제를 안 하는 소프트 삭제를 실행 한다.
    
    ![채팅 소프트 삭제](./images/채팅_소프트_삭제.png)
    
    ## 채팅 하드 삭제
    
    - 채팅을 DB에서 완전 삭제 한다.
    
    ![채팅 하드 삭제](./images/채팅_하드_삭제.png)
    
    ## 채팅 기록 조회
    
    - 채팅 방의 채팅 기록을 조회한다.
    
    ![채팅 기록 조회](./images/채팅기록_조회.png)

        </div>
    </details>   
    
     



### 게시판

 <details>
   <summary>게시판</summary>
   <div markdown="2">

- 게시판
    
    ## 게시글 작성
    
    ![게시글 작성](./images/1_게시글작성.png)

    ## 게시글 수정
    
    ![게시글 수정](./images/2_게시글수정.png)

    ## 게시글 삭제
    
    ![게시글 삭제](./images/3_게시글삭제.png)

    ## 게시글 목록 조회
    
    ![게시글 목록 조회](./images/4_게시물목록조회.png)

    ## 번호로 게시글 조회
    
    ![번호로 게시글 조회](./images/5_번호로게시글조회.png)

- 댓글

    ## 댓글 작성
    
    ![댓글 작성](./images/1_댓글작성.png)

    ## 댓글 수정
    
    ![댓글 수정](./images/2_댓글수정.png)

    ## 댓글 삭제
    
    ![댓글 삭제](./images/3_댓글삭제.png)

    ## 댓글 조회
    
    ![댓글 조회](./images/4_댓글조회.png)

- 카테고리    

    ## 카테고리 등록
    
    ![카테고리 등록](./images/1_카테고리등록.png)

    ## 카테고리 수정
    
    ![카테고리 수정](./images/2_카테고리수정.png)

    ## 카테고리 삭제
    
    ![카테고리 삭제](./images/3_카테고리삭제.png)

    ## 카테고리 조회
    
    ![카테고리 조회](./images/4_카테고리조회.png)


        </div>
    </details>   
    
 

### 상담

 <details>
   <summary>게시판</summary>
   <div markdown="2">

- 상담

    ## 답변 등록
    
    ![답변 등록](./images/상담/답변등록.png)

    ## 답변 삭제
    
    ![답변 삭제](./images/상담/답변삭제.png)

    ## 답변 수정
    
    ![답변 수정](./images/상담/답변수정.png)

    ## 재답변 등록
    
    ![재답변 등록](./images/상담/재답변등록.png)

    ## 질문 등록
    
    ![질문 등록](./images/상담/질문등록.png)

    ## 질문 삭제
    
    ![질문 삭제](./images/상담/질문삭제.png)

    ## 질문 수정
    
    ![질문 수정](./images/상담/질문수정.png)

    ## 질문 전체 조회(검색)
    
    ![질문 전체 조회(검색)](./images/상담/질문전체조회(검색).png)

    ## 특정질문조회(닉네임)
    
    ![특정질문조회(닉네임)](./images/상담/특정질문조회(닉네임).png)

    ## 특정질문조회(번호)
    
    ![특정질문조회(번호)](./images/상담/특정질문조회(번호).png)
    
        </div>
    </details>   
    


### 공동구매

 <details>
   <summary>게시판</summary>
   <div markdown="2">

- 공동구매모임

    ## 공동구매모임목록조회
    
    ![공동구매모임목록조회](./images/공동구매/공동구매모임/1_공동구매모임목록조회.png)

    ## 현재사용자가참여한공동구매모임목록조회
    
    ![현재사용자가참여한공동구매모임목록조회](./images/공동구매/공동구매모임/2_현재사용자가참여한공동구매모임목록조회.png)

    ## 공동구매모임등록
    
    ![공동구매모임등록](./images/공동구매/공동구매모임/3_공동구매모임등록.png)

    ## 공동구매모임수정
    
    ![공동구매모임수정](./images/공동구매/공동구매모임/4_공동구매모임수정.png)

    ## 공동구매모임상세조회
    
    ![공동구매모임상세조회](./images/공동구매/공동구매모임/5_공동구매모임상세조회.png)

    ## 공동구매모임삭제
    
    ![공동구매모임삭제](./images/공동구매/공동구매모임/6_공동구매모임삭제.png)

    ## 공동구매모임참가
    
    ![공동구매모임참가](./images/공동구매/공동구매모임/7_공동구매모임참가.png)

    ## 공동구매방장물품배송정보등록
    
    ![공동구매방장물품배송정보등록](./images/공동구매/공동구매모임/8_공동구매방장물품배송정보등록.png)

    ## 공동구매모임나가기
    
    ![공동구매모임나가기](./images/공동구매/공동구매모임/9_공동구매모임나가기.png)

    ## 공동구매모임강퇴
    
    ![공동구매모임강퇴](./images/공동구매/공동구매모임/10_공동구매모임강퇴.png)

    ## 지급기록조회
    
    ![지급기록조회](./images/공동구매/공동구매모임/11_지급기록조회.png)

    ## 공동구매물품배송정보조회
    
    ![공동구매물품배송정보조회](./images/공동구매/공동구매모임/12_공동구매물품배송정보조회.png)

- 공동구매참가

    ## 현재공동구매모임참가의전체사용자목록조회
    
    ![현재공동구매모임참가의전체사용자목록조회](./images/공동구매/공동구매참가/1_현재공동구매모임참가의전체사용자목록조회.png)

    ## 공동구매참가등록
    
    ![공동구매참가등록](./images/공동구매/공동구매참가/2_공동구매참가등록.png)

    ## 공동구매참가취소
    
    ![공동구매참가취소](./images/공동구매/공동구매참가/3_공동구매참가취소.png)

    ## 공동구매참가자물품배송정보등록
    
    ![공동구매참가자물품배송정보등록](./images/공동구매/공동구매참가/4_공동구매참가자물품배송정보등록.png)

    ## 공동구매참가자물품수령으로변경
    
    ![공동구매참가자물품수령으로변경](./images/공동구매/공동구매참가/5_공동구매참가자물품수령으로변경.png)

    ## 공동구매물품배송정보조회
    
    ![공동구매물품배송정보조회](./images/공동구매/공동구매참가/6_공동구매물품배송정보조회.png)

- 즐겨찾기

    ## 즐겨찾기된모임조회
    
    ![즐겨찾기된모임조회](./images/공동구매/즐겨찾기/1_즐겨찾기된모임조회.png)

    ## 즐겨찾기등록
    
    ![즐겨찾기등록](./images/공동구매/즐겨찾기/2_즐겨찾기등록.png)

    ## 즐겨찾기삭제
    
    ![즐겨찾기삭제](./images/공동구매/즐겨찾기/3_즐겨찾기삭제.png)

- 카테고리

    ## 카테고리목록조회
    
    ![카테고리목록조회](./images/공동구매/카테고리/1_카테고리목록조회.png)

    ## 카테고리등록
    
    ![카테고리등록](./images/공동구매/카테고리/2_카테고리등록.png)

    ## 카테고리수정
    
    ![카테고리수정](./images/공동구매/카테고리/3_카테고리수정.png)

    ## 카테고리삭제
    
    ![카테고리삭제](./images/공동구매/카테고리/4_카테고리삭제.png)

        </div>
    </details> 

### 산책모임

 <details>
   <summary>산책모임</summary>
   <div markdown="2">

- 산책모임

    ## 가입한산책모임등록
    
    ![가입한산책모임등록](./images/산책모임/가입한산책모임등록.png)

    ## 가입한산책모임삭제
    
    ![가입한산책모임삭제](./images/산책모임/가입한산책모임삭제.png)

    ## 가입한산책모임수정
    
    ![가입한산책모임수정](./images/산책모임/가입한산책모임수정.png)

    ## 가입한산책모임조회
    
    ![카테고리삭가입한산책모임조회제](./images/산책모임/가입한산책모임조회.png)

    ## 산책모임기록등록
    
    ![산책모임기록등록](./images/산책모임/산책모임기록등록.png)

    ## 산책모임기록삭제
    
    ![산책모임기록삭제](./images/산책모임/산책모임기록삭제.png)

    ## 산책모임기록수정
    
    ![산책모임기록수정](./images/산책모임/산책모임기록수정.png)

    ## 산책모임기록조회
    
    ![산책모임기록조회](./images/산책모임/산책모임기록조회.png)

    ## 산책모임등록
    
    ![산책모임등록](./images/산책모임/산책모임등록.png)

    ## 산책모임삭제
    
    ![산책모임삭제](./images/산책모임/산책모임삭제.png)

    ## 산책모임수정
    
    ![산책모임수정](./images/산책모임/산책모임수정.png)

    ## 산책모임신청등록
    
    ![산책모임신청등록](./images/산책모임/산책모임신청등록.png)

    ## 산책모임신청삭제
    
    ![산책모임신청삭제](./images/산책모임/산책모임신청삭제.png)

    ## 산책모임신청수정
    
    ![산책모임신청수정](./images/산책모임/산책모임신청수정.png)

    ## 산책모임신청조회
    
    ![산책모임신청조회](./images/산책모임/산책모임신청조회.png)

    ## 산책모임조회
    
    ![산책모임조회](./images/산책모임/산책모임조회.png)

    ## 특정산책모임기록조회
    
    ![특정산책모임기록조회](./images/산책모임/특정산책모임기록조회.png)

    ## 특정산책모임신청조회
    
    ![특정산책모임신청조회](./images/산책모임/특정산책모임신청조회.png)

    ## 특정산책모임조회
    
    ![특정산책모임조회](./images/산책모임/특정산책모임조회.png)

    ## 특정회원의가입한산책모임조회
    
    ![특정회원의가입한산책모임조회](./images/산책모임/특정회원의가입한산책모임조회.png)

         </div>
    </details> 

### 가족

 <details>
   <summary>가족</summary>
   <div markdown="2">

- 가족

    ## 다른회원을가족으로초대
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-1다른회원을가족으로초대.png)

    ## 받은가족초대조회
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-2받은가족초대조회.png)

    ## 가족초대거절
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-3가족초대거절.png)

    ## 가족초대수락
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-4가족초대수락.png)

    ## 가족에서회원삭제
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-5가족에서회원삭제.png)

    ## 가족정보조회
    
    ![특정회원의가입한산책모임조회](./images/가족/pm-가족-6가족정보조회.png)

        </div>
    </details> 

### 급여기록

 <details>
   <summary>급여기록</summary>
   <div markdown="2">

- 급여기록

    ## 급여기록등
    
    ![급여기록등](./images/급여기록/pm-급여기록-1급여기록등록.png)

    ## 급여기록수정
    
    ![급여기록수정](./images/급여기록/pm-급여기록-2급여기록수정.png)

    ## 급여기록삭제
    
    ![급여기록삭제](./images/급여기록/pm-급여기록-3급여기록삭제.png)

    ## 급여기록월별조회
    
    ![급여기록월별조회](./images/급여기록/pm-급여기록-4급여기록월별조회.png)

    ## 급여기록날짜별조회
    
    ![급여기록날짜별조회](./images/급여기록/pm-급여기록-5급여기록날짜별조회.png)

    ## 급여기록날짜별상세조회
    
    ![급여기록날짜별상세조회](./images/급여기록/pm-급여기록-6급여기록날짜별상세조회.png)

        </div>
    </details>     

### 반려동물

 <details>
   <summary>반려동물</summary>
   <div markdown="2">

- 반려동물

    ## 반려동물조회
    
    ![반려동물조회](./images/반려동물/pm-반려동물-1반려동물조회.png)
    
    ## 반려동물등록
    
    ![반려동물등록](./images/반려동물/pm-반려동물-2반려동물등록.png)

    ## 반려동물수정
    
    ![반려동물수정](./images/반려동물/pm-반려동물-3반려동물수정.png)

    ## 반려동물삭제
    
    ![반려동물삭제](./images/반려동물/pm-반려동물-4반려동물삭제.png)


        </div>
    </details> 

### 산책기록

 <details>
   <summary>산책기록</summary>
   <div markdown="2">

- 산책기록

    ## 산책기록등록
    
    ![산책기록등록](./images/산책기록/pm-산책기록-1산책기록등록.png)

    ## 산책기록수정
    
    ![산책기록수정](./images/산책기록/pm-산책기록-2산책기록수정.png)

    ## 산책기록삭제
    
    ![산책기록삭제](./images/산책기록/pm-산책기록-3산책기록삭제.png)

    ## 산책기록월별조회
    
    ![산책기록월별조회](./images/산책기록/pm-산책기록-4산책기록월별조회.png)

    ## 산책기록날짜별조회
    
    ![산책기록날짜별조회](./images/산책기록/pm-산책기록-5산책기록날짜별조회.png)

    ## 산책기록날짜별상세조회
    
    ![산책기록날짜별상세조회](./images/산책기록/pm-산책기록-6산책기록날짜별상세조회.png)

        </div>
    </details> 

### 유저

 <details>
   <summary>유저</summary>
   <div markdown="2">

- 유저

    ## 회원가입
    
    ![회원가입](./images/유저/pm-유저-1회원가입.png)

    ## 로그인
    
    ![로그인](./images/유저/pm-유저-2로그인.png)

    ## 회원정보조회
    
    ![회원정보조회](./images/유저/pm-유저-3회원정보조회.png)

    ## 비밀번호변경
    
    ![비밀번호변경](./images/유저/pm-유저-4비밀번호변경.png)
    

        </div>
    </details> 

  </div>
</details> 

## 팀 회고

<details>
   <summary>팀 회고</summary>
   <div markdown="1">

김지민 : Spring을 처음 접해봐서 어려웠던 점이 많았다. 처음 보는 용어, 어노테이션을 언제, 어떤 방식으로 써야하는 지, 작성한 파일들이 어떤 식으로 작동하는 지 등을 접해본 적이 생소해서 헤맸지만 팀원들의 도움으로 문제를 해결할 수 있었다. 프로젝트를 하면서 생소했던 Spring의 작성한 파일들의 작동방식을 전보다는 이해할 수 있었다. 다음에 Spring을 쓸 때는 더 익숙해져서 능숙하게 할 수 있으면 좋겠다. 

박지훈 : Spring boot 를 배우면서 팀원들과 각자의 기능 파트 하나씩을 맡아도 충분히 해결이 가능하다고 생각했다. 구현을 하면서 부족한 부분이 생기고, 수정하기를 반복하니 시간이 어느덧 촉박해져 왔고, 더욱 완성도를 높이기 위해서 노력을 했으나 몇몇 기능들을 구현하지 못하였다. 하지만 진행하면서 어떤 부분에 문제가 있고, 해결하는 능력이 길러졌다는 것이 몸소 느껴지는 것 같았다.  그리고 다른 사람들이 작성한 코드를 읽는 실력이나 구조 파악에 대해 향상됨을 느꼈고, 이를 어떻게 보완해야 할지도 어느정도 감을 잡았다는 것에서 부족한 부분이 많지만 좋은 프로젝트였다고 생각한다. 또한 팀원들에게 많은 도움과 배움을 얻었고, 함께 프로젝트를 진행하며 왜 팀프로젝트 경험이 중요한지를 깨닫는 시간이 되었던 것 같다.

이은서 : 호기롭게 시작했지만 꽤나 고생했다. 신나서 이 기능 저 기능 다 붙였다가 시간에 쫓겨서 많이도 잘라냈다. 구현할 기능에 대해 깊이 고민하지 않고 시작해서 코드를 짜면서 로직과 DB가 자주 바뀌어서 힘들기도 했다. 대신 바뀔 때마다 테스트를 여러 번 해서 많은 오류에 익숙해질 수 있었다^^
배울 때는 몰랐는데, 프로젝트를 진행하면서 JPA가 얼마나 편한지 절절하게 느끼기도 했다.
이번 프로젝트는 각자 기능 구현에 골몰하느라, 서로의 코드를 봐주거나 자잘한 규칙을 잘 지켰는지 확인할 시간이 없어서 아쉽다. 이래저래 밀려서 부족한 부분들을 보완해서 프론트엔드 단까지 빨리 직접 만들고 싶다!

연건창 : 프로젝트를 처음 접하면서, 낯선 용어와 어노테이션 사용법, 기능들이 어떻게 작동하는지에 대한 이해 부족으로 어려움을 겪었다. 하지만 혼자였다면 더 어려웠을 것을 팀원들의 도움 덕분에 점차 문제들을 해결할 수 있었고, Spring의 구조도 조금씩 이해하게 되었다.
동시에 그 과정에서 문제를 해결하는 능력이 많이 향상되었고, 다른 사람의 코드를 읽고 구조를 파악하는 실력도 나아졌음을 느꼈다. 수정과 보완을 계속 반복하다 보니 시간이 촉박해져 일부 기능을 완성하지 못한 점이 아쉬워 다음 번에는 더 익숙해져 능숙하게 사용할 수 있기를 희망한다.
또한, Spring Boot뿐만 아니라 MyBatis, JPA 같은 백엔드 기술에 대해 배운 것들을 다시 복습하며 실전에 적용해 백엔드 기술의 편리함을 직접 경험하면서, 더 효율적이고 간결한 코드를 작성하고 싶다는 목표도 생겼다. 이번 프로젝트에서는 각자의 작업에 몰두하느라 팀원들의 코드 리뷰나 규칙을 지키는 부분에서 다소 부족한 점이 있었지만, 이를 보완해 더 나은 결과물을 만들 계획이다.
이번 프로젝트를 통해 팀워크의 중요성과 문제 해결 능력을 크게 키웠으며, 더 좋은 코드를 작성하고 팀원들과의 소통을 원활히 하여 완성도 높은 프로젝트를 만들고 싶다. 

한동주 : Spring은 처음 사용해보았는데 어려운 점도 있었지만 배워가면서 점점 발전해가는것을 느껴서 좋았다. 좀 많이 헤메서 기능 구현등에 수정도 많이 해보고 오류도 많이 찾아보면서 많은 것을 배운것 같다. 다음에는 더 공부를 많이 해서 더 간결하고 좋은 코드를 작성해보고 싶다. 처음 하는 부분이다 보니 여유가 없어 팀원들과 소통을 더 많이 하지 못한것이 아쉬웠다. 하지만 팀원들이 모르는 부분을 알려주지 않았으면 상당히 힘들뻔 했지만 다들 친절하게 알려주셨다. 우리 팀원들 최고!

황희순 : 처음으로 실시간 통신을 다루고 채팅이라는 기능에 대한 구현을 하면서 Spring Boot 에 대해 더 익숙해 질 수 있었고 JPA, MyBatis, Security 등등 백엔드 기술에 대해서 배운 것을 다시 복습하며 사용해보는 것이 너무나 좋았다. 아쉬운 점은 초반부에 시간과 일정을 고려하지 않고 너무 많은 기능들을 넣어서 하나의 기능에 대해서 완성도 있게 작업을 하지 못한 것이 아쉽고 짧은 시간안에 많은 것을 구현하려다 보니 다른 팀원의 코드나 도움을 주지 못하고 다른 기능과 고려해서 코드를 작성하려는 부분이 조금 부족했던 것이 아쉽게 느껴졌다. 프론트 엔드까지 시간이 좀 더 있으니 그 때까지 보완을 하면 더 좋을 거 같다.     

  </div>
</details> 