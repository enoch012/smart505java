package pr01_interface;

public class RemoteControl3Ex {
  public static void main(String[] args) {
    RemoteControl rc = null; // 객체는 못만들고 변수만 선언

    rc = new Television2();

    rc.turnOn();
    rc.setVolume(100);
    rc.setMute(true);
    rc.setVolume(-100);
    rc.setMute(false);
    rc.turnOff();

    System.out.println("-------------------------");

    rc = new Audio2();

    rc.turnOn();
    rc.setVolume(100);
    rc.setMute(true);
    rc.setVolume(-100);
    // 추가로 오버라이딩한 메소드
    // 소스코드는 똑같지만 다르게 출력된다. (다형성)
    rc.setMute(false);
    rc.turnOff();

    // 정적 메소드를 통해서 기능 추가
    RemoteControl.changeBattery();

  }
}
