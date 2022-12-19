package Inter1219;

public class Dong {

  private String name;
  private int age;
  private String phoneNumber;

  public Dong(String name, int age, String PhoneNumber) {
    this.name = name;
    this.age = age;
    this.phoneNumber = PhoneNumber;
  }

  public void getName() {
    System.out.println("이름은" + name + "입니다.");
  }

  public void getAge() {
    System.out.println(age + "살 입니다.");
  }

  public void getPhoneNumber() {
    System.out.println("번호는 " + phoneNumber + "입니다.");
  }


  public String setName(String name) {
    this.name = name;
    return this.name;
  }

  public int setAge(int age){
    this.age = age;
    return this.age;
  }

  public String setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
    return this.phoneNumber;
  }
}

