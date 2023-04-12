/*CellPhone 클래스를 상속 받아 사용*/
public class DmbCellPhone extends CellPhone {

  // 필드가 한개 가지고 있음 나머지는 상속 받은 것
  int channel;

  DmbCellPhone(String model, String color, int channel){
    // super(); 가 자동으로 붙어있다.
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

  // 메소드도 3개뿐 하지만 상속 받아서 활용할 수 있는 것이 더 많다.

  void turnOnDmb(){
    System.out.println("채널 " + channel + "번 DMB 방송을 수신합니다.");
  }

  void turnOffDmb(){
    System.out.println("DMB 방송 수신을 종료합니다.");
  }

  void changeChannelDmb(int channel){
    this.channel = channel;
    System.out.println("채널 " + channel + "번 방송으로 바꿉니다.");
  }

}
