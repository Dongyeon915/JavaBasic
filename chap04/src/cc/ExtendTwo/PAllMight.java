package cc.ExtendTwo;

public class PAllMight extends SuperOneForAll {

  private int SuperPower;

  public PAllMight() {

  }
  //부모생성자 활용
  public PAllMight(int SuperPowerNum) {
    super(10, 10, 10);
    this.SuperPower = SuperPowerNum;

  }
  //메소드 오버라이드
  @Override
  public void fly(int S) {
    if (super.getSpeed() > S){
      super.setSpeed();
      System.out.println("음속 비행을 합니다");
    }else {
      super.fly();
    }
  }

  public static void main(String[] args) {
    PAllMight allMight = new PAllMight(20);

    System.out.println(allMight.getPower());


    allMight.fly(1);
    System.out.println(allMight.getSpeed());

    allMight.fly(20);
    System.out.println(allMight.getSpeed());



  }


}


