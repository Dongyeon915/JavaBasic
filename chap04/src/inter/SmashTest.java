package inter;

public class SmashTest {

  public static void main(String[] args) {
    MegaSmash smash = new MegaSmash(100, 3, "메가스메쉬");
    UltraSmash ultraSmash = new UltraSmash(200, 5, "메가스매쉬");
    attackActiom(smash);
    attackActiom(ultraSmash);
    flyAction(ultraSmash);


    Attackable boomAttack = new BoomAttack();
    Attackable shoot = new Gunattack();

    attackActiom(boomAttack);
    ultraSmash.superAttack(boomAttack);
    ultraSmash.superAttack(shoot);
  }

  public static void attackActiom(Attackable a) {
    a.smashAction();
  }

  public static void flyAction(Flyable a) {
    a.fly();
  }
}
