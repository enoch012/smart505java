package pr02_polymorphism;

public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.run();

    myCar.frontLeftTire = new KumhoTire();
    myCar.frontRightTire = new KumhoTire();

    myCar.run();

    System.out.println("--------------------");

    Car2 yourCar = new Car2();

    yourCar.run();

    /* 배열 형식으로 만든 변수 값 수정하기, */
    yourCar.tires[0] = new HankookTire();
    yourCar.tires[1] = new HankookTire();

    yourCar.run();
  }
}
