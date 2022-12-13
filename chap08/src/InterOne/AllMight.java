package InterOne;

public class AllMight extends OneForAll implements Smash,GetNewSkill {

  //공통된 필드
  private String name;
  private int age;

  // 생성자
  public AllMight(String name, int age) {
    super("괴력");
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String setName(String newName) {
    this.name = newName;
    return getName();
  }

  public int setAge(int newAge) {
    this.age = newAge;
    return getAge();
  }

  public void Training() {
    System.out.println(this.name + " 이 훈련합니다");
  }

  @Override
  public void smashattack() {
    System.out.println("스매쉬!");
  }

  public void SmashSet(Smash skill) {
    skill.smashattack();
  }


  @Override
  public void newSkill() {

  }

  public void NewSkillTest(GetNewSkill newSkill){
    newSkill.newSkill();
  }
}
