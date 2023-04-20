package pr01_interface;

public interface Unit {
  // 기능 제공을 위한 추상 메소드 2개 선언
  void move();
  void stop();

  // 추상 메소드로 기능 추가
  // 모든 자식 클래스에서 추가된 추상 메소드를 반드시 오버라이딩으로 구현해야함
  void attack();

  // 디폴트 메소드로 기능 추가
  // 필요한 클래스만 오버라이딩해서 사용하면 된다.
  default void steamPack(){
    System.out.println("스팀팩을 사용합니다.");
    System.out.println("공격속도가 증가합니다.");
  }
}
