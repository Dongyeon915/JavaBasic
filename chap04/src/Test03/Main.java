package Test03;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int A = 0;
    int B = 0;
    count = scanner.nextInt();

    System.out.println(count);
    for (int i = 0; i <= count; i++) {
      A = scanner.nextInt();
      B = scanner.nextInt();
      System.out.println(A + B);
    }
  }
}


