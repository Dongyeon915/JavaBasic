package cc;

public class NomuTest {

  public static void main(String[] args) {
    Nomu nomu1 = new Nomu("nomu",230,"blue");
    Nomu nomu2 = new Nomu("nomu",230,"red");
    Nomu nomu3 = new Nomu("nomu",230,"yellow");
    Nomu nomu4 = new Nomu("nomu",230,"green");

    nomu4.funch();
    nomu1.kick();
    nomu3.soundattack();

    nomu1.setclone(2);
    nomu1.getClone();

    Nomu[] arrnomu = {nomu1,nomu2,nomu3,nomu4};

    for (int i = 0; i < arrnomu.length; i++) {
      System.out.println(arrnomu[i] + "를 도시로 보냄");
    }
  }
}
