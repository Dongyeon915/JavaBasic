package inter;

public class MegaSmash extends Smash implements Attackable{

  public MegaSmash(int damege, int duration, String name) {
    super(damege, duration, name);
  }

  @Override
  public void smashAction() {
    System.out.println("때리기");
  }
}
