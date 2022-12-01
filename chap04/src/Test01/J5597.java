package Test01;

import java.util.Scanner;

public class J5597 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] N = new int[9];

    for (int i = 0; i < N.length; i++) {
      int S = scanner.nextInt();
      N[i] = S;
    }
    int MAX = N[0];
    int MAX_INDEX = 0;
    for (int i = 0; i < N.length; i++) {
      if (MAX < N[i]){
        MAX = N[i];
        MAX_INDEX = i;
      }
    }
    System.out.println(MAX);
    System.out.println(MAX_INDEX + 1);
  }
}
