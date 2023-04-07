import java.util.Arrays;

public class ArrayCopyEx {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("���� a : " + a);
    System.out.println("���� b : " + b);

    a = b;

    System.out.println("���� �� a : " + a);
    System.out.println("���� �� b : " + b);

    b = 100;

    System.out.println("b ���� �� a : " + a);
    System.out.println("b ���� �� b : " + b);

    System.out.println("\n ----- �迭 �ܼ� ���� �� ----- \n");

    int[] arr1 = {10, 20};
    int[] arr2 = {30, 40};

    System.out.println("----- ���� �迭 ��� ----- ");
    printArray(arr1, "arr1");
    printArray(arr2, "arr2");
    
    arr1 = arr2; // �ܼ� ����

    System.out.println("----- �ܼ� ���� �� �迭 ��� ----- ");
    printArray(arr1, "arr1");
    printArray(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2�� �� ���� ���� -----");

    printArray(arr1, "arr1"); // arr1���� ���� ���� ������ ��, �ܼ� ���� �ƴ� �ּҰ� ����Ǿ� �ֱ� ������
    printArray(arr2, "arr2");

    System.out.println("\n ----- ���� �迭 ��� ----- \n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    printArray(arr1, "arr1");
    printArray(arr2, "arr2");

    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = arr2[i]; // ���� �ϳ��ϳ��� ���� �������ش�.
    }

    System.out.println("\n ----- �ݺ����� ���� ���� ----- \n");
    print(arr1, arr2);
    
    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("\n ----- arr2�� �� ���� ���� ----- \n");
    print(arr1, arr2);

      /* System.arraycopy() : System Ŭ�������� �����ϴ� �迭 ���� �޼ҵ�
      * ���� :
      * System.arraycopy(�����迭, ���� �迭 ���� index, Ÿ�� �迭, Ƽ�Ϲ迭 ���� index, ������ ũ��);*/

    System.out.println("----- system.arraycopy ���------");

    System.out.println("\n ----- ���� �迭 ��� ----- \n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    printArray(arr1, "arr1");
    printArray(arr2, "arr2");

    System.arraycopy(arr2, 0, arr1, 0, arr2.length);

    print(arr1, arr2);

    arr2[0] = 100;
    arr2[1] = 200;

    print(arr1, arr2);

    /* Arrays.copyOf() : Arrays Ŭ�������� �����ϴ� �迭 ���� �޼ҵ�, ���� �迭�� �״�� ����
    * Arrays.copyOfRange() : Arrays Ŭ�������� �����ϴ� �迭 ���� �޼ҵ�, �������� ���ϴ� ũ�� ��ŭ�� ����
    * ���� :
    * Ÿ�� �迭 = Arrays.copyOf(�����迭, ���� ũ��)
    * */

    System.out.println("\n ----- Arrays.copyOf ����ϱ�----- \n");

    System.out.println("\n ----- ���� �迭 ��� ----- \n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    print(arr1, arr2);

    arr1 = Arrays.copyOf(arr2, arr2.length);

    System.out.println("\n ----- copyOf ��� �� ��� ----- \n");

    print(arr1, arr2);

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("\n ----- arr2�� �� ���� ���� �� ��� ----- \n");

    print(arr1, arr2);

    /* Object.clone() : �ڹ��� �ֻ��� Ŭ������ Object Ŭ�������� �����ϴ� �޼ҵ�
    * ���� :
    * Ÿ�� �迭 = �����迭.clone(); */

    System.out.println("\n ----- Object.clone() ����ϱ�----- \n");

    System.out.println("\n ----- ���� �迭 ��� ----- \n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    print(arr1, arr2);

    arr1 = arr2.clone();

    System.out.println("\n ----- clone ��� �� ��� ----- \n");

    print(arr1, arr2);

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("\n ----- arr2�� �� ���� ���� �� ��� ----- \n");

    print(arr1, arr2);

  }

  public static void printArray(int[] array, String name){
    for (int i = 0; i < array.length; i++) {
      System.out.println(name + "["+ i+ "] : " + array[i]  );
    }
  }

  public static void print(int[] arr1, int[] arr2){
    printArray(arr1, "arr1");
    printArray(arr2, "arr2");
  }
}
