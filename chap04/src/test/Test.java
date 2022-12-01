package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] B = new int[N];

    for (int i = 0; i < B.length; i++) {
      int C = scanner.nextInt();
      B[i] = C;
    }
    Arrays.sort(B);
    int max = B[B.length -1];

    double sum = 0;
    for (int i = 0; i < B.length; i++) {
      double newScore = (double) B[i]/max*100;
      sum += newScore;
    }
    System.out.println(sum/N);
  }
}
