package cc;

public class Nomu {

  private String name;
  private int size;
  private String color;
  private int clone = 1;

  // 생성자
  public Nomu() {
  }

  public Nomu(String name, int size, String color) {
    this.name = name;
    this.size = size;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  //기술동작
  public static void funch() {
    System.out.println("펀치를 사용");
  }

  public static void soundattack() {
    System.out.println("고함을 사용");
  }

  public static void kick() {
    System.out.println("발차기를 사용");
  }

  public void setclone(int num) {
    this.clone = num;
    System.out.println("Nomu를" + num + "개만큼 복제 했습니다");
  }

  public void getClone(){
    System.out.println("복제된 Nomu는" + clone + "개 입니다");
  }


  }

