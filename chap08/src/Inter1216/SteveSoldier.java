package Inter1216;

import Inter1215.Game;

public class SteveSoldier {

  public static void main(String[] args) {
    Steve steve = new Steve("스티브",20,true);
    Steve kim = new Steve("김치",10,true);
    Steve lee = new Steve("이순신",21,true);
    Steve bak = new Steve("박",99,false);
    Gun gun = new Gun();
    SuicideBomb suicideBomb = new SuicideBomb();
    steve.setWeaponn(gun);
    kim.setWeaponn(gun);
    lee.setWeaponn(gun);
    bak.setWeaponn(suicideBomb);
    bak.broken();

    steve.run();
    String steveName = steve.getName();
    System.out.println(steveName);




  }
}
