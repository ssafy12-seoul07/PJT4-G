# 프로젝트 회고
## 관통 PJT04_백엔드
### 역할 분담
- 팀장 : 소현
  - back 담당 : dto, repository, service 작성
- 팀원
  - 혜원 : review 담당
  - 진호 : video 리스트 담당

### 나의 역할
팀장 역할을 맡게 되어 초기 프로젝트 셋팅을 우선적으로 진행. 
역할분담을 나누기 애매해서 다같이 사용할만한 파일들은 완성해서 올림.
어떻게 구조를 짜면 좋을지 설계한 후 필요한 필드들을 추가했고 팀원들에게 공유. 

### 아쉬운점과 보완할 점
- 프로젝트가 크지 않아 역할 분담하기 힘들었음
- index 페이지에서 바로 영상 리스트를 보여주는 것을 목표로 했지만, 요청 없이 처음부터 데이터 받아오는 것이 생각보다 힘들었고 chatGPT를 사용해도 쉽게 접근할 수 없었음
  => 링크 연결 방식으로 변경
- 데이터베이스 연결 없이 진행해 비디오와 리뷰를 어떻게 연결하는 것이 최선인지 모르겠음
  => 비디오 dto에 리뷰 리스트를 만들어 연결하는 방식 사용
- 역할 분담을 백, 비디오 리스트, 리뷰로 담당하여 테스트 하기 위해서는 모든 팀원이 깃에 푸쉬해야 했음
  => 다양한 기능이 있는 프로젝트를 각 기능 관련해 다 맡아 진행해보고 싶음 

### 좋았던 점
- MVC 모델을 배우고 바로 프로젝트를 진행해 MVC 모델에 대해 개념을 잘 잡을 수 있어 좋았음
