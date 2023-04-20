package pr04_interface_extends;

public class InterfaceExtendsEx {
  public static void main(String[] args) {
    // 인터페이스 a, b를 다중 상속 받은 c의 객체
    ImplC implc = new ImplC();

    System.out.println("\n ----- 인터페이스를 구현한 객체 ----- \n");
    implc.methodA();
    implc.methodB();
    implc.methodC();

    System.out.println("\n ----- InterA 타입의 변수에 대입 ----- \n");

    InterA interA = implc;

    // 인터페이스 a 안에는 메소드 b,c가 없다

    interA.methodA();
    /*interA.methodB();
    interA.methodC();*/

    System.out.println("\n ----- InterB 타입의 변수에 대입 ----- \n");

    InterB interB = implc;

    // 인터페이스 b 안에는 메소드 a,c가 없다

    // interB.methodA();
    // InterB의 멤버인 methodB만 사용 가능
    interB.methodB();
    // interB.methodC();

    System.out.println("\n ----- InterC 타입의 변수에 대입 ----- \n");

    InterC interC = implc;
    // 조상인 InterC 타입의 변수에 자손 객체를 대입
    // InterC는 InterA, InterB를 다중 상속햇기 때문에 InterA의 methodA와 InterB의 method 그리고 자신 전용의 methodC까지 모두 사용할 수 있다.

    // 모두 상속받은 interC의 클래스를 구현하고 있는 implc라서 가능하다.

    interC.methodA();
    interC.methodB();
    interC.methodC();
  }
}
