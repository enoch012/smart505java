public class Calculator4Ex {
  public static void main(String[] args) {

    // static 으로 선언한 멤버는 클래스를 선언하자마자 메모리에 같이 등록이 되기 때문에 객체를 만들지 않아도 바로 쓸 수 있다.
    /*정적(static) 멤버 : 클래스의 멤버로 동작하는 필드와 메소드
    * 객체 생성 없이 클래스의 이름을 통해서 필드와 메소드에 접근이 가능
    * 정적 멤버들은 데이터를 공유하고 있다.(인스턴스와 큰 차이점)
    * 일반 인스턴스 멤버는 정적 멤버를 사용할 수 있음
    * 정적 멤버는 일반 인스턴스 멤버를 사용할 수 없음
    * 클래스 로딩 시 함께 로딩되어, 인스턴스 생성이 100퍼센트 보장이 안되기 때문에 오류 방지를 위해 허용하지 않게 설정되었다.
    * */

    double result1 = 10 * 10 * Calculator4.pi;

    int result2 = Calculator4.plus(10, 5);
    int result3 = Calculator4.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);


  }
}
