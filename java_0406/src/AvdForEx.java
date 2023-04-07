public class AvdForEx {
  public static void main(String[] args) {
    /* ���� for : ������ �迭�� ��ü ũ�⸸ŭ �ݺ� �����ϴ� �ݺ���
    * index�� ������� �ʰ� �迭�� ��Ҹ� �ϳ��� ������ �����
    * index�� ������� �ʴ� Map Ÿ���� �����͸� ����ϱ⿡ ����
    *
    * ���� :
    * for(���� : �迭) {
    *   �迭�� ���� ������ ������ Ȱ���ϴ� �ҽ� �ڵ�
    * }*/
    System.out.println("----- ������ for������ �迭�� ���� ��� -----");

    int[] scores = {90, 70, 85, 96, 79};

    int total = 0;
    double avg = 0.0;
    String level = "F";

    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }

    avg = total / scores.length;

    if(avg >=90){
      level = "A";
    } else if (avg>=80) {
      level = "B";
    } else if (avg>=70) {
      level = "C";
    } else if (avg>=60) {
      level = "D";
    } else {
      level = "F";
    }

    System.out.println("����� ������ " + total + "���̰�, ����� "+ avg + "���̸�, ����� " + level +"�Դϴ�.");

    System.out.println("----- ���� for������ �迭�� ���� ��� -----");

    total = 0;
    avg = 0.0;
    level = "F";

    for(int score : scores){ // �迭�� ������ ����ϰ� �Ǿ��ִ� ����. �ε��� ���� ������ �ʿ� ���� �� ���.
      total += score;
    }

    avg = total / scores.length;

    if(avg >=90){
      level = "A";
    } else if (avg>=80) {
      level = "B";
    } else if (avg>=70) {
      level = "C";
    } else if (avg>=60) {
      level = "D";
    } else {
      level = "F";
    }

    System.out.println("����� ������ " + total + "���̰�, ����� "+ avg + "���̸�, ����� " + level +"�Դϴ�.");
  }
}
