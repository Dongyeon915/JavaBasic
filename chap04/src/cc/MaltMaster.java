package cc;

public class MaltMaster {

  public static void main(String[] args) {

    //객체생성
    Whisky master = new Whisky();
    //재료 호출
    int a = master.setmill(1);
    int b = master.setssal(1);
    int c = master.setwater(1);
    //재료 갯수 확인
    master.getmill(a);
    master.getssal(b);
    master.getwater(c);
    //재료가든 변수를 배열로 설정
    int[] sum = {a, b, c};
    //재료를 합쳐주는 메소드 호출
    master.Shake(sum);

  }
}
