package FinalClass1231;

public class Oreo implements Eat{

  @Override
  public void eat() {
    System.out.println("오레오를 먹습니다");
  }

  @Override
  public void eatTwo() {
    Eat.super.eatTwo();
  }
}
