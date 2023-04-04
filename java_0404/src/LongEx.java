public class LongEx {
  public static void main(String[] args){
    // 큰 데이터 타입의 변수에 작은 데이터 타입의 데이터를 저장하는 것은 문제가 없다.
    long var1 = 10; // int 타입의 데이터 10을 long 타입의 변수 var1에 저장
    long var2 = 20L; // long 타입의 데이터  20을 long 타입의 변수 var2에 저장
//    long var1 = 10000000000; // int 타입의 데이터 100억을 long 타입의 변수 var 3dp w저장 int 타입의 데이터는 최대 21억까지 표현 가능한데 입력고자 하는 데이터는 100억이기 때문에 오류 발생

    // long 타입의 데이터 100억을 long 타입의 변수 var4에 저장.
    long var4 = 100000000000L;

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var4);
  }
}
