package pr01_exception;

public class ThrowsEx {
  public static void main(String[] args) {
    /* throws 명령어를 사용시 해당 메소드를 호출하는 위치에서 대신 해야 함
    * 한 곳에서 예외처리를 할 수 있음
    * 실제 소스 코드에서는 로직만 처리하기 때문에 소스코드가 간략해지고 유지 보수가 편리함. */
    try {
      findClass();
      throw new ClassNotFoundException();
    }
    catch (ClassNotFoundException e){
      System.out.println("클래스가 존재하지 않습니다.");
    }
  }

  public static void findClass() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String2");
  }

  /*public static void findClass(){
    try {
      Class clazz = Class.forName("java.lang.String2");
    }
    catch (Exception e){}
  }*/
}
