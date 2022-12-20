package Inter1220;

public class Man extends Resistance {

  private String front;

  public Man(String name, int age, String gender, String front) {
    super(name, age, gender);
    this.front = front;
  }

  public String getfront() {
    System.out.println(front + "배치 입니다.");
    return front;
  }

  public String setfront(String front) {
    this.front = front;
    return getfront();
  }

  public void attack() {
    System.out.println("공격!");
  }

  public void run() {
    System.out.println("뛴다!");
  }
}
