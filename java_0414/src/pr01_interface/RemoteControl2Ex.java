package pr01_interface;

public class RemoteControl2Ex {
  public static void main(String[] args) {

    /* 익명 구현 객체 : 인터페이스를 통해서 1회용 클래스를 생성하고 바로 new 생성자()를 통해서 객체를 생성하는 방식
    * 클래스의 이름이 존재하지 않기 때문에 추가적으로 객체를 생성할 수 없음
    * 추가적인 필드와 메소드 선언 가능하나 익명 객체 안에서만 사용 가능 */
    RemoteControl rc = new RemoteControl() { // 인터페이스의 이름일 뿐 클래스의 이름은 아니므로 익명
      int volume;
      @Override
      public void turnOn() {
        System.out.println("전원을 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("전원을 끕니다.");
      }

      @Override
      public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME){
          this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume< RemoteControl.MIN_VOLUME) {
          this.volume = RemoteControl.MIN_VOLUME;
        } else {
          this.volume = volume;
        }

        System.out.println("Audio 현재 볼륨 : " + this.volume);
      }
    };

    rc.turnOn();
    rc.setVolume(5);
    rc.setMute(false);
    rc.setVolume(10);
    rc.turnOff();
  }
}