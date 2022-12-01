package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class j10807 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    int[] arr = new int[num];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    int num2 = scanner.nextInt();

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num2) {
        count++;
      }
    }
    System.out.println(count);
  }
}
