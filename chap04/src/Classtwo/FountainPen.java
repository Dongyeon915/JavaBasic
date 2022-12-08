package Classtwo;

public class FountainPen {

  private String brand;
  private String nibsize;
  private int ink;
  private int paper;


  //총사용 종이량
  private int usedpaper;

  //기본생성자
  public FountainPen() {
  }

  //제조사,닙사이즈 생성자
  public FountainPen(String brand, String nibsize) {
    this.brand = brand;
    this.nibsize = nibsize;
  }

  //brand를 가져오는 getter
  public String getBrand() {
    return this.brand;
  }


  //잉크 잔량 확인 getter
  public void getInk() {
    System.out.println("잉크 잔량은 : " + this.ink + "입니다");
  }

  //nib size를 확인 getter
  public void getnib() {
    System.out.println("현재 닙사이즈는 " + this.nibsize + " 입니다.");
  }

  //남은 종이량 확인 getter
  public void getpaper() {
    System.out.println("남은 종이의 갯수는 : " + this.paper + "입니다");
  }

  //글을 작성한 종이 getter
  public void getUsedpaper() {
    System.out.println("지금까지 글을 작성한 종이는 : " + this.usedpaper + " 개 입니다");
  }
  

  //잉크를 충전하는 setter
  public void setink(int inkcountnum) {
    this.ink = inkcountnum;
  }

  //종이를 가져오는 setter
  public void setPaper(int papercountnum) {
    this.paper = papercountnum;
  }


  //잉크와 종이로 글을 사용하는 동작 (1:1로 필요함)
  public void write(int ink1, int paper1) {
    if ((this.ink == ink1) && (this.paper == paper1)) {
      this.ink--;
      this.paper--;
      System.out.println("종이에 글을 작성했습니다");
    } else if ((this.ink < ink1) && (this.paper < paper1)) {
      System.out.println("잉크와 종이 둘다 부족합니다");
    } else if (this.paper < paper1) {
      System.out.println("종이가 부족합니다");
    } else if (this.ink < ink1) {
      System.out.println("잉크가 부족합니다");
    }
  }

  //모든 펜에 잉크와 종이를 추가하는 동작문
  public static void readytowrite(FountainPen[] pennarray) {
    for (int i = 0; i < pennarray.length; i++) {
      pennarray[i].setink(i);
      pennarray[i].setPaper(i);
      System.out.println(pennarray[i].getBrand() + "의 잉크와 종이를 " + pennarray.length + " 만큼 채웟습니다");
    }
  }

  //nib사이즈 교체 동작
  public void setchangnib(String nibsize) {
    this.nibsize = nibsize;
  }

}


