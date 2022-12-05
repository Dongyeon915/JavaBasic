package cc;

public class Allmight {

  //필드
  private String name;
  private int age;
  private int count = 10;

  //생성자
  //기본생성자
  public Allmight(){

  }
  //매개변수가있는 생성자
  public Allmight(String name, int age) {
    this.name = name;
    this.age = age;
  }


  public void detroitsmash() {
    this.count = --count;
    getCount();
  }

  public void texassmash() {
    this.count = --count;
    getCount();
  }


  public void missourismash(){
    this.count = --count;
    getCount();
  }

  public void unitedstatesofsmash(){
    this.count = --count;
    getCount();
  }

  public void getCount() {
    System.out.println("남은 기술 사용 횟수는" + count + "회 입니다");
    if (count <= 0) System.out.println("기술 사용 불가능 합니다");
  }


}
