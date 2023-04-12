public class Singleton {
  /* 싱글톤 디자인 패턴 예시 */

  // private로 멤버를 만들면 해당 클래스 내에서만 사용이 가능하다.

  /*자신 타입의 객체를 생성
  * 외부에서 직접적인 접근을 차단*/
  private static Singleton singleton = new Singleton();

  // private 로 생성자를 선언했기 때문에 다른 클래스에서 new 키워드를 사용하여 객체 생성을 하지 못한다.
  // 다른 클래스에서 getInstance로 다른 변수에 각각 저장해도 여기서 생성한 객체를 담은 거라 결과적으로 동일한 객체가 된다.
  private Singleton(){}

  /*정적 메소드 선언
  * 미리 만들어 놓은 객체를 우회하여 사용하도록 제공.*/
  static Singleton getInstance(){
    // 정적 멤버는 정적 멤버만 쓸 수 있어서 앞에 static 이 붙었다.
    // 정적 필드인 singleton을 외부로 전달하는 메소드.
    return singleton;
  }
}
