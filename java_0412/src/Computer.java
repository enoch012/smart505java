/* 클래스 Computer 는 클래스 Calculator을 상속 받아 모든 멤버를 가져옴 */
public class Computer extends Calculator {
  /* 부모 클래스인 Calculator 클래스에서 상속해준 areaCircle() 메소드
  * 오버라이딩 : 상속 받은 메소드의 접근제한자, 반환값, 메소드 이름, 매개 변수의 개수와 타입 및 순서까지 동일하게 구성하고 코드 블록의 내용만 수정하는 것 */

  @Override
  double areaCircle(double r) { // 부모 객체의 메소드 조건을 그대로 들고와서 오버라이딩
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }

  // 오버라이딩 된 메소드
  // 오버라이딩하려고 했지만 사용자의 실수에 의해서 선언부의 변경이 있을 경우 오버라이딩이 되지 않고 자식 클래스 전용의 메소드로 인식됨.
  @Override // 적어주면 실수를 인식함
  public int sum(int x, int y){
    System.out.println("Computer 클래스의 오버라이딩 된 total() 메소드");
    int result = x + y;
    System.out.println(result + "입니당.");
    return result;
  }
}
