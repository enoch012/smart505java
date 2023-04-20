package pr02_polymorphism;
/* 다형성 */
public class promotionEx {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    // 조상인 인터페이스 타입의 변수 생성
    A a = null;

    // 조상인 인터페이스 타입의 변수에 자손 객체를 각각 대입
    a = b;
    a = c;

    // 조상인 인터페이스 타입의 변수에 해당 인터페이스를 상속 받은 클래스의 자손 클래스 객체를 대입
    a = d;
    a = e;
  }
}
