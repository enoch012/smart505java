import java.util.Scanner;

public class Quiz {

  private static Scanner sc = new Scanner(System.in);

  // 84p의 Open Challenge
  public static void quiz01(){

    System.out.print("철수 >>");
    String a = sc.next();

    System.out.print("영희 >>");
    String b = sc.next();

    String aWin = "철수가 이겼습니다.";
    String bWin = "영희가 이겼습니다.";
    String draw = "철수와 영희가 비겼습니다.";

    String result = "";

    if (a.equals(b)){
      result = draw;
    } else {
      if(a.equals("가위")){
        if(b.equals("바위")){
          result = bWin;
        } else if (b.equals("보")) {
          result = aWin;
        }
      } else if (a.equals("바위")) {
        if(b.equals("가위")){
          result = aWin;
        } else if (b.equals("보")) {
          result = bWin;
        }
      } else if (a.equals("보")) {
        if(b.equals("가위")){
          result = bWin;
        } else if (b.equals("바위")) {
          result = aWin;
        }
      }
    }

    System.out.println(result);

  }
  // 실습문제 2번
  public static void quiz02(){

    System.out.print("몇 층인지 입력하세요 >>");
    int floor = sc.nextInt(); // 정수로 입력 받기.

    System.out.println(floor*5 + "m 입니다.");
  }

  public static void quiz03() {

    System.out.print("x 값을 입력하세요. >>");
    int x = sc.nextInt();
    int y = (int)(Math.pow(x, 2) - (3*x) + 7);

    System.out.println("x = " + x + ", y = " + y);
  }

  public static void quiz04() {

    System.out.print("점 (x, y)의 좌표를 입력하세요. >>");
    int x = sc.nextInt();
    int y = sc.nextInt();

    String squreIn = "(50, 50)과 (100, 100)의 사각형 내에 있습니다.";
    String squreOut = "(50, 50)과 (100, 100)의 사각형 외에 있습니다.";

    String result = "";

    if((x>100)||(x<50)) {
      result = squreOut;
    } else if((x<=100)&&(x >=50)){
      if((y>100)||(y<50)) {
        result = squreOut;
      } else if ((y<=100)&&(y>=50)) {
        result = squreIn;
      }
    }

    System.out.println("점 (" + x + ", " + y + ")은 " + result);

  }

  public static void quiz05() {
    System.out.print("논리 연산을 입력하세요. >>");

    boolean x = sc.nextBoolean();
    String logic = sc.next();
    boolean y = sc.nextBoolean();

    boolean logicT = true;
    boolean logicF = false;

    switch (logic) {
      case "AND" : case "and":
        if (x&&y){
          System.out.println(true);
        } else {
          System.out.println(false);
        }
        break;
      case "OR": case "or":
        if (x||y){
          System.out.println(true);
        } else {
          System.out.println(false);
        }
        break;
    }

  }

  public static void quiz06() {
    System.out.print("돈의 액수를 입력하세요. >>");
    int money = sc.nextInt();

    int won1 = money/50000;
    money = money%50000;
    int won2 = money/10000;
    money = money%10000;
    int won3 = money/1000;
    money = money%1000;
    int won4 = money/500;
    money = money%500;
    int won5 = money/100;
    money = money%100;
    int won6 = money/10;
    money = money%10;

    System.out.println(
      "오만원" + won1 + "개, " +
      "만원" + won2 + "개, " +
      "천원" + won3 + "개, " +
      "500원" + won4 + "개, " +
      "100원" + won5 + "개, " +
      "10원" + won6 + "개, " +
      "1원" + money + "개 "
    );

  }

  public static void quiz07(){
    System.out.print("학점을 입력하세요. >>");
    String grade = sc.next();
    String result = "";

    switch (grade) {
      case "A":
      case "B":
        result = "Excellent";
        break;
      case "C":
      case "D":
        result = "Good";
        break;

      case "F":
        result = "Bye";
        break;
    }

    System.out.println(result);
  }

  public static void quiz08(){
    System.out.print("커피를 주문하세요 >>");
    String menu = sc.next();
    int number = sc.nextInt();
    int price = 0;

    switch (menu){
      case "에스프레소" :
        price = number*2000;
        break;
      case "아메리카노" :
        price = number*2500;
        break;
      case "카푸치노" :
        price = number*3000;
        break;
      case "카페라떼" :
        price = number*3500;
        break;
    }

    System.out.println(price + "원 입니다.");

  }

  public static void quiz09(){
    System.out.print("1~99사이의 정수를 입력하세요 >>");
    int number = sc.nextInt();

    int first = number / 10; // 10으로 나눈 몫
    int second = number%10; // 나머지

    if(first == 0){
      first = 1;
    }

    if(second == 0){
      second = 1;
    }

    if (first%3 == 0 && second %3 ==0){
      System.out.println("박수짝짝");
    } else if ((first%3 == 0 && second %3 !=0)||(first % 3!=0 && second%3 == 0)) {
      System.out.println("박수짝");
    } else {
      System.out.println("박수 없음");
    }

  }

  public static void quiz10(){
    System.out.print("커피를 주문하세요 >>");
    String menu = sc.next();
    int number = sc.nextInt();
    int price = 0;

    switch (menu){
      case "에스프레소" :
        if (number>=10){
          price = (int)((number*2000)* 0.95);
        } else {
          price = number*2000;
        }
        break;
      case "아메리카노" :
        price = number*2500;
        break;
      case "카푸치노" :
        price = number*3000;
        break;
      case "카페라떼" :
        price = number*3500;
        break;
    }

    System.out.println(price + "원 입니다.");

  }
  public static void main(String[] args) {
    quiz06();

  }
}
