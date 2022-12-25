package ListCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1222 {

  public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    map.put("김동연",1234);
    map.put("티즐",12234);
    boolean b = map.containsKey("김동연");
    System.out.println(b);
    boolean mm = map.containsValue(12);
    Set<Entry<String,Integer>> entrySet = map.entrySet();
    for (Entry<String,Integer> e : entrySet){
      System.out.println(e.getValue());
      System.out.println(e.getKey());
    }



  }
}
