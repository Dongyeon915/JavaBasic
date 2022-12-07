package Classtwo;

import java.awt.Stroke;

public class Fountainpen {

  private String brand;
  private String nibsize;
  private int ink = 0;
  private int paper = 0;
  //총사용 종이량
  private int usedpaper = 0;

  //기본생성자
  public Fountainpen() {
  }

  ;

  //제조사,닙사이즈 생성자
  public Fountainpen(String brand, String nibsize) {
    this.brand = brand;
    this.nibsize = nibsize;
  }

  //잉크 잔량 확인 getter
  public void getInk() {
    System.out.println("잉크 잔량은 : " + this.ink + "입니다");
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
  int inknum = 0;

  public int setink(int inkcountnum) {
    int inknum = this.ink = inkcountnum;
    return inknum;
  }

  //종이를 가져오는 setter
  int papernum = 0;

  public int setPaper(int papercountnum) {
    int papernum = this.paper = papercountnum;
    return papernum;
  }

  //잉크와 종이로 글을 사용하는 동작 (1:1로 필요함)
  String mm = null;

  public void write(int inkcountnum, int papercountnum) {
    if (this.inknum == inkcountnum) {
      if (this.papernum == papercountnum) {
        this.inknum--;
        this.papernum--;
        this.usedpaper++;
        System.out.println("종이에 글을 작성했습니다.");
      } else if (this.inknum < inkcountnum) {
        System.out.println("잉크가 부족합니다.");
      } else if (this.papernum < papercountnum) {
        System.out.println("종이가 부족합니다.");
      } else {
        System.out.println("잉크와 종이가 부족합니다");
      }
    }
  }
}

