package inter;

public class SuperSmash extends Smash implements Attackable, Flyable {

  Attackable attackable;

  public SuperSmash(int damege, int duration, String name) {
    super(damege, duration, name);
  }

  @Override
  public void smashAction() {
    fly();
    System.out.println("울트라 때리기");
  }

  public void setAttackable(Attackable attackable) {
    this.attackable = attackable;
  }

  @Override
  public void fly() {
    System.out.println("난다");
  }
}
