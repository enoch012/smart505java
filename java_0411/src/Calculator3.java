public class Calculator3 {

  /*오버로딩을 한 메소드 목록 예시*/
  public void sum(int x, int y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(int x, double y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(double x, int y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(double x, double y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }
}
