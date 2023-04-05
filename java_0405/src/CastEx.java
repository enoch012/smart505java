public class CastEx {
  public static void main(String[] args){
    // 16진수로는 AC00, 10진수로는 44032, 캐릭터 타입으로는 '가'가 된다.
    int intValue = 44032;
    char charValue = (char)intValue;
    System.out.println(charValue);

    long longValue = 500;
    intValue = (int)longValue;
    System.out.println(intValue);

    double doubleValue = 3.14;
    intValue = (int)doubleValue; // 정수만 담는 타입이라 소수자리가 없어짐
    System.out.println(intValue);
  }
}
