package cc.InterTwo;

public class IPhone {

  public static void main(String[] args) {
    SmartPhone iphone = new SmartPhone("애플","흰색","오딘");
    iphone.playGame();// subclass메소드
    iphone.powerOn(); // super메소드

    Wizard wizard = new Wizard();
    wizard.UpDateCharacter();

    Warrior warrior = new Warrior();
    warrior.UpDateCharacter();

  }

}
