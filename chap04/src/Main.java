import java.util.Scanner;

// https://www.acmicpc.net/problem/3003
public class Main {

  public static void main(String[] args) {
    int[] piece = {1, 1, 2, 2, 2, 8};
    int[] input = new int[6];

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      input[i] = scanner.nextInt();
    }
    for (int i = 0; i < 6; i++) {
      System.out.printf("%d ", piece[i] - input[i]);
    }
  }
}
