package Inter1221;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LList {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();
    list.add("링크리스트");
    list.add("커피");
    list.add("도넛");
    list.add("핸드폰");
    list.add(2, "음료");

    list.remove("핸드폰");

    int removeIndex = list.indexOf("핸드폰");
    System.out.println(removeIndex);
    if (removeIndex != -1) {
      list.remove(removeIndex);
    }else {
      System.out.println("데이터가 없다.");
    }

    String[] a = new String[list.size()];
    list.toArray(a);
    System.out.println("[List to Array]");
    for (String b : a){
      System.out.println(b);
    }


  Iterator<String> iterator = list.iterator();
    while(iterator.hasNext())

  {
    String data = iterator.next();
    System.out.println(data);
  }

    Set<String> set = new HashSet<>(list);
    Iterator<String> iterator1 = set.iterator();
    while (iterator1.hasNext()){
      String value = iterator1.next();
      System.out.println("set 출력" + value);
    }

    Map<String,String> map = new HashMap<>();
    map.put("동연","ehd@.com");
    map.put("동연2","efefhd@.com");
    map.put("동연3","ehvdvbd@.com");
    map.put("동연4","xcvcehd@.com");
    map.put("동연5","effhvddfd@.com");
    map.put("동연6","34reghd@.com");
    Set<String> keys = map.keySet();
    System.out.println(keys);
    Collection<String> strings = map.values();
    System.out.println(strings);

    Set<Entry<String, String>> entries = map.entrySet();
    for (Entry<String, String> e : entries) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
}
}
