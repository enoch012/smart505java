public class DmbCellPhoneEx {
  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시", "검정", 10);

    System.out.println("모델 : " + dmbCellPhone.model);
    System.out.println("색상 : " + dmbCellPhone.color);
    System.out.println("채널 : " + dmbCellPhone.channel);

    System.out.println();

    dmbCellPhone.powerOn();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("여보세요.");
    dmbCellPhone.receiveVoice("안녕하세요! 저는 뚱인데용~");
    dmbCellPhone.sendVoice("나는 징징인데,, ");
    dmbCellPhone.hangUp();

    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(12);
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.turnOffDmb();

    dmbCellPhone.powerOff();
  }
}
