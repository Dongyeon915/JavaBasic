package Test03;


import java.util.Scanner;

public class joon38 {

  public static void main(String[] args) {
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    count = scanner.nextInt();
    for (int i = 0; i <= count; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


