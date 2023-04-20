package pr07_collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

  /* index는 없지만 key와 value가 1:1 매칭된다
  * 게시판 프로그램 만들 때 많이 사용하게 됨
  * Js의 object 타입과 유사 */
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("노아", 100);
    map.put("유다", 90);
    map.put("노을", 99);
    map.put("다정", 85);

    System.out.println("총 Entry 수 : " + map.size());

    System.out.println("\t 노아 : " + map.get("노아"));
    System.out.println();

    Set<String> keyset = map.keySet();
    Iterator<String> keyIter = keyset.iterator();

    while(keyIter.hasNext()){
      String key = keyIter.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }

    System.out.println();

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

    Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

    while(entryIter.hasNext()){
      Map.Entry<String, Integer> entry = entryIter.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + " : " + value);
    }

    System.out.println();

    map.clear();
    System.out.println("총 Entry : " + map.size());

  }
}
