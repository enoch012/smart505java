public class SupersonicAirplane extends Airplane{
  public static final int NORMAL = 1; // 상수 선언, static final 객체 생성 이전에 미리 생성되며 다시는 수정되지 않을 필드
  public static final int SUPERSONIC = 2; // 상수
  public int flyMode = NORMAL; // 필드

  @Override
  public void fly(){
    if (flyMode == SUPERSONIC){
      System.out.println("초음속 비행을 진행합니다.");
    } else {
      super.fly(); // 재정의(오버라이딩) 되기 이전의 메소드를 활용한 것.
    }
  }

}
