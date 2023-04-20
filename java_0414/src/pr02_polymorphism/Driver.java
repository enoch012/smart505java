package pr02_polymorphism;

public class Driver {
  // Vehicle 타입의 변수를 둠으로써 Vehicle을 상속받는 클래스들의 오버라이딩, 다형성을 두게 함
  public void drive(Vehicle vehicle){
    vehicle.run();
  }
}
