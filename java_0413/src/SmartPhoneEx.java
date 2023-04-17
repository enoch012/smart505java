public class SmartPhoneEx {
  public static void main(String[] args) {
    /* // 추상 클래스는 객체 생성이 안된다.
     * // 추상 클래스 타입의 변수는 생성할 수 있다.
    * Phone phone = new Phone();
    */
    Phone phone; // 추상 클래스 타입의 변수는 생성할 수 있음.

    SmartPhone smartPhone = new SmartPhone("노아");

    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();

  }
}
