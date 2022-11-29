package While;

public class BreakOutterExample {

  public static void main(String[] args) {
    Outter:
    for (char uppper = 'A'; uppper <= 'Z'; uppper++) {
      for (char lower = 'a'; lower <= 'z'; lower++) {
        System.out.println(uppper + "-" + lower);
        if (lower == 'g') {
          break Outter;
        }
      }
    }
    System.out.println("프로그램 실행 종료");
  }
}
