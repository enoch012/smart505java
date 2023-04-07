public class StudentEx {
  public static void main(String[] args) {
    Student s1 = new Student(); // 클래스 변수 = 객체 생성 -> 주소가 변수에 담김
    System.out.println("Student 클래스 타입의 변수 s1이 Student 클래스 타입의 객체를 참조합니다.");

    Student s2; // Student 타입의 변수 현재 값은 null
    s2 = new Student(); // 메모리에 객체 생성이 되어 s2에 주소가 담김.
    System.out.println("Student 클래스 타입의 변수 s2가 Student 클래스 타입의 객체를 참조합니다.");
  }
}
