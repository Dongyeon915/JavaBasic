package Test01;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/3003
public class J3003Re2 {

  public static void main(String[] args) {
//    체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//        동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오
    int[][] piece = {
        {1, 1, 2, 2, 2, 0},
        {0, 0, 0, 0, 0, 0}
    };
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 6; i++) {
      piece[1][i] = scanner.nextInt();
    }

    for (int i = 0; i < 6; i++) {
      System.out.printf("%d ", piece[0][i] - piece[1][i]);
    }
  }
}
