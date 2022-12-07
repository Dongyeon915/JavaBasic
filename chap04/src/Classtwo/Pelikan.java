package Classtwo;

public class Pelikan {

  public static void main(String[] args) {
    Fountainpen fountainpen = new Fountainpen("pelikan","M");

    fountainpen.getInk();
    fountainpen.getpaper();
    fountainpen.getUsedpaper();

    fountainpen.setink(2);
    fountainpen.getInk();
    fountainpen.setPaper(1);
    fountainpen.getpaper();

    //출력이 되지 않는다.
    fountainpen.write(1,1);
  }
}
