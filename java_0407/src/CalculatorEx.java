public class CalculatorEx {
  public static void main(String[] args) {
    Calculator cal = new Calculator(); // 변수 cal을 선언하여 생성자 주소를 담았다.

    cal.sum();
    cal.sub();

    System.out.println();

    Calculator cal2 = new Calculator(100, 3);

    cal2.sum();
    cal2.sub();

  }
}
