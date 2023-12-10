# 학습 관리 시스템(Learning Management System)
## 진행 방법
* 학습 관리 시스템의 수강신청 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## TODO
* [x] 다른 사람이 작성한 질문 삭제 불가
* [x] 질문에 대한 답변중 다른 사람이 쓴 답변이 있는 경우 삭제 불가 
* [x] 다른 사람이 작성한 답변 삭제 불가

🚀 2단계 - 수강신청(도메인 모델)
## 기능 목록
* [x] 과정은 기수 단위로 운영한다.
* [x] 과정은 여러개의 강의를 가질 수 있다.
* [x] 강의는 커버 이미지 정보를 가진다.
* [x] 이미지 크기는 1MB 이하여야 한다.
* [x] 이미지 타입은 gif, jpg(jpeg 포함),, png, svg만 허용한다.
* [x] 이미지의 width는 300픽셀, height는 200픽셀 이상이어야 한다.
* [x] 이미지의 width와 height의 비율은 3:2여야 한다.
* [x] 강의는 시작일과 종료일을 가진다.
* [x] 시작일은 종료일보다 이후로 설정 할 수 없다
* [x] 강의는 무료 강의와 유료 강의로 나뉜다.
* [x] 유료강의는 최대 수강 인원 제한이 있다.
* [x] 무료 강의는 최대 수강 인원 제한이 없다.
* [x] 유료 강의는 강의 최대 수강 인원을 초과할 수 없다.
* [ ] 유료 강의는 수강생이 결제한 금액과 수강료가 일치할 때 수강 신청이 가능하다.
* [ ] 강의 상태는 준비중, 모집중, 종료 3가지 상태를 가진다.
* [ ] 강의 수강신청은 강의 상태가 모집중일 때만 가능하다.
* [ ] 유료 강의의 경우 결제는 이미 완료한 것으로 가정하고 이후 과정을 구현한다.
* [ ] 결제를 완료한 결제 정보는 payments 모듈을 통해 관리되며, 결제 정보는 Payment 객체에 담겨 반한된다.
 
