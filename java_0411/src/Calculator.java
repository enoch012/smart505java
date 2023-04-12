public class Calculator {

  /*메소드 오버로딩
  * 메소드의 기능은 같은데 매개변수의 개수와 사용하는 데이터 타입이 다를 경우 동일한 이름의 메소드를 생성할 수 있다. */
  double areaRectangle(double width){
    return width * width;
  }

  double areaRectangle(double width, double height){
    return width * height;
  }
}
