public class Television {
  public static String company = "SAMSUNG";
  public static String model = "LED";
  public static String info;

  static {
    /* 정적 멤버 초기화 블럭
    * 블록 내부에 인스턴스 필드나 인스턴스 메소드 사용 불가(정적 멤버 호출 시 해당 객체가 없을 수도 있기 때문에)
    * 객체 자신의 참조인 this 사용 불가(176p)
    * */
    info = company + " - " + model;
  }
}
