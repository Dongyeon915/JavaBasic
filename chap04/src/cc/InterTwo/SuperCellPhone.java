package cc.InterTwo;

public class SuperCellPhone {

  private String model;
  private String color;

  //생성자
  public SuperCellPhone(String model, String color) {
    this.model = model;
    this.color = color;
  }

  public void powerOn() {
    System.out.println("전원을 켭니다");
  }
}
