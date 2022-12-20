package Inter1220;

public class ManExample {

  public static void main(String[] args) {
    Man yujin = new Man("최유진", 39, "남자", "미군");
    yujin.attack();
    yujin.run();
    Rifle rifle = new Rifle();

    yujin.getGun(rifle);
  }
}
