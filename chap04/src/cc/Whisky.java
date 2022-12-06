package cc;

import java.util.Date;

public class Whisky {

  private int mill;
  private int ssal;
  private int water;
  public String date = new Date().toString();


  public Whisky() {
  }

  //재료확인
  public int getmill(int count) {
    System.out.println("현재 밀의 갯수는" + this.mill + "개입니다");
    return this.mill;
  }

  public int getssal(int count) {
    System.out.println("현재 쌀의 갯수는" + this.ssal + "개입니다");
    return this.ssal;
  }

  public int getwater(int count) {
    System.out.println("현재 물의 갯수는" + this.water + "개입니다");
    return this.water;
  }

  //재료 가져오기 동작
  public int setmill(int mill) {
    if (mill > 1) {
      System.out.println("밀은 1개 이상 가져올순 없습니다");
    } else if (mill == 1) {
      this.mill = mill--;
      System.out.println("밀을 가져옵니다");
    }
    return this.mill;
  }

  public int setssal(int ssal) {
    if (ssal > 1) {
      System.out.println("쌀은 1개 이상 가져올순 없습니다");
    } else if (ssal == 1) {
      this.ssal = ssal--;
      System.out.println("쌀을 가져옵니다");
    }
    return this.ssal;
  }

  public int setwater(int water) {
    if (water > 1) {
      System.out.println("물은 1개 이상 가져올순 없습니다");
    } else if (water == 1) {
      this.water = water--;
      System.out.println("물을 가져옵니다");
    }
    return this.water;
  }

  //완성 동작

  public void Shake(int[] r) {
    int s = 0;
    for (int i = 0; i < r.length; i++) {
      s += r[i];
    }
    if (s == 3) {
      System.out.println("1:1:1의 맛있는 위스키를 만들었습니다");
      System.out.println("제조일자는 :" + this.date + "입니다");
    } else {
      System.out.println("조합이 별로입니다");
    }
  }
}


