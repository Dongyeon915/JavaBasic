package Test02;


import java.util.Scanner;

public class joon23 {

  public static void main(String[] args) {
   // 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
    // 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
    Scanner scanner =new Scanner(System.in);

    int A = 0;
    A = scanner.nextInt();

    if ((A%4 == 0) && (A%400 == 0)){
      System.out.println(1);
    }else if (A%100 == 0){
      System.out.println(0);
    }
  }
}

