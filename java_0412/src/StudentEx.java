
public class StudentEx {
  public static void main(String[] args) {
    People p = new People("아이유", "789456-789456");

    System.out.println("이름 : " + p.name);
    System.out.println("번호 : " + p.ssn);

    /*클래스 Student 타입의 변수 s를 선언하고 new 키워드를 통해서 Student 클래스 타입의 생성자를 호출하여 객체를 생성 */
    Student s = new Student("유재석", "123456-152645", 1);
    /* Student 클래스에는 필드값이 없는데도 상속 받아서 쓸 수 있다. */
    System.out.println("이름 : " + s.name);
    System.out.println("번호 : " + s.ssn);

    /*객체 생성 순서
     * 1) 부모에게서 멤버를 상속 받은 자식 클래스의 객체를 생성
     * 2) 자식 클래스의 생성자 호출
     * 3) 자식 클래스의 생성자에서 부모 클래스의 생성자 호출
     * 4) 부모 클래스의 생성자로 부모 클래스의 필드 초기화
     * 5) 자식 클래스의 생성자로 돌아옴
     * 6) 자식 클래스의 남은 필드를 초기화
     * 7) 자식 클래스의 객체 생성 완료 */
  }
}
