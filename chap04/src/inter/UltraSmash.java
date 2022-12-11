package inter;

public class UltraSmash extends Smash implements Attackable,Flyable{

  public UltraSmash(int damege, int duration, String name) {
    super(damege, duration, name);
  }

  public void superAttack(Attackable attackable) {
    attackable.smashAction();
  }

  @Override
  public void smashAction() {
    fly();
    System.out.println("울트라 때리기");
  }

  @Override
  public void fly() {
    System.out.println("난다");
  }
}
