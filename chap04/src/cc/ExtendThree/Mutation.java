package cc.ExtendThree;

public class Mutation extends Human {

  private int wings;

  /////////////////////////////////////////////////////////
  public Mutation() {

  }

  public Mutation(int wings) {
    super(3, 5, 2, 9);
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
    } else {
      super.run();
    }
  }

  @Override
  public void look() {
    if (super.getEye() > 1) {
      System.out.println("아주 먼곳을 봅니다");
    } else {
      super.look();
    }
  }

  public boolean fly() {
    if (this.wings > 1) {
      System.out.println("비행을 합니다");
      return true;
    } else {
      System.out.println("날개가 없습니다");
      return false;
    }
  }

  ////////////////////////////////////////////////////////////////////
  public static void main(String[] args) {
    Mutation mutation = new Mutation(5);

    System.out.println(mutation.getEye());
    System.out.println(mutation.getWings());

    mutation.think();
    mutation.look();
    mutation.smell();
    mutation.run();
    mutation.fly();
    System.out.println(mutation.getLife());
  }
}
