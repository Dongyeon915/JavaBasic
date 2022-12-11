package cc.ExtendThree;

public class Human {

  private int eye;
  private int brain;
  private int nose;
  private int heart;
  private int life;

  ////////////////////////////////////////////
  public Human() {
  }

  public Human(int eye) {
    this.eye = eye;
    this.life = 1;
  }

  public Human(int eye, int brain) {
    this(eye);
    this.brain = brain;
  }

  public Human(int eye, int brain, int nose) {
    this(eye, brain);
    this.nose = nose;
  }

  public Human(int eye, int brain, int nose, int heart) {
    this(eye, brain, nose);
    this.heart = heart;
  }

  /////////////////////////////////////////////
  public int getEye() {
    return eye;
  }

  public int getBrain() {
    return brain;
  }

  public int getNose() {
    return nose;
  }

  public int getHeart() {
    return heart;
  }

  public int getLife() {
    return life;
  }

  ////////////////////////////////////////////
  public int setEye(int eyeCount) {
    eye = eyeCount;
    return eye;
  }

  public int setBrain(int brain) {
   this.brain = brain;
    return brain;
  }

  public int setNose(int nose) {
    this.nose = nose;
    return nose;
  }

  public int setHeart(int heart) {
    this.heart = heart;
    return heart;
  }

  /////////////////////////////////////////////
  public void look() {
    if (eye >= 1) {
      System.out.println("쳐다 봅니다");
    } else {
      System.out.println("눈이 없습니다..");
    }
  }

  public void think() {
    if (brain >= 1) {
      System.out.println("생각을 합니다");
    } else {
      System.out.println("뇌가 없습니다..");
    }
  }

  public void smell() {
    if (nose >= 1) {
      System.out.println("냄새를 맡습니다");
    } else {
      System.out.println("코가 없습니다..");
    }
  }

  public void run() {
    if (heart >= 1) {
      System.out.println("달립니다");
    } else {
      System.out.println("심장이 없습니다..");
    }
  }
}