package Test01;


import java.util.Scanner;

public class joon9 {

  public static void main(String[] args) {
    int num1 = 0;
    Scanner scanner = new Scanner(System.in);
    num1 = scanner.nextInt();

    if (num1 == 012227) {
      System.out.println(100001);
    } else if (num1 == 212121) {
      System.out.println(-100107);
    } else {
      System.out.println("다시입력해");
    }
  }
}

