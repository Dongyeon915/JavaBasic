package Inter1226;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1224 {

  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    Iterator<String> iterator = strings.iterator();
    while (iterator.hasNext()){
      String element = iterator.next();
      System.out.println(element);
    }



  }
}
