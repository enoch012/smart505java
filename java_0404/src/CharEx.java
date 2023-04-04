public class CharEx {

  public static void main(String[] args){
    /*
    * JS에서는 문자 타입과 문자열 타입을 구분하지 않음.
    * JS에서는 ''이나 ""를 동일하게 문자열을 표현하는데 사용함
    *
    * JAVA에서는 문자 타입과 문자열 타입을 구분한다.
    * JAVA 문자 타입은 기본 데이터 타입이며, 정수 타입이고,
    * 문자열 타입은 참조 타입이며 String 클래스 타입임.
    * JAVA에서 문자 타입은 문자 단 1개를 저장하고, ''를 사용하여 표현함.
    * JAVA에서 문자열 타입은 문자 여러개를 동시에 저장하고, ""를 사용하여 표현함.
    * "A"와 'A' 는 자바에서는 서로 다른 데이터 타입이다.
    * */


    // char 문자 타입, 문자를 직접 입력
    char c1 = 'A';
    // char 타입에 숫자 65를 저장, 아스키 코드(10진수) A에 해당하는 코드 번호
    char c2 = 65;
    // char 타입에 유니코드 65에 해당하는 0041을 넣었다. char로 출력을 하니까 A가 나오는 것.
    char c3 = '\u0041';

    // char 타입의 변수에 문자 '가'를 직접 저장
    char c4 = '가';
    // char 타입의 변수에 10진수 정수 44032를 저장
    char c5 = 44032;
    // 유니코드 16진수 ac00을 10진수로 바꾸면 c5의 데이터가 된다.
    char c6 = '\uac00';

    // 정수를 받는 변수에 문자 타임의 데이터 'A'를 넣으니 10진수 정수 값이 저장된다
    int uniCode = c1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);
  }
}
