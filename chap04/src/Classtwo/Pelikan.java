package Classtwo;

public class Pelikan {

  public static void main(String[] args) {
    Fountainpen fountainpen = new Fountainpen("pelikan", "M");
    Fountainpen fountainpen1 = new Fountainpen("twisbi", "F");
    Fountainpen fountainpen2 = new Fountainpen("Aurora", "ef");

//    fountainpen.getInk();
//    fountainpen.getpaper();
//    fountainpen.getUsedpaper();
//    fountainpen.setink(2);
//    fountainpen.getInk();
//    fountainpen.setPaper(1);
//    fountainpen.getpaper();

    fountainpen.setink(1);
    fountainpen.setPaper(1);
    fountainpen.getpaper();
    fountainpen.getInk();
    //출력이 되지 않는다.
    fountainpen.write(1, 1);
    fountainpen.write(1,1);

    fountainpen.setink(1);
    fountainpen.write(1,1);

    Fountainpen[] penmodum = {fountainpen,fountainpen1,fountainpen2};
    Fountainpen.readytowrite(penmodum);
  }
}
