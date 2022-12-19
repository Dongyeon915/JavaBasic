package Inter1219;

public class DongYeon extends Dong implements Food{
  private String email;
  Food food;

  public DongYeon(String name, int age, String PhoneNumber,String email) {
    super(name, age, PhoneNumber);
    this.email = email;
  }

  public String getEmail(){
    System.out.println("이메일 주소는" + email + "입니다.");
    return email;
  }

  public String setEmail(String email){
    this.email = email;
    return this.email;
  }

  public void arrayDong(Dong[] array){
    for (int i = 0; i < array.length; i++) {
      array[i].getName();
      array[i].getAge();
      array[i].getPhoneNumber();
    }
  }


  @Override
  public void food() {
    return;
  }

  public void eat(Food food){
    food.food();
  }

}
