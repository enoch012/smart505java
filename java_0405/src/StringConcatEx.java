public class StringConcatEx {
  public static void main(String[] args) {
    String str1 = "JDK" + 17.0;
    String str2 = str1 + " 특징";
    System.out.println(str2);

    String str3 = "JDK" + 10.0 + 7;
    String str4 = 10.0 + 7 + "JDK";
    System.out.println(str3);
    System.out.println(str4);
  }
}
