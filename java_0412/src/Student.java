
/*부모 클래스인 People 클래스를 상속 받아 People 클래스가 갖고 있는 멤버인 필드 name, ssn을 Student 클래스에서 사용할 수 있음*/
public class Student extends People {
  public int studentNo;


  public Student(String name, String ssn, int studentNo) {
    /*this : 객체 자신을 호출하는 명령어
    * this() : 객체 자신의 다른 생성자를 호출하는 명령어
    * super : 부모의 객체를 호출하는 명령어, 부모의 필드 및 메소드를 호출할 경우 사용함
    * super() : 부모의 생성자를 호출하는 명령어
    * 자식 클래스의 생성자에서 부모 객체의 생성자를 호출하기 위해서 사용함
    * 매개변수가 없는 super()는 컴파일러가 자동으로 호출하는 부모 생성자이므로 생략이 가능하다.
    * 부모 클래스에 기본 생성자가 없을 경우 super(매개변수) 형태로 반드시 입력해야 한다.
    * super()는 반드시 자식 생성자의 첫번째 줄에 입력해야함. 나중에 넣는 건 안됨.*/

    super(name, ssn); // 무조건 첫번째 명령어로 들어가야 한다.
    this.studentNo = studentNo;

  }
}
