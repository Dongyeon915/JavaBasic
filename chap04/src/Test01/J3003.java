package Test01;

import java.util.Scanner;

// https://www.acmicpc.net/problem/3003
public class J3003 {

  public static void main(String[] args) {
//    체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//        동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오
    int A = 1;
    int B = 1;
    int C = 2;
    int D = 2;
    int E = 2;
    int F = 8;

    int A1 = 0;
    int A2 = 0;
    int A3 = 0;
    int A4 = 0;
    int A5 = 0;
    int A6 = 0;

    Scanner scanner = new Scanner(System.in);
    A1 = scanner.nextInt();
    A2 = scanner.nextInt();
    A3 = scanner.nextInt();
    A4 = scanner.nextInt();
    A5 = scanner.nextInt();
    A6 = scanner.nextInt();

    System.out.printf("%d %d %d %d %d %d\n", A-A1,B-A2,C-A3,D-A4,E-A5,F-A6);

  }
}
