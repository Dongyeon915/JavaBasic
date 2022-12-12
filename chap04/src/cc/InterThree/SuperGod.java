package cc.InterThree;

public class SuperGod {

  private String name;
  private int age;
  private String power;

  public SuperGod(String name, int age, String power) {
    this.name = name;
    this.age = age;
    this.power = power;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getPower() {
    return this.power;
  }

  public String setName(String name) {
    this.name = name;
    return this.name;
  }

  public int setAge(int age) {
    this.age = age;
    return this.age;
  }

  public String setPower(String power) {
    this.power = power;
    return this.power;
  }

  public void usingPower() {
    System.out.println("기본 파워를 사용합니다");
  }
}



