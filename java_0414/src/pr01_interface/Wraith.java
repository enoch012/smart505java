package pr01_interface;

public class Wraith implements Unit {

  @Override
  public void move() {
    System.out.println("레이스가 날아갑니다.");
  }

  @Override
  public void stop() {
    System.out.println("레이스가 멈춥니다.");
  }

  @Override
  public void attack() {
    System.out.println("레이스가 공격을 시작합니다.");
  }
}
