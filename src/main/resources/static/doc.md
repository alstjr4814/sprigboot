//http://localhost:8080/doc
DTO → Swagger에게 JSON 틀 제공
Swagger가 그 형식대로 JSON 요청 생성
그 요청이 Controller로 들어옴
Controller가 Service 호출
Service가 검사/예외 처리
Mapper가 SQL 실행 준비
MyBatis가 XML에서 SQL 찾아 실행
XML이 Workbench(MySQL)로 SQL 보내 저장

Swagger → DTO 보고 JSON 형식 자동 생성
Swagger에서 보낸 JSON → Controller로 전달
Controller → Service 호출
Service:
- DTO 검증
- 예외 처리
- DTO → Entity 변환
- Mapper 호출

Mapper Interface → MyBatis에게 "이 SQL 실행해라" 요청
MyBatis → XML에서 해당 id의 SQL 문장 찾음
MyBatis → SQL을 MySQL 서버에 실행 요청
MySQL → 데이터 저장

Dto가 swager한테 야 이런json형식으로 좀 짜줘라고 하면 swager해당형식으로 
짜줘야하고 그 짠거를 entity에 저장이되고 controller한테 넘김 그리고 서비스에 던짐 서비스는 다양한 
검사들을하고 예외가 없으면 mapper을 호출 mapper는 이제 sql형식으로 바꿔주고 바꿔 준 형식을 바티스가 
xml한테 넘겨 줌 xml은 workbench로 넘겨서 저장 