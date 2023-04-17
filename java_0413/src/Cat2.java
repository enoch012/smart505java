public class Cat2 extends Animal2 {
  // 부모 추상 클래스에서 설정한 추상 메소드를 구현하지 않으면 오류가 난다.
  // 상속 받은 추상 메소드는 반드시 구현해야 한다.
  // 구현하지 않을 경우 해달 클래스도 추상 클래스가 된다.
  public Cat2(){
    this.kind = "포유류";
  }

  // 상속받은 추상 메소드를 오버라이딩한 메소드
  @Override
  public void sound(){
    System.out.println("냥냥");
  }
}
