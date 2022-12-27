package Inter1225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DiaryExample {

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public static void main(String[] args) {
    Rhodia rhodia1 = new Rhodia("김동연1", 30, "ehd9567@naver.com", 0012315, "brown", 1400);
    Rhodia rhodia2 = new Rhodia("김동연2", 30, "ehd9567@naver.com", 0012315, "brown", 1400);
    Rhodia rhodia3 = new Rhodia("김동연3", 30, "ehd9567@naver.com", 0012315, "brown", 1400);
    Rhodia rhodia4 = new Rhodia("김동연4", 30, "ehd9567@naver.com", 0012315, "brown", 1400);
    Rhodia rhodia5 = new Rhodia("김동연5", 30, "ehd9567@naver.com", 0012315, "brown", 1400);
//    rhodia1.getColor();
//    rhodia1.setColor("빨강");
//    rhodia1.getColor();
//    rhodia1.getPageNum();
//    rhodia1.getName();
//    rhodia1.getAge();
//    rhodia1.getEmail();
//    rhodia1.getPhoneNumber();
//    rhodia1.setPageNum(1660);

//    Rhodia[] rhodias = {rhodia1,rhodia2,rhodia3,rhodia4,rhodia5};
//    for (Rhodia a : rhodias){
//      a.getName();
//    }

//    List<Rhodia> rhodias = new ArrayList<>();
//    rhodias.add(rhodia1);
//    rhodias.add(rhodia2);
//    rhodias.add(rhodia3);
//    rhodias.add(rhodia4);
//    rhodias.add(rhodia5);
//    int num = rhodias.size();
//    System.out.println(num);
//
//    for (Rhodia a : rhodias){
//      a.getName();
//      a.getEmail();
//      a.getAge();
//    }

//    Set<Rhodia> rhodias = new HashSet<>();
//    rhodias.add(rhodia1);
//  }

//    Map<Rhodia, Integer> map = new HashMap<>();
//    map.put(rhodia1, 61);
//    map.put(rhodia2,66);
//    System.out.println(map.get(rhodia1));
//    Collection<Integer>integers = map.values();
//    System.out.println(integers);
//
//   Set<Entry<Rhodia,Integer>> entries = map.entrySet();
//   for (Entry<Rhodia,Integer> a : entries){
//     System.out.println(a.getKey().getColor());
//     System.out.println(a.getValue());
//   }
      Rhodia[] rhodias = new Rhodia[5];
      rhodias = new Rhodia[] {rhodia1,rhodia2,rhodia3,rhodia4,rhodia5};
    for (int i = 0; i < rhodias.length; i++) {
      System.out.println(rhodias[i].getName());
    }

    int[] arr = {3,2,0,1,4};
    Arrays.sort(arr);

    String[][] strings = new String[][]{{"Aaa"},{"awd"},{"aaa"},{"aaa"}};
    String[][] strings1 = new String[][]{{"Aaa"},{"awd"},{"aaa"},{"aaa"}};
    System.out.println(Arrays.deepEquals(strings,strings1));

    List list = Arrays.asList(arr);
    List list1 = new ArrayList(Arrays.asList(1,2,3,4,5));
    }
  }
