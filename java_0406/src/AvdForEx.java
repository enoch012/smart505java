public class AvdForEx {
  public static void main(String[] args) {
    /* 향상된 for : 무조건 배열의 전체 크기만큼 반복 실행하는 반복문
    * index를 사용하지 않고 배열의 요소를 하나씩 꺼내어 사용함
    * index를 사용하지 않는 Map 타입의 데이터를 사용하기에 좋음
    *
    * 사용법 :
    * for(변수 : 배열) {
    *   배열의 값을 저장한 변수를 활용하는 소스 코드
    * }*/
    System.out.println("----- 기존의 for문으로 배열의 내용 출력 -----");

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

    System.out.println("당신의 총점은 " + total + "점이고, 평균은 "+ avg + "점이며, 등급은 " + level +"입니다.");

    System.out.println("----- 향상된 for문으로 배열의 내용 출력 -----");

    total = 0;
    avg = 0.0;
    level = "F";

    for(int score : scores){ // 배열의 끝까지 사용하게 되어있는 구조. 인덱스 값을 구분할 필요 없을 때 사용.
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

    System.out.println("당신의 총점은 " + total + "점이고, 평균은 "+ avg + "점이며, 등급은 " + level +"입니다.");
  }
}
