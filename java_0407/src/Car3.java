public class Car3 {
  String company = "쉐보레";
  String model;
  String type = "SUV";
  String color;
  int price;

  public Car3(){
    // 생성자에서 필드 초기화하기
    // 필드를 객체 내부에서 변수와 같이 사용

    model = "트레일블레이저"; // 생성자 외부에서는 c.model = "트레일블레이저"; 라고 적어야함
    color = "파랑색";
    price = 2571;
  }

  //매개변수가 있는 생성자, 사용자가 직접 값을 입력할 수 있게 해줌.
  // 객체 생성 시 매개변수로 받은 데이터를 기반으로 필드를 초기화함.

  // this에 대하여 (149p)
  // 객체(인스턴스) 자신의 참조(번지)를 가지고 있는 키워드
  // 객체 내부에서 인스턴스 멤버임을 명확히 확인하기 위해 this. 사용
  // 매개변수와 필드명이 동일할 때
  public Car3(String company, String type, String model, String color, int price){

    /*this : 클래스 내부에서 객체 자기 자신임을 나타내는 키워드
    * 매개변수의 이름과 클래스 멤버 변수인 필드의 이름이 같을 경우 서로 구분하기 위해서 사용함.
    * */

    // 매개 변수로 받아온 company는 현재 객체의 company 값으로 하겠습니다~ 하는 것, 사용자가 입력한 값으로 초기화
    // 이러한 작업을 해주는 게 생성자의 역할 중 하나

    this.company = company;
    this.type = type;
    this.model = model;
    this.color = color;
    this.price = price;
  }


}
