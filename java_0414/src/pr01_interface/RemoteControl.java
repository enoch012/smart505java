package pr01_interface;

/* 추상 클래스에서 개념을 확장한 인터페이스
* 클래스와 동일한 방식으로 이름을 설정 */
public interface RemoteControl { // interface를 class라고 적으면 클래스로 인식함, 무조건 public

  // interface에서 필드선언은 무조건 상수
  // 선언과 동시에 데이터 입력, static 초기화 블럭 사용 불가
  int MAX_VOLUME = 10;
  public static final int MIN_VOLUME = 0;

  // 인터페이스의 멤버인 추상 메소드
  // public abstract 키워드를 생략해도 자동으로 추가
  // 자식 클래스는 반드시 추상 메소드를 상속 받아 구현해야 함
  // 구현 안하면 해당 클래스도 추상 클래스가 된다.
  void turnOn();
  void turnOff();
  void setVolume(int volume);

  // 인터페이스의 추가된 멤버, 디폴트 메소드 및 정적 메소드
  // 모든 구현 객체가 가지고 있는 기본 메소드로 사용
  // 필요에 따라 재정의해서 써도됨, 기능추가 및 손쉬운 확장을 위해서 사용

  // 추상 메소드 : 무조건 구현해줘야함
  // 디폴트 메소드 : 꼭 쓰지 않아도됨, 기능 추가하여 사용도 가능

  /* 구현 되어 있지만 직접 사용은 불가능하다. 자식 클래스에서 사용 가능 */
  default void setMute(boolean mute){
    if(mute){
      System.out.println("무음 모드 입니다.");
    } else {
      System.out.println("무음 모드 해제 합니다.");
    }
  }

  // 인터페이스의 추가된 멤버, 정적 메소드
  static void changeBattery(){
    System.out.println("건전지를 교환합니다.");
  }

}
