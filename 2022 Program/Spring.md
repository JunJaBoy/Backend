# java



## Spring MVC

- **MVC** : Model, View, Controller
  - Model : VO, DAO, DAOimpl
  - View : ????.jsp



## web

### server (Backend)

- java



### client (Frontend)

- jsp
- css
- html
- js



### context / contextPath

- path는 슬래시를 포함한 경로

- context
  http://localhost:8080/<이곳에 들어가는 단어>/
- contextPath
  /슬래시를 포함한 context

- servletPath
  contextPath를 포함한 / 뒤의 단어



- 영어권 외의 글자 표현

  - euc-kr

  - utf-8




> Spring Framework
>
> > Spring WEB MVC





- 프로그램 의존성

  - Maven - XML

  - Gradle - gradle
  - DI(Dependency Injection) : 의존관계 주입, 라이브러리에서 의존성을 설정해 준 후, 실제 프로젝트에서 적용하는 것
    - Annotation : 내부적으로 자동으로 객체를 생성(new ~)하여 자바의 nullPointException을 방지
      - 대표적으로 @Controller

  - 라이브러리 사용
    1. 라이브러리 추가
    2. 빈 등록 (DI->IOC), xml / java
       - IOC(Inversion of Control) 컨테이너 : 



객체의 속성

- 속성 : 자바에서 특정 객체에 대한 설명

  

- VO(Value Object)

  --일반적인 경우--

  1. 전역변수 은닉 -> private

  2. getters/setters 구현 -> public

  --데이터 디버깅 시--

  3. 데이터클래스화

  4. 디버깅용 toString() 메소드를 오버라이딩

  

- DTO(Data Transfer Object) : 



@Service

​	@Controller 와 @Repository 를 연결하는 어노테이션



### Mybatis

- Ibatis의 업그레이드된 버전이다

- Query문을 정리하고, 처리하는 역할을 한다
- 
