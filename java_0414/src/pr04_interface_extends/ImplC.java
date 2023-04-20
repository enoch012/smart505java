package pr04_interface_extends;
// 인터페이스 InterA, InterB를 상속 받은 인터페이스 InterC를 구현한 클래스 ImplC
// InterA, InterB, InterC가 가지고 있는 추상 메소드를 모두 구현
public class ImplC implements InterC{
// InterA 의 추상 메소드를 구현
  @Override
  public void methodA() {
    System.out.println("Impl - methodA called");
  }

  // InterB의 추상 메소드를 구현
  @Override
  public void methodB() {
    System.out.println("Impl - methodB called");
  }

  // InterC의 추상 메소드를 구현
  @Override
  public void methodC() {
    System.out.println("Impl - methodC called");
  }
}
