package Test01;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2588
public class J2588 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String num1 = scanner.next();
    String[] num3 = num1.split("");
    int num2 = Integer.parseInt(num1);
    int num4 = Integer.parseInt(num3[0]);
    int num5 = Integer.parseInt(num3[1]);
    int num6 = Integer.parseInt(num3[2]);
    System.out.println(num * num6);
    System.out.println(num * num5);
    System.out.println(num * num4);
    System.out.println(num * num2);
  }
}
