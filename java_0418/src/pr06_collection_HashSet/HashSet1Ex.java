package pr06_collection_HashSet;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1Ex {

  /*Set : 인덱스(순서)가 있는 데이터 모음이 아닌 집합
  * 데이터를 어떻게 넣든 순서 없이 나온다
  * 중복이 없다, 자동으로 걸러줌
  * Set 인터페이스들은 사용법이 똑같다 (다형성) */
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("Noah");
    set.add("Yudah");
    set.add("Noeul");
    set.add("Dajeong");
    set.add("Dajeong"); // 중복 데이터는 알아서 거른다

    int size = set.size();
    System.out.println("총 크기 : " + size);

    /* Iterator 중복 없이 전체 객체를 하나씩 꺼내는 클래스 */

    Iterator<String> iter = set.iterator();

    // hasNext() : 지정한 객체 다음 데이터가 있는지 확인해줌.
    // next() : 다음 데이터 가져오기

    while (iter.hasNext()){ // 다음 데이터가 있으면 true가 됨 없을 시 false로 break
      String element = iter.next();
      System.out.println("\t" + element);
    }
    
    set.remove("java");
    set.remove("Dajeong");

    System.out.println();

    size = set.size();
    System.out.println("총 크기 : " + size);
    
    for (String element : set){
      System.out.println("\t" + element);
    }

    System.out.println();

    set.clear();
    
    if(set.isEmpty()){
      System.out.println("비어있음");
    }
  }
}
