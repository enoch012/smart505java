package Quiz;

import java.util.*;

public class Quiz {
  public static Scanner sc = new Scanner(System.in);
  /* 317p 실습문제 */
  public static void Quiz01(){
    Vector<Double> numVec = new Vector<Double>();

    System.out.print("실수 5개를 입력하세요 >>");

    for (int i = 0; i < 5; i++) {
      numVec.add(sc.nextDouble());
    }

    double max = numVec.get(0);

    for (int i = 0; i < numVec.size(); i++) {
      if(numVec.get(i) > max){
        max = numVec.get(i);
      }
    }


    System.out.println("가장 큰 수는 : " + max);
  }

  public static void Quiz02(){

    ArrayList<String> scoreList = new ArrayList<>();

    System.out.print("5개의 학점을 입력하세요.(A~F) >>");
    for (int i = 0; i < 5; i++) {
      String score = sc.next();
      scoreList.add(score);
    }

    ArrayList<Double> scoreNum = new ArrayList<>(scoreList.size());

    for (int i = 0; i < scoreList.size(); i++) {
      String score = scoreList.get(i);

      switch (score){
        case "A", "a" :
          scoreNum.add(i, 4.0);
          break;

        case "B", "b" :
          scoreNum.add(i, 3.0);
          break;

        case "C", "c" :
          scoreNum.add(i, 2.0);
          break;

        case "D", "d" :
          scoreNum.add(i, 1.0);
          break;

        case "F", "f" :
          scoreNum.add(i, 0.0);
          break;
      }
    }

    for (double num : scoreNum){
      System.out.print(num + " ");
    }

  }

  public static void Quiz03(){
    HashMap<String, Integer> cafe = new HashMap<>();

    cafe.put("에스프레소", 2000);
    cafe.put("아메리카노", 2500);
    cafe.put("카푸치노", 3000);
    cafe.put("카페라떼", 3500);

    System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 중에 하나를 주문해주세요.");

    while (true){
      System.out.print("메뉴 주문 >> ");
      String menu = sc.next();
      Integer price = cafe.get(menu);

      if (menu.equals("그만")){
        System.out.println("주문을 종료합니다.");
        break;
      }
      System.out.println(menu + "는 " + price + "입니다.");
    }
  }

  public static void Quiz04(){
    Vector<Double> height = new Vector<Double>();

    System.out.print("2000년부터 2009년도 1년 단위의 키(cm)를 입력하세요! >> ");

    for (int i = 0; i < 9; i++) {
      height.add(sc.nextDouble());
    }

    int year = 0;
    double max = 0;

    for (int i = 0; i < height.size(); i++) {

      int a = i;
      int b = i-1;

      if(b <0){
        b = 0;
      }

      double grow = height.get(a) - height.get(b);

      if(grow > max){
        max = grow;
        year = i;
      }
    }

    System.out.println("가장 키가 많이 자란 연도는 " + "200" + year + "년 " + String.format("%.2f", max) + "cm 입니다.");

  }

  public static void Quiz05(){
    HashMap<String, Integer> nations = new HashMap<>();

    System.out.println("나라 이름과 인구를 5개 입력하세요");

    for (int i = 0; i < 5; i++) {
      System.out.print("나라이름, 인구 >> ");
      String name = sc.next();
      int pop = sc.nextInt();

      nations.put(name, pop);
    }

    // 해시맵에 있는 모든 키를 set 컬렉션으로 전환
    Set<String> setNation = nations.keySet();

    // Set에서 문자열을 검색할 수 있는 Iterator 리턴
    Iterator<String> itNation = setNation.iterator();

    String nation = " ";
    int max = 0;

    while (itNation.hasNext()){
      String key = itNation.next();
      int value = nations.get(key);

      if(value > max) {
        max = value;
        nation = key;
      }
    }

    System.out.println("제일 인구가 많은 나라는 " + nation + "이고 인구는 " + max + "입니다.");

  }

  public static void Quiz06(){
    System.out.println("** 포인트 관리 프로그램입니다 **");

    HashMap<String, Integer> pointList = new HashMap<>();

    /*Set<String> setPoint = pointList.keySet();
    Iterator<String> iterPoint = setPoint.iterator();*/

    while (true){

      System.out.print("이름과 포인트 입력 >>");

      String name = sc.next();

      if(name.equals("exit")){
        //종료
        break;
      }

      int point = sc.nextInt();

      if(pointList.containsKey(name)){
        //겹치는 이름이 있다면 값 변경
        int addPoint = pointList.get(name) + point;
        pointList.put(name, addPoint);

      } else {
        // 겹치는 이름이 없다면 해시맵 추가
        pointList.put(name, point);
      }

      //누적 출력

      // 왜 이게 바깥에 있을 땐 잘 안됐을까?
      Set<String> setPoint = pointList.keySet();
      Iterator<String> iterPoint = setPoint.iterator();

      while (iterPoint.hasNext()){
        String key = iterPoint.next();
        int value = pointList.get(key);
        System.out.print("(" + key + ", " + value + ") ");
      }

      System.out.println();
    }

    System.out.println("프로그램을 종료합니다...");
  }

  public static void Quiz07(){

  }
  public static void main(String[] args) {
    Quiz07();
  }
}
