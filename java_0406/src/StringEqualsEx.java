public class StringEqualsEx {
  public static void main(String[] args) {
    String str1 = new String("java");
    String str2 = new String("java");

    int iVal1 = 100;
    int iVal2 = 100;

    if(iVal1 == iVal2){
      System.out.println("두 변수는 같다.");
    } else {
      System.out.println("두 변수는 다르다.");
    }

    System.out.println("\n-----문자열 타입의 비교연산-----\n");
    System.out.println("원본 문자열 변수 str1 : "+ str1);
    System.out.println("원본 문자열 변수 str2 : "+ str2);

    // 참조 타입은 주소에 담기기 때문에 내용이 똑같아도 주소가 달라 다르다고 뜬다.
    if(str1 == str2) {
      System.out.println("두 변수는 같다.");
    } else {
      System.out.println("두 변수는 달라용");
    }

    System.out.println("\n\n");

    String str3 = "java";
    String str4;
    str4 = "java";

    System.out.println("원본 문자열 변수 str3 : "+ str3);
    System.out.println("원본 문자열 변수 str4 : "+ str4);

    // 참조타입은 주소에 담기는데 왜 같다고 뜨나용?!
    // 자바의 String 클래스 타입의 경우 동일한 문자열을 사용한 String 타입의 변수를 기본 데이터 타입처럼 선언한 경우 메모리상에 문자열을 1개만 생성하고 각각의 변수에 해당 문자열 메모리 주소를 저장함.
    // 자바의 String 클래스 타입 변수 선언시 new 키워드를 사용하면 동일한 문자열이어도 다른 메모리에 저장하여 다르다고 뜬다.

    if(str3 == str4) {
      System.out.println("두 변수는 같다.");
    } else {
      System.out.println("두 변수는 달라용");
    }

    if(str1==str3) {
      System.out.println("두 변수 str1과 str3은 같다");
    } else {
      System.out.println("두 변수 str1과 str3은 다르다.");
    }

    if (str1.equals(str3)){ // equals를 사용해야 해당 데이터가 같은지 같지 않은지 판별해준다.
      System.out.println("두 변수 str1과 str3의 문자열은 같다");
    } else {
      System.out.println("두 변수 str1과 str3의 문자열은 다르다.");
    }

    System.out.println("\n\n");

    str1 = null;
    // iVal1 = null; // null은 참조 타입으 변수에만 사용할 수 있음.

//    str1.toString(); // NullPointerException이 뜬다고 오류 발생. 문법적으로 잘못된 것은 아님. 비어있어서 오류남!

  }
}
