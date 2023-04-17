/* 추상 클래스로 선언한 Animal2 클래스 */
public abstract class Animal2 { // 추상 메소드를 가지고 있기 때문에 abstract가 없으면 오류난다.
  public String kind;

  public void breathe(){
    System.out.println("숨을 쉽니다.");
  }

  // 추상 메소드는 코드 블럭이 없다.
  public abstract void sound();
}
