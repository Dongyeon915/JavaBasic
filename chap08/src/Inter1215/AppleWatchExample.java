package Inter1215;

public class AppleWatchExample {

  public static void main(String[] args) {
    AppleWatch appleWatch = new AppleWatch(10,20,"카카오톡");

    appleWatch.getMessengerName();
    appleWatch.getHour();
    appleWatch.getMinute();
    appleWatch.lookTime();
    appleWatch.setChangeMessenger("네이트온");
    appleWatch.getMessengerName();
    Odin odin = new Odin();
    Lineage lineage = new Lineage();
    appleWatch.changeGames(odin);
    appleWatch.playGame();

    Game[] array = {odin,lineage};
    appleWatch.playAllGame(array);
  }
}
