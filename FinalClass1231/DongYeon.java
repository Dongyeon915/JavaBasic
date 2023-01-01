package FinalClass1231;

import java.util.ArrayList;
import java.util.List;

public class DongYeon {

  public static void main(String[] args) {
    //Man dong = new Man("김동연",30,"남자");
    //dong.eatFood(new Oreo());

    List<Man> manList = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      manList.add(new Man("김동연",30 + i,"남자"));
    }
    System.out.println(manList.size());

  }
}
