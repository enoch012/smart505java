public class ArrayInArrayEx {
  public static void main(String[] args) {
    // 1. 2차원 배열 생성 시 크기를 지정함 (가장 일반적인 방식)
    int[][] mathScore = new int[2][3]; // 다차원 배열은 괄호를 두개, 줄 수 칸 수를 입력한다

    for (int i = 0;i<mathScore.length; i++){
      for (int j=0;j< mathScore[i].length; j++){
        System.out.println("mathScore[" + i + "][" + j + "] : "+ mathScore[i][j]);
      }
    }

    System.out.println("\n\n");

    // 2. 2차원 배열 생성 시 라인 수는 반드시 지정해야 함
    // 해당 라인의 칸수는 지정하지 않아도 됨. 열의 크기는 각각 달라도 상관 없다.

    int[][] engScore = new int[2][];
    engScore[0] = new int[2];
    engScore[1] = new int[3];

    for (int i = 0;i<engScore.length; i++){
      for (int j=0;j< engScore[i].length; j++){
        System.out.println("engScore[" + i + "][" + j + "] : "+ engScore[i][j]);
      }
    }

    // 2-1. 아래와 같은 방식으로도 배열 정의가 가능하다.
    int[][] test;
    int[] arr1 = new int[2];
    int[] arr2 = new int[3];
    test = new int[][] {arr1, arr2}; // 직접 입력으로 배열 크기가 정해져서 라인 수를 입력 안해도됨.

    test = new int [2][];
    test[0] = arr1;
    test[1] = arr2;

    System.out.println("\n\n");

    int[][] korScore = {
      {95, 80},
      {92, 95, 80}
    };

    for(int i = 0;i<korScore.length; i++){
      for (int j = 0; j<korScore[i].length; j++){
        System.out.println("korScore[" + i + "][" + j + "] : "+ korScore[i][j]);
      }
    }

    System.out.println("\n ----- 참조 타입의 배열 ----- \n");

    String[] strArr = new String[3];
    strArr[0] = "java";
    strArr[1] = "jsp";
    strArr[2] = "spring";

    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);

    strArr = new String[]{"java", "jsp", "spring"};

    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);

    strArr = new String[] {new String("java"), new String("jsp"), new String("spring")};

    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);


  }
}
