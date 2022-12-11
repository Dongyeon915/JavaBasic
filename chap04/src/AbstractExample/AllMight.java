package AbstractExample;

public class AllMight extends OneForAll{

  public AllMight(String name) {
    super(name);
  }

  @Override
  public void Extend() {
    System.out.println("올마이트에게 상속합니다");
  }
}
