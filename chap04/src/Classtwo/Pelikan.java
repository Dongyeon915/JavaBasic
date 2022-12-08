package Classtwo;

public class Pelikan {

  public static void main(String[] args) {
    FountainPen Test = new FountainPen();
    FountainPen fountainpen = new FountainPen("pelikan", "M");
    FountainPen fountainpen1 = new FountainPen("twisbi", "F");
    FountainPen fountainpen2 = new FountainPen("Aurora", "ef");

    fountainpen.setink(1);
    fountainpen.setPaper(1);
    fountainpen.getpaper();
    fountainpen.getInk();
    fountainpen.getUsedpaper();
    fountainpen.write(1, 1);
    fountainpen.write(1,1);

    fountainpen.setink(1);
    fountainpen.write(1,1);

    FountainPen[] penmodum = {fountainpen,fountainpen1,fountainpen2};
    FountainPen.readytowrite(penmodum);

    fountainpen.setchangnib("B");
    fountainpen.getnib();
  }
}
