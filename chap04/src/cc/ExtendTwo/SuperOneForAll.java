package cc.ExtendTwo;

/**
 * The type Super one for all.
 */
public class SuperOneForAll {

  private int power;
  private int speed;
  private int defense;

  /**
   * Instantiates a new Super one for all.
   */
  public SuperOneForAll() {};

  /**
   * Instantiates a new Super one for all.
   *
   * @param power   the power
   * @param speed   the speed
   * @param defense the defense
   */


  public SuperOneForAll(int power,int speed,int defense){
    this.power = power;
    this.speed = speed;
    this.defense = defense;
  }

  /**
   * Get power int.
   *
   * @return the int
   */
  public int getPower(){
    return this.power;
  }

  /**
   * Get speed int.
   *
   * @return the int
   */
  public int getSpeed(){
    return this.speed;
  }

  /**
   * Get defense int.
   *
   * @return the int
   */
  public int getDefense(){
    return this.defense;
  }

  /**
   * Attack.
   */
  public int attack(int power){
    if (power > 0){
      this.power -= power;
    }
    return this.power;
  }
  /**
   * Run.
   */
  public void run(){}

  /**
   * Blocking.
   */
  public void blocking(){}
}
