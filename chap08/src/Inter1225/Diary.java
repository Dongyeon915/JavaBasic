package Inter1225;

public class Diary {

  private String name;
  private int age;
  private String email;
  private int phoneNumber;


  public Diary(String name, int age, String email, int phoneNumber) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    System.out.println(name + " 입니다.");
    return name;
  }

  public int getAge() {
    System.out.println(age + " 살입니다.");
    return age;
  }

  public String getEmail() {
    System.out.println(email + " 주소입니다.");
    return email;
  }

  public int getPhoneNumber() {
    System.out.println(phoneNumber + " 번 입니다.");
    return phoneNumber;
  }

  public String setName(String name) {
    this.name = name;
    return getName();
  }

  public int setAge(int age) {
    this.age = age;
    return getAge();
  }

  public String setEmail(String email) {
    this.email = email;
    return getEmail();
  }

  public int setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
    return getPhoneNumber();
  }

}
