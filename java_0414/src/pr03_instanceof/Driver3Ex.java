package pr03_instanceof;

/* 매개변수를 사용한 다형성 예시 */
public class Driver3Ex {
  public static void main(String[] args) {
    Driver3 driver = new Driver3();

    Bus3 bus = new Bus3();
    Taxi3 taxi = new Taxi3();

    driver.drive(bus); // drive if 조건에 부합하므로 checkFare 메소드도 함께 진행되었다.
    driver.drive(taxi);
  }
}
