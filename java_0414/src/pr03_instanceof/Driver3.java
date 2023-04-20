package pr03_instanceof;

public class Driver3 {
  public void drive(Vehicle3 vehicle){
    if (vehicle instanceof Bus3){
      // instanceof 는 207p에서도 참고
      // 원본이 해당 클래스에 소속 되는지 확인하고 맞으면 if 문 수행

      Bus3 bus = (Bus3) vehicle;
      bus.checkFare();
    }
    vehicle.run();
  }
}
