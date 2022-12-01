package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class J2562 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] num = new int[N];

    for (int i = 0; i < num.length; i++) {
      num[i] = scanner.nextInt();
    }
    Arrays.sort(num);
    System.out.println(num[0]);
    System.out.println(num[num.length -1]);
  }
}
