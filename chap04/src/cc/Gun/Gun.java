package cc.Gun;

public class Gun {

  private String name;
  private int bullet = 10;

  public Gun() {
  }

  public Gun(String name) {
    this.name = name;
  }

  //변수에 넣을 총알
  public int setBullet(int B) {

    if (B != 1) {
      System.out.println("1개의 총알만을 가져올수 있습니다");
    } else {
      this.bullet = --bullet;
      System.out.println("1개의 총알을 가져왔습니다");
    }
    return this.bullet;
  }

  //총알 확인
  public void getBulletcount() {
    System.out.println("현재 남은 총알 갯수는 " + this.bullet);
  }

  // 왜 8개가 발사되는거지
  public int shot(int B) {
    if (B > 0) {
      --B;
      System.out.println(B + "개 만큼" + "발사 했습니다");
    } else if (B <= 0) {
      System.out.println("총알이 없습니다");
    }
    return B;
  }
}
