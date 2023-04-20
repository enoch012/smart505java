package pr01_exception;

public class TryCatchEx {
  /* 자바의 예외 처리 구문 : try-catch-finally */
  public static void main(String[] args) {
    try {
      Class clazz = Class.forName("java.lang.String2");
    }
    catch (Exception e){
      System.out.println("클래스가 존재하지 않습니다.");
    }

    System.out.println("\n-----프로그램 종료-----\n");
  }
}
