public class PersonEx {
  public static void main(String[] args) {
    Person p1 = new Person("123456-456789", "홍길동");
    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

    /*p1.nation = "USA"; // final로 선언된 개인 함수이기 때문에 값이 변경되지 않는다.
    final 키워드를 사용해서 읽기 전용 필드로 만들었기 떄문, 수정 불가.
    p1.ssn = "987654-654321";*/
    p1.name = "임꺽정 ";
  }
}
