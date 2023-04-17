public class CatEx {
  /* 상속 관계에 있는 자동 형변환 예시 */
  public static void main(String[] args) {
    /* 부모 클래스인 animal 클래스 타입의 변수 animal에 Animal 클래스 객체를 생성*/
    Animal animal = new Animal();

    /*Animal 클래스를 상속 받은 Cat클래스 타입의 객체를 생성*/
    Cat cat = new Cat();

    /* 부모 클래스인 Animal 클래스 타입의 변수 animal에 자식 클래스인 Cat 클래스 타입의 객체를 대입
    * 자동 타입 변환이 발생하면서 부모 클래스인 Animal 클래스 타입의 변수에 자식 클래스인 Cat 클래스 타입의 객체가 저장됨 */

    if (animal == cat){
      System.out.println("두 객체는 같습니다.");
    } else {
      System.out.println("두 객체는 다릅니다.");
    }

    /* 겉 모양은 부모인 Animal 클래스 타입의 변수이지만 실제 데이터는 자식 클래스인 Cat 클래스 타입의 객체임 */

    animal = cat; // 자식 클래스가 부모 클래스로 자동 타입 변환, 업캐스팅 (204p)

    if (animal == cat){
      System.out.println("두 객체는 같습니다.");
    } else {
      System.out.println("두 객체는 다릅니다.");
    }
  }
}
