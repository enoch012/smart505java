import java.awt.*;

public class Car5 {
  // 필드값
  String model;
  String color;
  String price;

  // this() 사용 안하고 오버로딩 생성자 풀로 다 쓰기

  public Car5(){
    model = "토레스";
    color = "밝은 회색";
    price = "2800";
  }

  public Car5(String model){
    this.model = model;
    this.color = "밝은 회색"; // 여긴 this 붙여도 되고 안붙여도됨
    this.price = "2800";
  }

  public Car5(String model, String color){
    this.model = model;
    this.color = color; // 여긴 this 붙여도 되고 안붙여도됨
    this.price = "2800";
  }

  public Car5(String model, String color, String price){
    this.model = model;
    this.color = color; // 여긴 this 붙여도 되고 안붙여도됨
    this.price = price;
  }

}
