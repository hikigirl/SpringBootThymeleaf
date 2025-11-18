# ThymeLeaf

### 프로젝트 생성
- Name: "thymeleaf"
- Language: Java
- Type: Gradle - Groovy
- Group: "com.test"
- Artifact: "thymeleaf"
- Package name: "com.test.thymeleaf"
- Java: 17
- Packaging: jar
- Dependencies:
  - Spring Web
  - Lombok
  - Oracle Driver
  - MyBatis Framework
  - Thymeleaf
  - Spring Boot DevTools

### Thymeleaf
- 자바 템플릿 엔진
- 서버 측(자바 애플리케이션)에서 동적으로 HTML을 생성하는 기술
- JSP 역할(JSP는 톰캣에 종속적)
- Thymeleaf(공식), Mustach, Freemaker, Velocity 등...

### Mybatis 설정
- resources : application.properties -> mybatis-config.xml말고 여기서 alias를 지정함
- resources/mapper: AddressMapper.xml
- resources/templates: ex01.html
- com.test.thymeleaf.mapper: AddressMapper.java(I)
- com.test.thymeleaf.dto: AddressDTO.java
- com.test.thymeleaf.controller: TestController.java

### Thymeleaf Standard Expression, Thymeleaf 표현식
EL + JSTL 역할
- Variable Expression, 변수 표현식
- Selection Variable Expression, 선택 변수 표현식
- Message Expression, 메시지 표현식
- Link URL Expression, 링크 표현식
- Fragment Expression, 조각 페이지 표현식(include)
- 타임리프 표현식의 특징
  - th 접두어로 시작한다(namespace를 선언한 이유이기도 ...)
  - 대다수를(99%) HTML 태그의 속성값으로 표현
  - 타임리프 태그는 딱 한개만 제공
---

1. Variable Expression, 변수 표현식
   1. `${}`
   2. EL 역할, 컨트롤러부터 전달된 값을 출력/사용하는 용도
2. Selection Variable Expression, 선택 변수 표현식
3. Message Expression, 메시지 표현식
4. Link URL Expression, 링크 표현식
5. Fragment Expression, 조각 페이지 표현식(include)

### Spring Message
- 프로젝트 내에서 자주 사용하는(반복되는) 문자열 관리 기능
- 상수 문자열 관리
- src/main/resources : `messages.properties`

### 타임리프 연산자
- 산술, 비교, 논리, 삼항 => Java & EL과 동일
- `?:` : 엘비스 연산자

### 타임리프로 HTML 태그 속성 조작하기
- 태그의 대부분의 속성에 `th:`를 붙일 수 있다.
- `th:` 붙인 속성에는 타임리프를 적용할 수 있다.

### 타임리프로 콘텐츠 조작하기
- PCDATA 조작
- 자식태그 조작
- innerText(textContent)
- innerHTML

#### Thymeleaf Text
1. `th:text`: escaped text -> innerText
2. `th:utext`: unescaped text -> innerHTML
3. 인라인 출력
   1. `th:inline="text"`: default
   2. `th:inline="javascript"` : javascript의 script 태그에서 사용
   3. `th:inline + [[]]`: `th:text`
   4. `th:inline + [()]`: `th:utext`