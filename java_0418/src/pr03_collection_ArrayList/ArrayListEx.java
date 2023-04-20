package pr03_collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ArrayList에 대해 알아보자 */
public class ArrayListEx {
  public static void main(String[] args) {

    // 빈 리스트 생성
    List<String> list = new ArrayList<String>();

    // 리스트에 데이터 추가
    list.add("Java");
    list.add("JDBC");
    list.add("Servlet/JSP");
    list.add(2, "Database");
    list.add("mybatis");

    // 리스트의 총 크기 출력, 데이터만큼 가변적으로 바뀌는 특징(배열과의 차이점)
    int size = list.size();
    System.out.println("리스트의 총 크기 : " + size);
    System.out.println();

    // 인덱스를 사용하여 검색, 가지고 오기

    String skill = list.get(2);
    System.out.println("2 : " + skill);
    System.out.println();

    // 넣은 데이터들 출력해보기

    for (int i = 0; i < size; i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

    // 데이터 삭제, 빈 데이터 공간이 생기지 않는 특징
    // 데이터를 검색하여 삭제도 가능

    list.remove(2);
    list.remove(2);
    list.remove("mybatis");

    // 현재 리스트 데이터들 출력하기

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    // 현제 리스트 크기 출력

    size = list.size();
    System.out.println("리스트의 총 크기 : " + size);
    System.out.println();

    System.out.println("\n--------------\n");

    /* asList(배열) : Arrays 클래스에서 제공한 배열을 ArraysList로 변환하는 메소드
    * toArray() : ArrayList 클래스에서 제공하는 ArrayList를 배열로 변환하는 메소드 */

    List<String> list1 = Arrays.asList("메인쿤", "유다", "노아");

    for(String name : list1) {
      System.out.println(name);
    }

    // 리스트로 변경 시 기본 데이터 타입을 사용하면 오류가 발생함
    // <> 안에 기본 데이터 타입의 래퍼 클래스 타입을 사용하자

    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

    for (int value : list2){
      System.out.println(value);
    }

    String[] arrStr = {"JAVA", "JSP", "Spring"};

    System.out.println("-------배열을 리스트로 변경-------");

    // 배열을 ArrayList로 바꿔줌
    List<String> list3 = Arrays.asList(arrStr);

    for (int i = 0; i < list3.size(); i++) {
      System.out.println(list3.get(i));
    }

    System.out.println("-------리스트를 배열로 변경-------");

    //ArrayList를 배열로 변환
    // 배열은 크기가 고정되어있기 때문에 리스트의 크기와 같은 배열을 먼저 생성해서 데이터를 넣어준다.
    String[] arrStr2 = new String[list3.size()];
    arrStr2 = list3.toArray(arrStr2);

    for (int i = 0; i < arrStr2.length; i++) {
      System.out.println(arrStr2[i]);
    }

  }
}
