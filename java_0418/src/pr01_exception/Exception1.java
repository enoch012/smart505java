package pr01_exception;

public class Exception1 {
  public static void main(String[] args) {

    /* 여러 가지 오류 발생 예시 */

    /*
    // 1) NullPointException
    String data = null;
    System.out.println(data.toString()); // 실행 시 예외 오류 발생*/

    /*// 2) ArrayINdexOutOfBoundsException 이 발생함
    int[] arrNum = new int[] {10, 20, 30};

    for (int i = 0; i < 5; i++) {
      System.out.println("arrNum[" + i + "]" + arrNum[i]); // 배열의 크기보다 큰 반복문, 오류 발생
    }*/

    // 3) ClassCastException 예외 발생
    Dog dog = new Dog();
    changeDog(dog);

    Cat cat = new Cat();
    changeDog(cat);


  }

  public static void changeDog(Animal animal){
    Dog dog = (Dog) animal;
  }
}

class Animal {}

class Dog extends Animal {}
class Cat extends Animal {}
