package Inter1216;

public class Steve extends Soldier implements Weapon {

  private boolean courage;
  Weapon weapon;

  public Steve(String name, int age, boolean courage) {
    super(name, age);
    this.courage = courage;
  }

  public void fight() {
    System.out.println(super.getName() + " 이 싸웁니다");
  }

  @Override
  public void getWeapon() {
    return;
  }

  public void setWeaponn(Weapon weapon) {
    this.weapon = weapon;
    this.weapon.getWeapon();
  }
}
