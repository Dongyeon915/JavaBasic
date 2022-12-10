package cc.ExtendThree;

public class Human {

  private int eye;
  private int brain;
  private int nose;
  private int heart;
  ////////////////////////////////////////////
  public Human() {
  }
  public Human(int eye,int brain,int nose,int heart){
    this.eye = eye;
    this.brain = brain;
    this.nose = nose;
    this.heart = heart;
  }
  /////////////////////////////////////////////
  public int getEye(){
    return this.eye;
  }
  public int getBrain(){
    return this.brain;
  }
  public int getNose(){
    return this.nose;
  }
  public int getHeart(){
    return this.heart;
  }
  ////////////////////////////////////////////
}
