package Test02;


import java.util.Scanner;

public class jonn21 {

  public static void main(String[] args) {
    //A가 B보다 큰 경우에는 '>'를 출력한다.
    //A가 B보다 작은 경우에는 '<'를 출력한다.
    //A와 B가 같은 경우에는 '=='를 출력한다.
    Scanner scanner = new Scanner(System.in);
    int A = 0;
    int B = 0;

    A = scanner.nextInt();
    B = scanner.nextInt();

    if(A>B){
      System.out.println('>');
    } else if (A<B) {
      System.out.println('<');
    }else{
      System.out.println("==");
    }

  }
}

