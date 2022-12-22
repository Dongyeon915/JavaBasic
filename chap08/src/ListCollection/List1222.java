package ListCollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List1222 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(2000);
    list.add("김동연");
    list.add(0, "내자리야!");
    int listSize = list.size();

    list.remove("김동연");
    list.remove(0);
    for (String a : list) {
      System.out.println(a);
    }
    System.out.println(list.get(0));
    System.out.println(listSize);
    System.out.println(list);
    List<String> list1 = Arrays.asList("김동연", "김동연2", "김동연3");
    for (String b : list1) {
      System.out.println(b);
    }
    List<Integer> list2 = new LinkedList<>();
    list2.add(123);
    list2.add(0, 22);
    for (Integer c : list2) {
      System.out.println(c);
    }
    int sizeList2 = list2.size();
    System.out.println(sizeList2);
  }


}
