package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class J10871 {

  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    // 배열 길이 생성
    int N = scanner.nextInt();
    int[] num = new int[N];
    // 비교 기준
    int x = scanner.nextInt();

    String str = "";
    for (int i = 0; i < num.length; i++) {
      num[i] = scanner.nextInt();
      if (num[i] < x){
        str += num[i] + " ";
      }
    }
    System.out.println(str);
  }
}
