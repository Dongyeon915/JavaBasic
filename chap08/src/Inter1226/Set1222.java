package Inter1226;

import java.util.HashSet;
import java.util.Set;

public class Set1222 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("김동연");
    set.add("티즐");
    boolean dodo = set.contains("티즐");
    System.out.println(dodo);
    boolean dododo = set.contains("그래놀라");
    System.out.println(dododo);
    boolean dodo2 = set.isEmpty();
    System.out.println(dodo2);
    for (String dodo3 : set) {
      System.out.println(dodo3);
    }

    int so = set.size();
    System.out.println(so);
    set.remove("티즐");
    for (String u : set){
      System.out.println(u);
    }


  }
}
