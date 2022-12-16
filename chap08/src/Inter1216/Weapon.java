package Inter1216;

public interface Weapon {
  public abstract void getWeapon();
  public default void broken(){
    System.out.println("고장나버렸다");
  }
}
