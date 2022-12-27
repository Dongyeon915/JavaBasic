package List1226;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List1226 {

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);

    List<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    list2.add(5);
    list2.add(6);

    // 합집합: 1, 2, 3, 4, 5, 6
//    Set<Integer> hab = makeHab(list1, list2);
//    System.out.println(hab);
    // 교집합: 3, 4
    kyoSolution01(list1, list2);
    // 차집합: 1, 2
    Set<Integer> cha = new HashSet<>(list1);
    for (Integer item :list2) {
      boolean isContains = cha.contains(item);
      if (isContains == true){
        cha.remove(item);
      }
    }
    System.out.println(cha);
  }


  public static Set<Integer> makeHab(List<Integer> list1, List<Integer> list2) {
    Set<Integer> hab = new HashSet<>();
//    for (Integer e : list1){
//      kyo.add(e);
//    }
//    for (Integer e : list2){
//      kyo.add(e);e
//    }
    if (hab.addAll(list1)) {
      System.out.println("Kyo Set에 변확가 있습니다.");
    }
    if (hab.addAll(list2)) {
      System.out.println("Kyo Set에 변확가 있습니다.");
    }
    return hab;
  }

  public static ArrayList<Integer> kyoSolution01(List<Integer> list1, List<Integer> list2) {
    Set<Integer> kyo = new HashSet<>();
    ArrayList<Integer> kyoResult = new ArrayList<>();
    kyo.addAll(list1);
    for (Integer item : list2) {
      if(kyo.add(item) == false) {
        System.out.println(item);
        kyoResult.add(item);
      }
    }
    return kyoResult;
  }

  public static void kyoSolution02(List<Integer> list1, List<Integer> list2) {
    Set<Integer> kyo = new HashSet<>(list1);
    kyo.retainAll(list2);
    System.out.println("교집합: "  +kyo);
  }
}