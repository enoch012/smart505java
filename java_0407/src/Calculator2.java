public class Calculator2 {

  // 동일한 클래스에서 메서드를 호출할 때는 객체 이름을 붙이지 않아도 된다.
  int plus(int x, int y){
    int result = x + y;
    return result;
  }

  double avg(int x, int y){
    // plus()는 동일한 클래스의 멤버이므로 메소드의 이름만으로 호출이 가능
    // 자동 타입 변환에 의해서 plus() 메소드의 반환값이 double 타입의 변수 sum에 저장됨
    double sum = plus(x, y);
    // 큰 데이터 타입과 작은 데이터 타입을 연산 시 큰 데이터 타입으로 자동 타입 변환이 발생함
    double result = sum/2;
    return result;
  }

  void execute(){
    // avg() 메소드와, println() 메소드를 직접 호출해서 사용
    // 동일한 클래스의 멤버이므로 메소드의 이름만으로 호출이 가능
    double result = avg(7, 10);
    println("실행결과 :" + result);
  }

  void println(String message){
    System.out.println(message);
  }
}
