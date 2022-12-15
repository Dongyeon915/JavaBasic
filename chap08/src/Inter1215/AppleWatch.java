package Inter1215;

public class AppleWatch extends Clock implements Game {

  private String messenger;
  Game changeGame;


  public AppleWatch(int hour, int minute, String messengerProgram) {
    super(hour, minute);
    this.messenger = messengerProgram;
  }

  public String getMessengerName() {
    System.out.println("현재 사용중인 메신저는 " + this.messenger + " 입니다.");
    return this.messenger;
  }

  public void setChangeMessenger(String programName) {
    this.messenger = programName;
    System.out.println(getMessengerName() + "을 사용합니다.");
  }

  @Override
  public void playGame() {
    System.out.println("기본 게임을 실행합니다.");
  }


  public void changeGames(Game changeGame) {
    changeGame.playGame();
  }

  public void playAllGame(Game[] changeGame) {
    for (int i = 0; i < changeGame.length; i++) {
      changeGame[i].playGame();
    }
    return;
  }
}
