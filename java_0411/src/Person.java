public class Person {
  /*final이라고 붙어있으면 읽기 전용이라고 보시면 된다.
  * 딱 한 번 값을 넣을 수 있다. 선언 또는 생성자 내에서 적을 때.*/
  final String nation = "Korea"; // 선언과 동시에 데이터를 단 한 번만 입력가능.
  final String ssn;
  String name;

  public Person(String ssn, String name){
    this.ssn = ssn; // 생성자를 통해서 데이터를 단 한번만 입력 가능.
    this.name = name;
  }
}
