package Test03;


import java.util.Scanner;

public class joon33 {

  public static void main(String[] args) {
    //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    int sum = 0;
    n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}


