### [2주차] 로또 - TDD 
###step4. 로또(수동)
## 요구사항 분석
- 수동으로 구매 할 로또 수 입력 받기
    - 수동/자동 각각 몇 장 구매 했는지 출력하기
    - 수동/자동 구매한 로또 번호 출력하여 보여주기 
- 수동으로 구매할 로또 번호 입력 받기
    - 자동으로 구매한 로또와 합쳐야함 (Set자료구조를 merge해서 구현)
    - 수동으로 구매 할 로또 번호의 유효성 처리
        - LottoNumber → List`<`LottoNumber`>` → Lotto 의 형식으로 만들어간다.
        - 위의 형식으로 만들면 기존 메소드를 이용해서 유효성 처리까지 끝낼 수 있다.
## 기능 요구사항

- 현재 로또 생성기는 자동 생성 기능만 제공한다. 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
- 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.

```
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

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

------

## 프로그래밍 요구사항

- **규칙 3: 모든 원시값과 문자열을 포장한다.**
- **규칙 5: 줄여쓰지 않는다(축약 금지).**
- **예외 처리를 통해 에러가 발생하지 않도록 한다.**
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- java enum을 적용해 프로그래밍을 구현한다.
- 규칙 8: 일급 콜렉션을 쓴다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- else 예약어를 쓰지 않는다.

------

#### 힌트

- 규칙 3: 모든 원시값과 문자열을 포장한다.
  - 로또 숫자 하나는 int 타입이다. 이 숫자 하나를 추상화한 LottoNo 객체를 추가해 구현한다.
- 예외 처리를 통해 에러가 발생하지 않도록 한다.
  - 사용자가 잘못된 값을 입력했을 때 java exception으로 에러 처리를 한다.
  - java8에 추가된 Optional을 적용해 NullPointerException이 발생하지 않도록 한다.

------

## 기능 목록 및 commit 로그 요구사항

- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
