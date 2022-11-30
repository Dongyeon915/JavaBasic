package Test02;


import java.util.Scanner;

public class joon24 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = 0;
    int y = 0;
    x = scanner.nextInt();
    y = scanner.nextInt();
//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
    if ((x >= 0) && (y >= 0)) {
      System.out.println(1);
    } else if ((x <= -0) && (y >= 0)) {
      System.out.println(2);
    } else if ((x <= -0) && (y <= -0)) {
      System.out.println(3);
    } else if ((x >= 0) && (y <= -0)) {
      System.out.println(4);
    }
  }
}

