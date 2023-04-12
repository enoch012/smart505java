public class SportsCar extends Car {
  /* final을 메소드에 썼을 때 예제 */
  // 부모 클래스에서 상속 받아 오버라이딩한 메소드
  @Override
  public void speedUp(){
    speed += 10;
  }
  /* 부모 클래스에서 상속 받아 오버라이딩 하려고 했지만 부모 클래스의 메소드가 final로 지정되어 있어 오버라이딩이 불가능함.
  * 부모 클래스에서 상속 받은 메소드 그대로 사용해야함 */
  
  /* @Override
  public void stop(){
    System.out.println("스포츠카를 멈춥니다.");
    speed = 0;
  }*/

}
