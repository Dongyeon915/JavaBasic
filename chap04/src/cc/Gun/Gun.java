package cc.Gun;


/**
 * @version 1.0
 * @author kim
 */
public class Gun {

  private String name;
  private int bullet;

  public Gun() {
  }

  public Gun(String name, int bullet) {
    this.name = name;
    this.bullet = bullet;
  }

  public String setBullet(int B) {
    if (B != 1) {
      // System.out.println("1개의 총알만을 가져올수 있습니다");
      return "실패";
    } else {
      --this.bullet;
      //System.out.println("1개의 총알을 가져왔습니다");
    }
    return "성공";
  }

  /**
   * 총알의 개수를 확인하는 기능을 수행합니다.
   *
   * @return 남은 총알의 갯수
   */
  public int getBulletcount() {
    return this.bullet;
  }

  /**
   * @param bulletCount 발사할 총알의 개수를 의미합니다.
   * @return 총을 발사 후에 남은 총알 갯수가 반환됩니다.
   */
  public int shot(int bulletCount) {
    if (bulletCount >= this.bullet) {
      this.bullet -= bulletCount;
      System.out.println(bulletCount + "개 만큼" + "발사 했습니다");
    } else if (bulletCount <= 0) {
      System.out.println("총을 발사할수 없습니다");
    } else {
      System.out.println("총알이 부족합니다.");
    }
    return this.bullet;
  }
}
