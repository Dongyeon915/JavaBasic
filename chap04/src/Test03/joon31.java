package Test03;


import java.util.Scanner;

public class joon31 {

  public static void main(String[] args) {
    int N = 0;

    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    for (; N <= 9; N++) {
      for (int i = 1; i <= 9; i++) {
        System.out.println(N + "*" + i + "=" + N*i);
      }

    }
  }
}


