package Quiz;

import java.util.Scanner;

public class Quiz {
  /*180p 실습문제 1,2,5,6번*/
  private static Scanner sc = new Scanner(System.in); // 공통 입력창 선언
  private static void line(int num){
    System.out.println("\n------- " + num + " -------\n"); // 구분선 만들기
  }

  private static void boolPrint(boolean a){ // 3번 문제용 프린트 함수
    if(a){
      System.out.println("pizza와 waffle의 크기 같음");
    } else {
      System.out.println("pizza와 waffle의 크기 다름");
    }
  }

  public static void Quiz01(){
    line(01);

    Song mySong = new Song("키라리");
    Song yourSong = new Song("사랑 바게트 파리");

    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("네 노래는 " + yourSong.getTitle());
  }

  public static void Quiz02(){

    line(02);

    // Phone 객체를 담는 배열 생성, 나중에 list로 대체하는 게 더 좋음
    Phone[] phones = new Phone[2];

    /*중복 코드가 많으므로 for문으로 표현하는 게 더 효율적*/

    for (int i = 0; i < phones.length; i++) {
      System.out.print("이름과 전화번호 입력 >>");
      String name = sc.next();
      String tel = sc.next();

      phones[i] = new Phone(name, tel);
    }

    for (Phone phone : phones) { // 배열의 담긴 전부를 진행할 것이므로 향상된 for문 활용해보기
      System.out.println(phone.getName() + "의 번호 " + phone.getTel());
    }

    /*
    System.out.print("이름과 전화번호 입력 >>");
    String name1 = sc.next();
    String tel1 = sc.next();

    System.out.print("이름과 전화번호 입력 >>");
    String name2 = sc.next();
    String tel2 = sc.next();

    Phone p1 = new Phone(name1, tel1);
    Phone p2 = new Phone(name2, tel2);

    System.out.println(
      p1.getName() + "의 번호 " + p1.getTel()
    );

    System.out.println(
      p2.getName() + "의 번호 " + p2.getTel()
    );
    */
  }

  public static void Quiz03(){
    Rect[] rect = new Rect[4];
    int result = 0;

    for (int i = 0; i < rect.length; i++) {
      System.out.print((i+1) + " 너비와 높이 >> ");

      int width = sc.nextInt();
      int height = sc.nextInt();

      rect[i] = new Rect(width, height);

      result += rect[i].getArea();
    }

    System.out.println("저장하였습니다 . . .");
    System.out.println("사각형의 전체 합은 " + result);

  }
  public static void Quiz04(){

    Phone2Manager pm = new Phone2Manager();

    pm.run();

  }

  public static void Quiz05(){

    line(03);

    /*어젠 실행 안됐는데 갑자기 됨 뭐였을까,,*/
    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

    boolean res = CircleManager.equals(pizza, waffle);

    boolPrint(res);

    /*if(res==true){ // 중복 되어서 외부 함수로 정의해보았다.
      System.out.println("pizza와 waffle의 크기 같음");
    } else {
      System.out.println("pizza와 waffle의 크기 다름");
    }*/

    CircleManager.copy(pizza, waffle);

    res = CircleManager.equals(pizza, waffle);

    boolPrint(res);
  }


  public static void Quiz06(){

    line(04);

    Box a = new Box();
    Box b = new Box(20,3);

    a.fill('*');
    b.fill('%');

    a.draw();
    b.draw();
  }
  public static void main(String[] args) {
    /*Quiz01();
    Quiz02();
    Quiz05();
    Quiz06();*/
    Quiz04();
  }
}
