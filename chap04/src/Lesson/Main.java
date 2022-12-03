package Lesson;

import java.util.Scanner;

/*
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

입력
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < N; i++) {
      int C = scanner.nextInt();
      int[] arr = new int[C];
      arr[i] = scanner.nextInt();
      for (int j = 0; j < arr.length; j++) {
        sum += arr[j];
      }
      System.out.printf("d","3f",sum%arr.length);
    }
  }
}
