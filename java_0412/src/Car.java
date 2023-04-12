public class Car {
  /* final을 메소드에 썼을 때 예제 */
  public int speed;

  public void speedUp(){
    speed += 1;
  }

  public final void stop(){ // final을 붙이면 상속 받는 자식 클래스에서 오버라이드가 불가능하게 됨.
    System.out.println("차를 멈춥니다.");
    speed = 0;
  }
}

