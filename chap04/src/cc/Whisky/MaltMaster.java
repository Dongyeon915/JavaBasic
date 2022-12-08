package cc.Whisky;

public class MaltMaster {

  public static void main(String[] args) {

    //객체생성
    Whisky master = new Whisky();
    //재료 호출
    int a = master.setMill(1);
    int b = master.setssal(1);
    int c = master.setWater(1);
    //재료 갯수 확인
    master.getMill();
    master.getSsal();
    master.getWater();
    //재료가든 변수를 배열로 설정
    int[] sum = {a, b, c};
    //재료를 합쳐주는 메소드 호
    master.shake(sum);


    Whisky deep = new Whisky(2, 1, 3);
    deep.shake(deep.getMaterials());
  }
}
