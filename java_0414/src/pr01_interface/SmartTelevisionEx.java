package pr01_interface;

public class SmartTelevisionEx {

  /* 다중 상속 인터페이스 활용 예시
  * 인터페이스 Remotecontrol, Searchable을 다중 상속 받은 클래스
  * SmartTelevision 타입의 변수 stv를 선언과 동시에 객체를 생성 */
  public static void main(String[] args) {
    SmartTelevision stv = new SmartTelevision();

    // RemoteControl의 멤버와 Searchable의 멤버를 모두 사용할 수 있음

    stv.turnOn();
    stv.setVolume(50);
    stv.setVolume(5);
    stv.setMute(true);
    stv.setMute(false);
    stv.search("noah");
    stv.turnOff();

    RemoteControl irc = null;
    Searchable isc = null;

    irc = stv;
    irc.turnOn();
    irc.setVolume(-100);
    irc.setMute(true);
    // irc는 RemoteControl 인터페이스 타입의 변수이므로 인터페이스 RemoteControl의 멤버만 사용할 수 있음.
    // irc.search("ps vr2");
    irc.turnOff();

    isc = stv;
    isc.search("ps vr2");
    // isc는 Searchable 인터페이스 타입의 변수이므로 인터페이스 Searchable의 멤버만 사용할 수 있음.
    // isc.turnOn();


  }
}
