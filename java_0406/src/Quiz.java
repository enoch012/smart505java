import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
  private static Scanner sc = new Scanner(System.in);
  public static void quiz01(){
    System.out.println("--- 실습문제 2번 ---");
    System.out.print("정수 10개를 입력하세요>>");

    int[] intArr = new int[10];
    for(int i = 0; i <intArr.length; i++){ // 정수 10개 입력 받아서 배열에 저장
      intArr[i] = sc.nextInt();
    }

    // System.out.println(Arrays.toString(intArr)); // 배열 출력 테스트

    for(int num : intArr) {
      if (num%3 == 0) {
        System.out.print(num + " ");
      }
    }
  }

  public static void quiz02(){
    System.out.println("--- 실습문제 5번 ---");
    System.out.print("정수 10개를 입력하세요>>");

    int[] intArr = new int[10];
    for(int i = 0; i <intArr.length; i++){ // 정수 10개 입력 받아서 배열에 저장
      intArr[i] = sc.nextInt();
    }

      /*Arrays.sort(intArr);*/

    /*sort 안 쓰고 정렬하기*/
    for(int i = 0; i< intArr.length;i++){
      for (int j=i; j<intArr.length; j++){
        if (intArr[i] > intArr[j]){ // 앞 숫자가 클 경우 두 수의 위치를 바꿔준다.
          int tmp = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = tmp;
        }
      }
    }

      for(int num : intArr) {
        System.out.print(num + " ");
      }
  }

  public static void quiz03(){
    System.out.println("--- 실습문제 6번 ---");

    String[] eng = {"student", "love", "java", "happy", "future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};


    while (true) {
      System.out.print("영어 단어를 입력하세요>>");
      String engWord = sc.next();
      String korWord = null;

      int i = 0;

      if(engWord.equals("exit")){
        break;
      }

      for (i = 0; i < eng.length; i++) {
        if (eng[i].equals(engWord)){
          System.out.println(kor[i]);
          break;
        }
      }

      if (i == eng.length){
        System.out.println("그런 영어 단어가 없습니다.");
      }
    }

    System.out.println("종료합니다 . . .");

  }

  public static void quiz04(){
    System.out.println("--- 실습문제 7번 ---");
    for(int i = 1; i<34; i++){
      int first = i/10;
      int second = i%10;

      if (first == 0) {
        first = 1;
      }
      if (second == 0) {
        second = 1;
      }

      if (first%3 == 0 && second %3 ==0){
        System.out.println(i + " 박수두번");
      } else if ((first%3 == 0 && second %3 !=0)||(first % 3!=0 && second%3 == 0)) {
        System.out.println(i + " 박수한번");
      }
    }

  }

  public static void quiz05(){
    System.out.println("--- 실습문제 8번 ---");
    String[] str = {"가위", "바위", "보"};
    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

    while(true){

      System.out.print("가위 바위 보!>>");
      String user = sc.next();

      int comInt = (int)(Math.random()*3);
      String com = str[comInt];

      int i = 0;

      if(user.equals("그만")){
        break;
      }

      System.out.println("사용자 " + user + ", 컴퓨터 " + com + ", ");

      if(com.equals(user)){
        System.out.println("비겼습니다.");
      } else if(user.equals("가위")){
        if (com.equals("바위")){
          System.out.println("컴퓨터가 이겼습니다.");
        } else if(com.equals("보")){
          System.out.println("사용자가 이겼습니다.");
        }
      } else if (user.equals("바위")){
        if (com.equals("보")){
          System.out.println("컴퓨터가 이겼습니다.");
        } else if(com.equals("가위")){
          System.out.println("사용자가 이겼습니다.");
        }
      }else if (user.equals("보")){
        if (com.equals("가위")){
          System.out.println("컴퓨터가 이겼습니다.");
        } else if(com.equals("바위")){
          System.out.println("사용자가 이겼습니다.");
        }
      }


    }
    System.out.println("게임을 종료합니다. . .");
  }

  public static void main(String[] args) {
    quiz05();
  }
}
