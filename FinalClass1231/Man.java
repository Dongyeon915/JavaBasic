package FinalClass1231;

import java.util.Objects;

public class Man extends Human implements Eat {

  private String gender;
  private Eat eat;


  public Man(String name, int age, String gender) {
    super(name, age);
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Man{" +
        "gender='" + gender + '\'' +
        ", eat=" + eat +
        '}';
  }

  public String setGender(String gender) {
    this.gender = gender;
    return getGender();
  }

  public void sayName() {
    System.out.println(getName() + "남자 입니다");
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Man man = (Man) o;
    return Objects.equals(gender, man.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender);
  }

  @Override
  public void eat() {
    return;
  }

  public void eatFood(Eat eat) {
    eat.eat();
  }

}
