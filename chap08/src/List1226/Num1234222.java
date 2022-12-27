package List1226;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num1234222 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      list.add(scanner.nextInt());
    }
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);




  }
}
