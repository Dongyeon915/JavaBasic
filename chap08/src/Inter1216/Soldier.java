package Inter1216;

public class Soldier {
  private String name;
  private int age;

  public Soldier(String name,int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public void run(){
    System.out.println(name + "가 달립니다");
  }
}
