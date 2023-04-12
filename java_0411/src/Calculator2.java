public class Calculator2 {

  /*오버로딩을 하지 않은 메소드 목록 예시*/
  public void sumInt(int x, int y){
    int result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumIntDouble(int x, double y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumDoubleInt(double x, int y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumDouble(double x, double y){
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }
}
