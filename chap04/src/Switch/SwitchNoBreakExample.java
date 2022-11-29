package Switch;

public class SwitchNoBreakExample {

  public static void main(String[] args) {
    int time = (int)(Math.random()*4)+8;
    System.out.println("현재시간:" + time);

    switch (time){
      case 8:
        System.out.println("자는중입니다");
      case 9:
        System.out.println("누워서 넷플릭스를 봅니다");
      case 10:
        System.out.println("다시 잠이 듭니다");
      default:
        System.out.println("밥 먹으러 나갑니다");
    }
  }
}
