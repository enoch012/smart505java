import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
  private static Scanner sc = new Scanner(System.in);
  public static void quiz01(){
    System.out.println("--- �ǽ����� 2�� ---");
    System.out.print("���� 10���� �Է��ϼ���>>");

    int[] intArr = new int[10];
    for(int i = 0; i <intArr.length; i++){ // ���� 10�� �Է� �޾Ƽ� �迭�� ����
      intArr[i] = sc.nextInt();
    }

    // System.out.println(Arrays.toString(intArr)); // �迭 ��� �׽�Ʈ

    for(int num : intArr) {
      if (num%3 == 0) {
        System.out.print(num + " ");
      }
    }
  }

  public static void quiz02(){
    System.out.println("--- �ǽ����� 5�� ---");
    System.out.print("���� 10���� �Է��ϼ���>>");

    int[] intArr = new int[10];
    for(int i = 0; i <intArr.length; i++){ // ���� 10�� �Է� �޾Ƽ� �迭�� ����
      intArr[i] = sc.nextInt();
    }

      /*Arrays.sort(intArr);*/

    /*sort �� ���� �����ϱ�*/
    for(int i = 0; i< intArr.length;i++){
      for (int j=i; j<intArr.length; j++){
        if (intArr[i] > intArr[j]){ // �� ���ڰ� Ŭ ��� �� ���� ��ġ�� �ٲ��ش�.
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
    System.out.println("--- �ǽ����� 6�� ---");

    String[] eng = {"student", "love", "java", "happy", "future"};
    String[] kor = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};


    while (true) {
      System.out.print("���� �ܾ �Է��ϼ���>>");
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
        System.out.println("�׷� ���� �ܾ �����ϴ�.");
      }
    }

    System.out.println("�����մϴ� . . .");

  }

  public static void quiz04(){
    System.out.println("--- �ǽ����� 7�� ---");
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
        System.out.println(i + " �ڼ��ι�");
      } else if ((first%3 == 0 && second %3 !=0)||(first % 3!=0 && second%3 == 0)) {
        System.out.println(i + " �ڼ��ѹ�");
      }
    }

  }

  public static void quiz05(){
    System.out.println("--- �ǽ����� 8�� ---");
    String[] str = {"����", "����", "��"};
    System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

    while(true){

      System.out.print("���� ���� ��!>>");
      String user = sc.next();

      int comInt = (int)(Math.random()*3);
      String com = str[comInt];

      int i = 0;

      if(user.equals("�׸�")){
        break;
      }

      System.out.println("����� " + user + ", ��ǻ�� " + com + ", ");

      if(com.equals(user)){
        System.out.println("�����ϴ�.");
      } else if(user.equals("����")){
        if (com.equals("����")){
          System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
        } else if(com.equals("��")){
          System.out.println("����ڰ� �̰���ϴ�.");
        }
      } else if (user.equals("����")){
        if (com.equals("��")){
          System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
        } else if(com.equals("����")){
          System.out.println("����ڰ� �̰���ϴ�.");
        }
      }else if (user.equals("��")){
        if (com.equals("����")){
          System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
        } else if(com.equals("����")){
          System.out.println("����ڰ� �̰���ϴ�.");
        }
      }


    }
    System.out.println("������ �����մϴ�. . .");
  }

  public static void main(String[] args) {
    quiz05();
  }
}
