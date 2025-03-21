# 01. 객체, 설계
### 이론 vs 실무
> 당연히 이론이겠지 하는 고정관념을 지우게 되는 단락

**대부분의 사람들은 이론이 먼저 정립된 이후 실무가 그 뒤를 따라 발전한다고 생각한다**. 라고 한다. 하지만 로버트 L. 글래스가 말하길 **이론보다 실무가 먼저**라고 한다. 특히 소프트웨어 개발에서 두드러진다고 한다.

다른 분야와  달리, 소프트웨어 개발은 보다 최근에 만들어진(발견된) 분야여서 역사가 짧고 이론과 실무의 격차가 매우 심한 편이다. 컴퓨터라는 도구의 등장 이후, 개발과 유지보수 등에서 수많은 소프트웨어와 프레임워크 등이 만들어졌다. 하지만 개발과 유지보수 측면에 있어 효과적인 이론이 발표된 적은 거의 없거니와, 심지어 이론은 소프트웨어 유지보수에 전혀 관심이 없는 듯 하다.

따라서, 이 책에서는 추상적인 이론과 추상적인 개념을 앞세우지 않고 실무(코드)위주로 설명을 진행한다.

---
### 티켓 판매 애플리케이션 구현을 통한 객체의 의미 이해

> 자세한 코드는 책에 상세히 기술되어 있다

연극의 티켓 판매 과정을 구현하고, 절차지향에서 객체지향으로 리팩토링하며 다음 내용을 설명한다.
- 코드가 작동하는 과정을 말로 설명했을 때, 현실 세계와 유사하도록 해야 한다는 것
    - 절차지향적으로 코드를 작성하면 사뭇 현실 세계와 유사하지 않을 수도 있다. 가령 `극장`이, `관객`이 지닌 `가방`에 접근하여 `티켓`이 있는지 직접 확인하게 되는 절차지향적 코드라면..? 말로 설명했을 때 벌써 이상하다는 생각이 들게 된다.
- 모든 객체(심지어는 **가방**까지도)는 최대한 능동적이여야 한다는 것. 이를 통해 책임을 분산할 수 있음
    - 여기서 능동적이라 함은, 객체의 상태를 해당 객체 본인이 수정해야 한다는 것이다(관객이 본인의 가방을 확인해 티켓을 직접 전달하는 것)
- 변경을 수용할 수 있는 코드 작성


