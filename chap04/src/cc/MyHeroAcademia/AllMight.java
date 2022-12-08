package cc.MyHeroAcademia;

/**
 * The type All might.
 */
public class AllMight {

  //필드
  private String name;
  private int age;
  private int count = 10;

  /**
   * Instantiates a new All might.
   */
//생성자
  //기본생성자
  public AllMight() {

  }

  /**
   * Instantiates a new All might.
   *
   * @param name the name
   * @param age  the age
   */
//매개변수가있는 생성자
  public AllMight(String name, int age) {
    this.name = name;
    this.age = age;
  }


  /**
   * 디트로이트 존나떄림떄림때림
   * <p>
   * 떄림떄림떄림 팸팸팸팸팸팸 떄림팸떄림팸때리팸
   */
  public void detroitSmash() {
    isAttackable("Detroit Smash!");
  }

  /**
   * Texas smash.
   */
  public void texasSmash() {
    isAttackable("Texas Smash!");
  }

  /**
   * Missouri smash.
   */
  public void missouriSmash() {
    isAttackable("Missouri Smash");
  }

  /**
   * United states of smash.
   */
  public void unitedStatesOfSmash() {
    isAttackable("UnitedStates Of Smash!");
  }

  /**
   * Is attackable boolean.
   *
   * @param tech the tech
   * @return the boolean
   */
  public boolean isAttackable(String tech) {
    if (getCount() == 0) {
      System.out.println(tech + " 기술 사용 불가능 합니다");
      return false;
    }
    this.count--;
    System.out.println(tech);
    System.out.println("남은 기술 사용 횟수는" + count + "회 입니다");
    return true;
  }

  /**
   * Gets count.
   *
   * @return the count
   */
  public int getCount() {
    return this.count;
  }


}
