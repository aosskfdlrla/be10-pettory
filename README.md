## 2조 펫토리

기능 담당 : 채팅

## 프로젝트 설계
## 요구사항 명세서


-
    [요구사항 명세서](https://docs.google.com/spreadsheets/d/1xn3WYrcm1DOls6SgFvD8YYsPRyOG0y4JGV1NGI4js7w/edit?gid=0#gid=0)
    

  <img src="./images/요구사항_명세서1.PNG" alt="요구사항 명세서 1">
  <img src="./images/요구사항_명세서2.PNG" alt="요구사항 명세서 2">
  <img src="./images/요구사항_명세서3.PNG" alt="요구사항 명세서 3">
  <img src="./images/요구사항_명세서4.PNG" alt="요구사항 명세서 4">
  <img src="./images/요구사항_명세서5.PNG" alt="요구사항 명세서 5">
  <img src="./images/요구사항_명세서6.PNG" alt="요구사항 명세서 6">
    
## 데이터베이스

### 논리 모델링

- 논리 모델링
    
    <img src="./images/논리_모델링3.PNG" alt="논리 모델링 3">

    <img src="./images/논리_모델링4.PNG" alt="논리 모델링 4">
    
### 물리 모델링

- 물리 모델링
    
    ![물리 모델링3.PNG](./images/물리_모델링3.PNG)
    
    ![물리 모델링4.PNG](./images/물리_모델링4.PNG)

    ![물리 모델링5.PNG](./images/물리_모델링5.PNG)   

    ![물리 모델링6.PNG](./images/물리_모델링6.PNG)   

    ![물리 모델링7.PNG](./images/물리_모델링7.PNG)   

    ![물리 모델링8.PNG](./images/물리_모델링8.PNG)   

    ![물리 모델링9.PNG](./images/물리_모델링9.PNG)   


### DDL
-
    [DDL 다운로드](./images/펫토리%20DDL%20v.07.txt)



## 기능 설계서(API)
<details>
  <summary>기능 설계서</summary>
  <div markdown="1">

  ![API 명세](./images/API%20명세서.png)  


</div>
</details>  


## 테스트 결과 보고서
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
