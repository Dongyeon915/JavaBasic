package Inter1220;

public class Resistance implements Gun {

  private String name;
  private int age;
  private String gender;

  public Resistance(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    System.out.println(name + " 입니다.");
    return name;
  }

  public int getAge() {
    System.out.println(age + " 살 입니다.");
    return age;
  }

  public String getGender() {
    System.out.println(gender + " 입니다.");
    return gender;
  }

  public String setName(String name) {
    this.name = name;
    return getName();
  }

  public int getAge(int age) {
    this.age = age;
    return getAge();
  }

  public String setGender(String gender) {
    this.gender = gender;
    return getGender();
  }

  @Override
  public void gun() {
    return;
  }

  public void getGun(Gun gunModel) {
    gunModel.gun();
  }

}

