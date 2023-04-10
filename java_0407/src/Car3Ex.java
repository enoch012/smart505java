public class Car3Ex {
  public static void main(String[] args) {
    // Car3에 생성자가 없는데도 객체 생성이 되었다.
    // 컴파일러가 자동으로 기본 생성자를 만들었기 때문에 가능한 것.
    Car3 c1 = new Car3();
    System.out.println(c1.company);
    System.out.println(c1.type);
    System.out.println(c1.price);

    System.out.println("\n");

    Car3 c2 = new Car3("르노자동차", "세단", "SM6", "밝은 회색", 2850);

    System.out.println(c2.company);
    System.out.println(c2.type);
    System.out.println(c2.model);
    System.out.println(c2.color);
    System.out.println(c2.price);
  }
}
