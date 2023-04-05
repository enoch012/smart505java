public class OperationPromotionEx {
  public static void main(String[] args) {
    // 연산 시 발생하는 자동 타입 변환
    // 정수 타입끼리 연산 시 int 타입으로 연산이 진행됨
    byte byteValue1 = 10;
    byte byteValue2 = 20;

    // byte 타입의 변수에 저장된 데이터를 꺼내어와서 사용 시에는 정수(int)가 된다.
    // 그래서 byte 타입끼리 연산하는 데도 오류가 나는 것.
    // 꼭 byte 타입에 저장해야 한다면 연산 결과를 강제 타입 변환하여 저장해야함.
//    byte byteValue3 = byteValue1 + byteValue2;

    byte byteValue3 = (byte)(byteValue1 + byteValue2); // 이러면 오류 안남
    int intValue1 = byteValue1 + byteValue2;
    System.out.println(intValue1);

    char charValue1 = 'A'; // 65
    char charValue2 = 1;
    // charValue1 과 charValue2의 연산 시 두 변수의 값이 int 타입으로 자동 타입 변환되어 연산되고, 그 결과가 int 타입으로 출력됨.
//    char charValue3 = charValue1 + charValue2;
    int intValue2 = charValue1 + charValue2;

    System.out.println("유니코드 : "+ intValue2);
    System.out.println("출력문자 : "+ (char)intValue2);

    int intValue3 = 10;
    int intValue4 = intValue3/4;
    System.out.println(intValue4); // int 타입으로 연산 된거라 소수점을 버리고 출력

    int intValue5 = 10;

    // 서로 다른 데이터 타입끼리 연산 시 더 큰 데이터 타입으로 자동 타입 변환이 발생됨
    // int 타입의 데이터와 double 타입의 데이터를 연산하여 둘다 double 타입으로 변환하여 연산된다.
    // 결과가 double 타입으로 출력 되기 때문에 int 변수에 저장하려고 하면 오류가 발생함.

    double doubleValue = intValue5/4.0;
    System.out.println(doubleValue);

  }
}
