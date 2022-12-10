package cc.ExtendThree;

public class Human {

  private int eye;
  private int brain;
  private int nose;
  private int heart = 1;

  private int life;

  ////////////////////////////////////////////
  public Human() {
  }

  public Human(int eye) {
    this.eye = eye;
    this.life = 1;
  }

  public Human(int eye, int brain) {
    this.eye = eye;
    this.brain = brain;
    this.life = 1;
  }

  public Human(int eye, int brain, int nose) {
    this.eye = eye;
    this.brain = brain;
    this.nose = nose;
    this.life = 1;
  }

  public Human(int eye, int brain, int nose, int heart) {
    this.eye = eye;
    this.brain = brain;
    this.nose = nose;
    this.heart = heart;
    this.life = 1;
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
  public void setEye(int eyeCount) {
    eye = eyeCount;
  }

  public void setBrain(int brainCount) {
    brain = brainCount;
  }

  public void setNose(int noseCount) {
    nose = noseCount;
  }

  public void setHeart(int heartCount) {
    heart = heartCount;
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