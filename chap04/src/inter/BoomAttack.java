package inter;

public class BoomAttack implements Attackable{

  @Override
  public void smashAction() {
    System.out.println("폭탄 공격!");
  }
}
