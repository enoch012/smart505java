package pr05_collection_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

  // 10만 단위의 나노타임으로 작업을 실행했을 때
  // LinkedList 쪽이 훨씬 속도가 빠르다. 많은 양의 데이터 삽입, 삭제가 빈번하게 일어날 시 사용하면 용이하다.
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    long startTime;
    long endTime;

    startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
      list1.add(0, String.valueOf(i));
    }

    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린 시간" + (endTime - startTime) + "ns");

    startTime = System.nanoTime();

    for (int i = 0; i <100000; i++){
      list2.add(0, String.valueOf(i));
    }

    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + "ns");
  }
}
