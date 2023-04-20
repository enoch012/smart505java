package pr02_polymorphism;

public class Car {
  // 인터페이스 타입의 변수 선언, 타입 설정이 인터페이스 명이라는 것에 주목
  // 인터페이스 명으로 타입을 선언할 경우 다양하게 활용이 가능하다.
  // 해당 변수에 자식 클래스 타입의 객체를 저장, 때문에 다른 상속받는 자식으로도 교체가 되는 것
  Tire frontLeftTire = new HankookTire();
  Tire frontRightTire = new HankookTire();
  Tire backLeftTire = new HankookTire();
  Tire backRightTire = new HankookTire();

  void run(){
    frontRightTire.roll();
    frontLeftTire.roll();
    backRightTire.roll();
    backLeftTire.roll();
  }

}
