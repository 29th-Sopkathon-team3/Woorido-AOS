# Woorido-AOS

솝커톤, 우리도, 안드로이드

## 1. 서비스 이름과 간단한 소개

서비스 이름은 Woorido입니다.

Woorido는 한 그룹 안에서 모임에 참여할 때마다 점수를 주고 해당 점수를 체온으로 표현하고 랭킹을 매기는 서비스입니다.

모든 사람의 시작 체온은 36.5도이며 참여도에 따라 점수를 올리거나 내릴 수 있습니다.

그리고 각 사람의 체온을 등수로 매겨 해당 그룹 내에서 각 사람의 "인싸력"을 알 수 있습니다.



## 2. 각자 개발 담당 부분



## 3. 코드 컨벤션



### 3-1. 기본

기본적으로 공식문서인 [Kotlin Coding Conventions](https://kotlinlang.org/docs/reference/coding-conventions.html)과 [Kotlin style guide](https://developer.android.com/kotlin/style-guide)를 준수한다.

### 3.1-1 안드로이드 스튜디오

안드로이드 스튜디오의 `Optimize imports` 기능과 `Reformat Code` 기능을 이용한다.

- `Optimize imports` `(Ctrl+Alt+O)` : 사용하지 않는 Class를 import하고 있는 경우 제거해준다.
- `Reformat Code` `(Ctrl+Alt+L)` : 코드의 Kotlin Style Guide를 적용하여 Code를 Reformat한다.



### 3-2. Resource Naming Convention

### 3-2.1. ID

View 이름의 Pascal Case를 축약하여 Snake Case로 변환한 것을 Prefix로 사용한다.

#### 3-2.1.1. Prefix

```
<WHAT>_<DESCRIPTION>
```

| View                 | Prefix |
| -------------------- | ------ |
| TextView             | `tv_`  |
| ImageView            | `iv_`  |
| EditText             | `et`   |
| Button, ImageButton  | `btn_` |
| Toolbar              | `tb_`  |
| ConstraintLayout     | `cl_`  |
| LinearLayout         | `ll_`  |
| BottomNavigationView | `bnv_` |
| ..                   | ..     |

#### 3-2.1.2. 예시

```
@+id/tv_login
@+id/et_password
@+id/btn_login
```



### 3-2.2. Layout

Layout의 xml 파일의 이름은 .kt .java의 Pascal Case를 Snake Case로 변환하여 사용한다.

#### 3-2.2.1. Prefix

```
<WHAT>_<WHERE>
```

| View       | Prefix      |
| ---------- | ----------- |
| Activity   | `activity_` |
| Fragment   | `fragment_` |
| Dialog     | `dialog_`   |
| CustomView | `view_`     |
| Item       | `item_`     |

#### 3-2.2.2. 예시

```
SignInActivity.kt -> activity_sign_in.xml
SignUpFragment.kt -> fragment_sign_up.xml
CustomCalendarView.kt -> view_custom_calendar.xml
item_user.xml
```



### 3-2.3. Drawable

#### 3-2.3.1. Prefix

```
<WHAT_DESCRIPTION>
```

| Drawable   | Prefix                             |
| ---------- | ---------------------------------- |
| Icon       | `ic_`                              |
| Image      | `img_`                             |
| Background | `bg_`                              |
| Shape      | `<shape>_<color>_<radius>_<value>` |

#### 3-2.3.2. 예시

```
ic_error.xml
img_default_user.xml
bg_main.xml
rectangle_yellow_radius_20.xml
```



### 3-2.4. Menu

#### 3-2.4.1. Prefix

```
menu_
```



### 3-2.5. Color

Color의 이름은 Camel Case를 이용해 작성하되, [사이트](https://chir.ag/projects/name-that-color/#6195ED)를 참고해 Color를 직관적으로 연상할 수 있는 이름을 사용한다.

#### 3-2.5.1. 예시

```
<color name="black">#FF000000</color>
<color name="white">#FFFFFFFF</color>
<color name="cornflowerBlue">#6195ED</color>
```



### 3-2.6. String

String 작성 시 주석을 통해 String이 사용되는 곳을 명시한다.

#### 3-2.6.1. Prefix

```
<WHERE/WHAT>_<DESCRIPTION>
```

#### 3-2.6.2. 예시

```
<!--Main Menu-->
<string name="menu_daily">하루의 기록</string>
<string name="menu_remind">평가 및 회고</string>
<string name="menu_my">My</string>

<!--Toolbar Title-->
<string name="title_search">검색</string>
<string name="title_settings">환경설정</string>

<!--Dialog Message-->
<string name="msg_login">로그인하시겠습니까?</string>
<string name="msg_login_failed">로그인에 실패했습니다.</string>
<string name="msg_password_error">비밀번호가 올바르지 않습니다.</string>
```



### 3-2.7. Style

View의 Pascal Case와 Style에 대한 설명을 조합하여 Style 명을 지정한다.

#### 3-2.7.1. Prefix

```
<WHAT><Description>Style
```

#### 3-2.7.2. 예시

```
<style name="LoginEditTextStyle"/>
<style name="MainDialogStyle"/>
```



### 3-3 Kotlin Naming Convention

### 3-3.1. Class

클래스 파일 이름은 UpperCamelCase(파스칼 케이스(PascalCase))로 작성한다.

#### 3-3.1.1. Prefix

```
<DESCRIPTION><WHAT>
```

Prefix는 해당 클래스와 관련성이 높은 것으로 임의로 작성한다.

#### 3-3.1.2. 예시

```
MainActivity
UserViewModel
WriteFragment
```



### 3-3.2. Method

메소드 이름은 lowerCamelCase로 작성한다.

#### 3-3.2.1. Prefix

"동사"로 시작하는 "동사구" 형태를 사용하되, 동사 원형만을 사용한다.
**자주 사용하는 동사는 용법에 맞게 사용한다.**

| Word  | Description                                           |
| ----- | ----------------------------------------------------- |
| show  | Invisible한 것을 Visible하게 바꾸는 동작              |
| check | 어떤 것을 확인한 후 boolean 또는 값으로 반환하는 동작 |
| is    | 어떤 것인지 확인한 후 boolean으로 반환하는 동작       |
| has   | 어떤것을가지고 있는 확인 후 boolean으로 반환하는 동작 |

#### 3-3.2.2. 예시

```
showList
updateContacts
```



### 3-3.3. Variable

변수 이름 또한 마찬가지로 lowerCamelCase로 작성한다.

#### 3-3.3.1. 예시

```
isEnd
viewPagerAdapter
```



## 4. 브랜치 전략

## 1. Git

### 1.1. Rules

#### 1.1.1. Git Flow

기본적으로 Git Flow 전략을 이용한다. 작업 시작 시 선행되어야 할 작업은 다음과 같다.

```
1. Issue를 생성한다.
2. feature Branch를 생성한다.
3. Add - Commit - Push - Pull Request 의 과정을 거친다.
4. Pull Request가 작성되면 작성자 이외의 다른 팀원이 Code Review를 한다.
5. Code Review가 완료되면 Pull Request 작성자가 develop Branch로 merge 한다.
6. merge된 작업이 있을 경우, 다른 브랜치에서 작업을 진행 중이던 개발자는 본인의 브랜치로 merge된 작업을 Pull 받아온다.
7. 종료된 Issue와 Pull Request의 Label과 Project를 관리한다.
```

### 1.1.2. Etc.

협업 시 준수해야 할 규칙은 다음과 같다.

```
1. develop에서의 작업은 원칙적으로 금지한다. 단, README 작성은 develop Branch에서 수행한다.
2. 자신이 담당한 부분 이외에 다른 팀원이 담당한 부분을 수정할 때에는 Slack을 통해 변경 사항을 전달한다.
3. 본인의 Pull Request는 본인이 Merge한다.
4. 빠른 협업 속도를 위해 Pull Request가 올라온 이후 24시간 내에 Code Review를 수행한다.
5. Commit, Push, Merge, Pull Request 등 모든 작업은 앱이 정상적으로 실행되는 지 확인 후 수행한다.
6. README 수정을 위한 Commit 도배는 금지한다. 미리보기는 Preview를 통해 확인한다.
```



### 1.2. Branch

Branch의 Naming Rule은 1.2.1을 따른다. Branch는 가능한 한 작업단위, 기능단위로 생성하며 이는 Issue를 기반으로 한다. 단, 같은 범위의 기능이라면 같은 브랜치를 사용한다. 예를 들면, 회원가입 기능 구현 시 *아이디 중복 체크, 비밀번호 확인, 아이디 유효성 확인* 등은 **회원가입** 하나로 구분한다.

#### 1.2.1. Branch Naming Rule

Branch를 생성하기 전 Issue를 먼저 작성한다. Issue 작성 후 생성되는 번호와 Issue의 간략한 설명 등을 조합하여 Branch의 이름을 결정한다. `<Prefix>/<Issue_Number>-<Description>` 의 양식을 따른다.

#### 1.2.2. Prefix

- `main` : 개발이 완료된 산출물이 저장될 공간
- `develop` : feature 브랜치에서 구현된 기능들이 merge될 브랜치
- `feature` : 기능을 개발하는 브랜치, 이슈별/작업별로 브랜치를 생성하여 기능을 개발한다
- `release` : 릴리즈를 준비하는 브랜치, 릴리즈 직전 QA 기간에 사용한다
- `hotfix` : 버그를 수정하는 브랜치

#### 1.2.3. 예시

```
main
develop/v1.0.0
feature/10-sign-up
release/v1.0.0
hotfix/11-main-activty-bug
```



### 1.3. Issue

작업 시작 전 Issue 생성이 선행되어야 한다. Issue는 작업 단위, 기능 단위로 생성하며 생성 후 표시되는 Issue Number를 참조하여 Branch Name과 Commit Message를 작성한다.

이슈의 제목에는 기능의 대표적인 설명을 적고, 내용에는 세부적인 내용 및 작업 진행 상황을 작성한다.

이슈 생성 시 Github 오른편의 Assignee, Label, Project, Linked Pull Requests 를 적용한다. Assignee는 해당 이슈의 담당자, Label에는 `담당자`, `TODO`, `우선순위` 등의 Label을 추가한다. 작업 대기중인 Issue에는 `TODO`, 작업 진행 중이면 `In Progress`를, 완료된 Issue에는 `complete` Label을 추가한다.

#### 1.3.1. Issue Naming Rule

`[<PREFIX>] <Description>` 의 양식을 준수하되, Prefix는 협업하며 맞춰가기로 한다. 또한 Prefix는 대문자를 사용한다.

#### 1.3.2. 예시

```
[FEAT] 회원가입 구현
[DEBUG] MainActivity 버그 수정
[STYLE] 폰트 변경
```



### 1.4. Commit

Commit Message는 영어로 작성하는 것을 원칙으로 하되, 의미 전달이 어려운 경우 한글을 사용한다. Commit Message Convention은 다음 [[1\]](https://github.com/TeamMascota/Mascota-Android/wiki/1.-Git-사용법#footnote1) 을 따른다.

> [1] https://github.com/4z7l/Today-I-Learned/blob/master/Git/GitCommitConvention.md 참고.

#### 1.4.1. Commit Message Convention

`[<PREFIX>] <Issue_Number> - <Description>` 의 양식을 준수한다.

- **FIX** : 버그, 오류 해결 `[FIX] #10 - callback error`
- **ADD** : Feat 이외의 부수적인 코드 추가, 라이브러리 추가, 새로운 View나 Activity 생성 `[ADD] #11 - LoginActivity` `[ADD] #12 - CircleImageView Library`
- **FEAT** : 새로운 기능 구현 `[FEAT] #11 - google login`
- **DEL** : 쓸모없는 코드 삭제 `[DEL] #12 - unnecessary import package`
- **DOCS** : README나 WIKI 등의 문서 개정 `[DOCS] update readme`
- **REFACTOR** : 내부 로직은 변경 하지 않고 기존의 코드를 개선하는 리팩토링 시 `[REFACTOR] #15 - MVP architecture to MVVM`
- **CHORE** : 그 이외의 잡일/ 버전 코드 수정, 패키지 구조 변경, 파일 이동, 가독성이나 변수명, reformat 등 `[CHORE] #20 - delete unnecessary import package` `[CHORE] #21 - reformat MainActivity`
- **MOD** : xml 파일만 수정한 경우 `[MOD] #30 - use constraintlayout in activity_main.xml`
- **TEST** : 테스트 코드 추가

#### 1.4.2. 예시

```
[접두어] #이슈번호 - 내용<br>
세부내용<br>
각주<br>
[FEAT] #11 - google login

- Use Firebase Auth (http://example.com/reference)
- Need refactor code

See Also : #100, #120
```



### 1.5. Pull Request

develop, main으로 merge할 때에는 Pull Request와 다른 팀원의 Code Review가 필요하다. Pull Request의 내용에는 변경된 사항에 대한 설명이 작성되어야 하며, View에 관한 수정이 있는 경우 스크린샷을 함께 첨부한다.



### 1.6. Code Review

Merge를 위해 Pull Request에 대한 팀원들의 Code Review를 수행한다. Code Review는 변경 사항에 대해 궁금한 점, 코드 가독성(변수명, 함수명 등)에 대한 조언 등을 작성한다. Code Review는 존댓말로 하며, 일방적인 시비나 비난은 금지한다. Pull Request 작성자는 Code Review에 대해 성실히 답변한다.



### 1.7. Label

Issue, Pull Request를 한 눈에 파악하기 위해 Label을 추가한다. 필수적으로 추가되어야 할 Label은 `Assignee`, `TODO/In Progress/Complete`, `우선순위` 이다.

- `Assignee` : 담당자의 Github 아이디
- `TODO/In Progress/Complete` : Issue 혹은 Pull Request의 진행 상황, 진행 상황이 변경되면 기존의 Label을 삭제하고 새로운 Label을 부여한다.
- `우선순위` : 기본적으로 0순위~3순위로 구분하며 각 우선순위는 `P0`, `P1`, `P2`, `P3` 등으로 표기한다.



### 1.8. Project

각 Repository에 대한 진행 상황을 파악하기 위해 Project를 이용한다.



### 1.9. WIKI

Project Rule, Coding Convention, 회의록 등에 관한 내용은 WIKI에서 작성한다. 가독성을 위해 목차도 함께 작성한다. 목차는 모든 내용이 작성된 후 [Generator](https://ecotrust-canada.github.io/markdown-toc/)를 통해 쉽게 작성할 수 있다.