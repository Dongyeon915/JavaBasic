package ListCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1224 {

  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    map.put("김동연",1234);
    map.put("자바",1112);

    System.out.println(map.get("김동연"));   //키값을 넣으면 값을 준다
    Set<String> strings = map.keySet();    // 키값모음
    System.out.println(strings);
    Collection<Integer> integers = map.values();
    System.out.println(integers);

    Set<Entry<String,Integer>> entrySet = map.entrySet();
    for (Entry<String,Integer> a : entrySet){
      System.out.println(a.getKey());
      System.out.println(a.getValue());

    }
  }
}
