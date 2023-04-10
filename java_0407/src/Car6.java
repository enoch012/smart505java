public class Car6 {
  String model;
  String color;
  String price;

  // this() 를 활용하여 중복을 줄인 생성자

  /* this는 또 다른 같은 형태의 생성자를 호출한다.
  * 매개 변수에 따라 해당 매개 변수 형태를 가진 생성자를 불러오는 것이다. */

  public Car6(){
    this("토레스");
  }

  public Car6(String model){
    this(model, "밝은 회색");
  }

  public Car6(String model, String color){
    this(model, color, "2800"); // 아래 생성자로부터 받아옴
  }

  public Car6(String model, String color, String price){
    this.model = model;
    this.color = color;
    this.price = price;
  }

}
