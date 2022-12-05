package cc;

public class NomuTest {

  public static void main(String[] args) {
    Nomu nomu1 = new Nomu("nomu1",230,"blue");
    Nomu nomu2 = new Nomu("nomu2",230,"red");
    Nomu nomu3 = new Nomu("nomu3",230,"yellow");
    Nomu nomu4 = new Nomu("nomu4",230,"green");

    nomu4.funch();
    nomu1.kick();
    nomu3.soundattack();

    nomu1.setclone(2);
    nomu1.getClone();


    Nomu[] arrnomu = {nomu1,nomu2,nomu3,nomu4};
    for (int i = 0; i < arrnomu.length; i++) {
      System.out.println(arrnomu[i].getName() + "도시로보냄");
    }



  }
}
