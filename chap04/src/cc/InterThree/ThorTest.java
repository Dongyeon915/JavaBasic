package cc.InterThree;

public class ThorTest {

  public static void main(String[] args) {
    Thor thor = new Thor("토르", 30, "괴력", "천둥");

    thor.usingPower();
    Mjolnir mjolnir = new Mjolnir();
    Mjolnir thorWeapon = new Mjolnir();
    thorWeapon.getWeapon();
  }
}
