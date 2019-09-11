### [2주차] 로또 - TDD 
###step3. 로또(2등)
<기능 요구사항>
- 2등을 위해 추가 번호를 하나 더 추첨한다. => 보너스 볼 추첨
  - 숫자 입력 하나 더 받기 (보너스볼)
- 당첨 통계에 2등도 추가해야 한다.
  - 당첨통계에 2등에 대한 통계도 내기
  - 당첨 숫자 뽑는 과정에 보너스 볼에 대한 내용도 추가해야함
  - 테스트 코드에 2등 관련 된 테스트 추가하기
- 테스트 하면서 발견된 버그 수정하기 
  - 3개의 로또에서 6개의 번호 당첨하면 1등으로 집계 되는 걸로 보임)
  - 좀 더 상세한 테스트 및 수정 필요. 수정 할 부분은 그때 그때 README에 정리해서 commit.
```
[... 생략 ...]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```
* 프로그래밍 요구사항
  - 구현완료
   1) java enum을 적용해 프로그래밍을 구현한다. - Prize.java (완료)
   3) 규칙 8: 일급 콜렉션을 쓴다. - LottoGenerator.java (완료)
 
   - 최종확인 할 사항
   1) 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
   2) indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
   3) 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
   4) 자바 코드 컨벤션을 지키면서 프로그래밍한다.
   5) else 예약어를 쓰지 않는다.

**힌트**
- 일급 콜렉션을 쓴다.
- 6개의 숫자 값을 가지는 java collection을 감싸는 객체를 추가해 구현해 본다.
- 하드 코딩을 하지 않기 위해 상수 값을 사용하면 많은 상수 값이 발생한다. 자바의 enum을 활용해 상수 값을 제거한다. 즉, enum을 활용해 일치하는 수를 로또 등수로 변경해 본다.
----



### [2주차] 로또 - TDD 
###step2. 로또(자동)
- 기능 요구사항
  - 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - 로또 1장의 가격은 1000원이다.

####2.1 힌트
- 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
- Collections.sort() 메소드를 활용해 정렬 가능하다.
- ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

####2.2 프로그래밍 요구사항
+ 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
* UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
 - indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
 - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
 - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
 - 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
 - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
+ 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
+ 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
+ UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
+ else 예약어를 쓰지 않는다.
+ 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
+ else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

####2.3 기능 목록 및 commit 로그 요구사항
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
-  git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
----
## 2주차 TDD 수업내용 정리

* 단위테스트와 TDD! 다들 어떻게 시작해야하는 지 막막하다.
* MVC..도메인이 중요하데, 모델이 중요하데.. MVC패턴으로 당장 어떻게 나누지?
- 이게 쉽지 않은거야. 다들 그래.
- 테스트 하기 좋은코드, 객체지향을 잘 이뤄어진 코드를 잘 보지 못했기 때문에 당연히 어려움.

###1 .구현할 기능 목록 작성하기
- 기능목록을 작성해봤자 잘 몰라. 어차피 어디서 부터 시작해야할 지 모르겠는거지.
- 하지만, 이것도 자꾸 연습이 필요하다.
- 설계/ 기능목록 작성하기는 연습이 필요하다.
- **그래도 막막하면?**
    1) 일단구현: 단위 테스트도 없이, TDD도 아닌상태로, 객체도 설계하지 않고, 기능목록을 분리하지도 않고 일단 구현
    2) 도메인 지식 쌓기: 구현하려는 프로그래밍의 도메인 지식 쌓기
    3) 구현한 코드 모두 버리기
    4) 구현할 기능 목록 작성 OR 간단한 도메인 설계
    5) 기능 목록 중 가장 만만한 녀석부터 TDD로 구현 시작
    6) 복잡도가 높아져 리팩토링 하기 힘든 상태가 되면 다시 버림
    7) 다시 도전
* 아무 것도 없는 상태에서 새롭게 구현하는 것보다 레거시 코드가 있는 상태에서 리팩토링하는 것은 몇 배 더 어렵다.
따라서, 때에 따라 3) 구현한 코드 모두 버리기가 필요.
* 테스트 하기 어려운 코드의 의존관계를 Object Graph의 상위로 이동시킨다.
- 우리가 테스트 하기 힘든 이유는 테스트하기 힘든코드를 짜고, 테스트 하기 쉬운 구조로 바꾸는 과정을 거치지 않기 때문
- cf. 대표적으로 테스트하기 어려운 코드
    1) 내부API: Random, shuffle, 날짜
    2) 외부세계 : 외부 REST API, 데이터베이스 API
----
### 요구사항 분석 및 설계 방향
####1. 기능 요구사항
 + [입력] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
 + 구입금액 입력받기  → Input
 + 예외상황1) 구매금액X(empty) → Input
 + 예외상황2) 1000원 미만 입력 시→ Input
 - [출력] 로또 1장의 가격은 1000원이다.
 - 몇개 구매했는지 출력 → Output
* [출력] 구매한 로또번호 출력하기 (6자리)
* 로또 자동 생성은 Collections.shuffle() 메소드 활용
* 예외상황1) 구매 개수와 list의 수가 일치하는지 확인  → lotto
* 예외상황2) 출력한 로또번호가 6자리 맞는지 확인 → lotto
* 예외상황3) 출력 될 로또번호 1~45가 맞는지 확인 → lotto
+ [입력] 당첨번호 입력하기 (6자리)
+ 당첨번호 입력받기 → Input
+ 예외상황1) 6자리 미만 입력  → Input
+ 예외상황2) 1~45 이외의 숫자 입력  → Input
+ 예외상황3) 동일한 당첨번호 입력 → Input
- [출력] 당첨 통계내기
- ArrayList의 contains() 메소드를 활용하여 어떤 값이 존재하는지 유무 판단
- ~~N 개일치하는지 check → LottoLottery~~
- 일치결과 출력하기 → Output
- 수익률 계산하기 → LottoLottery

----
#### 기능 요구사항 간단히 요약하면 ####
- 입력받는다. ( View )
  - 로또 구입 금액/ 당첨번호  (입력/출력)
+ 출력한다. ( View )
  + 몇개 구매했는지(View),  구매한 로또번호 (Model)
- 당첨 통계내기  ( Model )
  - 로또 번호, 로또 당첨번호 검사, 몇 장의 로또를 샀는지 출력 / 유효성검사
* Controller(=main): Model과 View를 알맞게 조립한다.
----

 **TDD싸이클**
 - 실패하는 테스트를 구현한다.
 - 테스트가 성공하도록 프로덕션 코드를 구현한다.
 - 프로덕션 코드와 테스트 코드를 리팩토링한다.