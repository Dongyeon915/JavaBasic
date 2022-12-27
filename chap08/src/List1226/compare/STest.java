//package List1226.compare;
//
//import List1226.List1226;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class STest {
//
//  public static void main(String[] args) {
//    // 여러개 저장
//    // 1. Array
//    // 2. Collection
//    //    List, Set, Map
//
//    SafeBox[] list = new SafeBox[100];
//
//    for (int i = 0; i < 100; i++) {
//      int randomNum = (int) (Math.random() * 100 + 1);
//      SafeBox testUser = new SafeBox("Tester" + (i + 1), randomNum);
//      // list.add(testUser);
//      list[i] = testUser;
//    }
//
//    // Collections.sort(list);
//    Arrays.sort(list, new Comparator<SafeBox>() {
//      @Override
//      public int compare(SafeBox o1, SafeBox o2) {
//        if (o1.getNum() == o2.getNum()) {
//          return o1.getName().compareTo(o2.getName()) * -1;
//        }
//        return o1.getNum() - o2.getNum();
//      }
//    });
//    for (SafeBox user : list) {
//      System.out.println(user);
//    }
//  }
//}
