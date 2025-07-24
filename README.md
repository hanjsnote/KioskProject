# KioskProject
1. 프로젝트 구성: 

2. 프로젝트 개발 환경: 런타임 버전: 21.0.7+9-b895.130 aarch64 (JCEF 122.1.9) VM: JetBrains s.r.o.의 OpenJDK 64-Bit Server VM JDK: corretto-17 Amazon Corretto-17.0.15 - aarch64

3. 개발 기간: 2025.07.16 ~ 2025.07.23

4. 날짜별 개발
   16일: 전체적인 요구사항 숙지, 초반 설계, Lv1 리스트로 메뉴 저장 출력, Lv2 MenuItem 클래스 생성 메뉴 기능 분리
   17일: Lv3 Kiosk 클래스 생성 MenuItem 클래스 관리
   18일: Lv4 Menu 클래스 생성 MenuItem 클래스 관리
   21일: Lv5 캡슐화 적용 관리자 모드 추가
   22일: 도전 기능 Lv1 Cart 클래스 생성 장바구니 및 구매하기 기능 추가
   23일: Manager 클래스 생성 관라자 기능 분리, 도전 기능 Lv2 CustomerType 클래스 생성 Enum을 활용한 할인율 적용

5. 클래스/패키지 구조
   - src
    └─ main
       └─ java
           └─ Kiosk
               ├─ Main.java          // main() 메서드로 프로그램 실행 시작
               ├─ Kiosk.java         // start()로 전체 흐름 제어 클래스
               ├─ MenuItem.java      // 메뉴 항목 데이터 클래스
               ├─ Menu.java          // 메뉴 목록 관리 클래스
               ├─ Cart.java          // 장바구니 기능 관리 클래스
               ├─ Manager.java       // 관리자 기능 클래스
               ├─ CustomerType.java  // Enum을 통한 할인율 클래스

6. 기능 모듈
   1. 메뉴 출력 및 선택 기능
   2. 장바구니 담기 및 비우기, 주문 기능
   3. 관리자 모드: 메뉴 추가/수정/삭제
   4. Enum을 활용한 고객 할인율
  
7. 실행 방법
   Java 17이상 설치 팔요
   Main.java의 main() 실행시 프로그램 시작

8. 트러블 슈팅 및 회고: https://hanjsnote.tistory.com/42
   
   
