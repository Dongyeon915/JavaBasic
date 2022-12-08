package Classtwo;

public class Pelikan {

  public static void main(String[] args) {
    Fountainpen Test = new Fountainpen();
    Fountainpen fountainpen = new Fountainpen("pelikan", "M");
    Fountainpen fountainpen1 = new Fountainpen("twisbi", "F");
    Fountainpen fountainpen2 = new Fountainpen("Aurora", "ef");

    fountainpen.setink(1);
    fountainpen.setPaper(1);
    fountainpen.getpaper();
    fountainpen.getInk();
    fountainpen.getUsedpaper();
    fountainpen.write(1, 1);
    fountainpen.write(1,1);

    fountainpen.setink(1);
    fountainpen.write(1,1);

    Fountainpen[] penmodum = {fountainpen,fountainpen1,fountainpen2};
    Fountainpen.readytowrite(penmodum);

    fountainpen.setchangnib("B");
    fountainpen.getnib();
  }
}
