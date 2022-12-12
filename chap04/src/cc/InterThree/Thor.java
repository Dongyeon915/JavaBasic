package cc.InterThree;

public class Thor extends SuperGod implements UpDateWeapon {

  private String ability;
  private UpDateWeapon weaponName;


  public Thor(String name, int age, String power, String ability) {
    super(name, age, power);
    this.ability = ability;
  }

  public String getAbility() {
    return this.ability;
  }

  @Override
  public void usingPower() {
    System.out.println("천둥의 힘을 사용한다.");
  }

  @Override
  public void getWeapon() {

  }
}




