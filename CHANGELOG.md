#### 1.0.0 (2025-10-27)

##### Build System / Dependencies

*  upgrade Gradle versions ([75a4d663](https://github.com/Fiddich-Dev/java-racingcar-8/commit/75a4d6639cf12324f8fd743a3704527a655b0adf))

##### Documentation Changes

* **readme:**  리드미 요구사항 체크완료 ([950f23f2](https://github.com/Fiddich-Dev/java-racingcar-8/commit/950f23f2612244826597b04f89e0010bbeabcc97))
* **README:**  기능 목록 및 프로그래밍 요구사항 정리, 예외 상황 추가 ([24a3bd82](https://github.com/Fiddich-Dev/java-racingcar-8/commit/24a3bd82bf183085511faa747ded4b92174f0fe9))

##### New Features

* **test:**
  *  junit을 사용해 테스트 코드 작성 ([c8051933](https://github.com/Fiddich-Dev/java-racingcar-8/commit/c8051933f78842d0ee65ad44245a318373296711))
  *  예외상황 테스트 작성 ([d7cb0180](https://github.com/Fiddich-Dev/java-racingcar-8/commit/d7cb0180db2520b8e199a0d98e79e1a606dc0aec))
* **parser:**  자동차 이름이 겹칠때 예외처리 추가 ([5fbaba17](https://github.com/Fiddich-Dev/java-racingcar-8/commit/5fbaba175387f32d1a5ebc2834c1954ceb5abd78))
* **controller:**  finally 블럭으로 입력이 완료된 후 Scanner를 비워줌 ([3efdb076](https://github.com/Fiddich-Dev/java-racingcar-8/commit/3efdb0761694ec950e189af1de26b61fa7fdbece))
* **Car:**  차 이름이 5글자가 비어있거나 제한수를 초과하면 예외발생 ([20c87c4e](https://github.com/Fiddich-Dev/java-racingcar-8/commit/20c87c4ead5624cc145d6ec9483209bcc99bea41))
*  입력을 받고 경주를 하는 컨트롤러 생성 ([c0d59a80](https://github.com/Fiddich-Dev/java-racingcar-8/commit/c0d59a80c5773a3794ed13fddd1e4ed24c858ecf))
*  경주 진행로직 구현 ([0d1146b4](https://github.com/Fiddich-Dev/java-racingcar-8/commit/0d1146b47342b84d7dd90aea6a10f3ab69e4b0af))
*  setup project ([5ec13447](https://github.com/Fiddich-Dev/java-racingcar-8/commit/5ec134471d4ad7798af498020b4179d887b21a52))
* **I/O:**  입력값 검증과 파싱, 결과 출력 기능 추가 ([1bda1f0c](https://github.com/Fiddich-Dev/java-racingcar-8/commit/1bda1f0c8289aaa7add392e475ea287588d39882))

##### Refactors

*  ide 코드포맷팅 적용 ([1c790772](https://github.com/Fiddich-Dev/java-racingcar-8/commit/1c790772f1c6d2dfebd7e2463344c0eae21799c1))
* **parser:**  Parser 의미없는 변수이름 수정 ([723d0f17](https://github.com/Fiddich-Dev/java-racingcar-8/commit/723d0f17004495730e57ef68dbf29c2705adffd2))
* **controller:**
  *  주석제거 ([579ea4f7](https://github.com/Fiddich-Dev/java-racingcar-8/commit/579ea4f77f7a9cbca6f62423f4657d4375ce9355))
  *  RaceSumulator를 주입받지 않고 내부에서 생성하도록 변경 ([bdd1d834](https://github.com/Fiddich-Dev/java-racingcar-8/commit/bdd1d83413a86342cf6c374bcf8019f0eddfb91c))
* **parser, view:**  parser 추상클래스로 변경, view 추상화 제거 ([9f2da4b9](https://github.com/Fiddich-Dev/java-racingcar-8/commit/9f2da4b9eb60826f707e3024ee49ebb75def42b7))
* **simulator:**
  *  RaceSimulator의 메서드 이름을 더 직관적으로 변경 ([814be650](https://github.com/Fiddich-Dev/java-racingcar-8/commit/814be6509afd9453acf265db13419dff1d77732d))
  *  RaceSimulator가 carNames를 주입받는 형태로 변경 ([48db5482](https://github.com/Fiddich-Dev/java-racingcar-8/commit/48db54821e97324b63004ce2bec28150171083e7))
* **package:**  controller와 simulator 패키지 생성후 이동 ([1efdd373](https://github.com/Fiddich-Dev/java-racingcar-8/commit/1efdd37356ff3406e889aa09ab5d9cbc1e1a5a44))

