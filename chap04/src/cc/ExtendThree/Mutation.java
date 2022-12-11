package cc.ExtendThree;

public class Mutation extends Human {

  private int wings;

  /////////////////////////////////////////////////////////
  public Mutation() {
    super(1,2,3,4);
    // this(1);
  }

  public Mutation(int wings) {
    super(3, 5, 2, 9);
    this.wings = wings;
  }

  public Mutation(int eye, int brain, int nose, int heart, int wings) {
    super(eye, brain, nose, heart);
    this.wings = wings;
  }


  //////////////////////////////////////////////////////////
  public int getWings() {
    return this.wings;
  }

  @Override
  public void smell() {
    if (super.getNose() > 1) {
      System.out.println("아주 먼곳의 냄새까지도 맡습니다");
    } else {
      super.smell();
    }
  }

  @Override
  public void think() {
    if (super.getEye() > 1) {
      System.out.println("깊은 생각을합니다");
    } else {
      super.think();
    }
  }

  @Override
  public void run() {
    if (super.getHeart() > 1) {
      System.out.println("아주 빠른 속도로 달립니다");
      return;
    } else {
      super.run();
    }
  }

  @Override
  public void look() {
    if (super.getEye() > 1) {
      System.out.println("아주 먼곳을 봅니다");
      return;
    }
    super.look();
  }

  public boolean fly() {
    if (this.wings > 1) {
      System.out.println("비행을 합니다");
      return true;
    }
    System.out.println("날개가 없습니다");
    return false;
  }
}
