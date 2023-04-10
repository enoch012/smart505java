public class Calculator2Ex {
  public static void main(String[] args) {
    // Calculator2 클래스 타입의 변수 myCal에 CalCulator2 클래스의 객체 생성 후 대입
    Calculator2 myCal = new Calculator2();

    // CalCulator2 클래스 타입의 객체 myCal의 멤버 메소드 중 execute()를 호출
    // execute() 메소드를 myCal 객체 외부에서 접근해 호출합
    myCal.execute();

    /* 메소드의 4가지 형태 (자바스크립트의 함수와 형태가 똑같다.)
    * 1) 매개변수가 없고, 반환값이 없는 것
    * 2) 매개변수가 있고, 반환값이 없는 것
    * 3) 매개변수는 없고, 반환값이 있는 것
    * 4) 둘 다 있는 것
    * */

  }
}
