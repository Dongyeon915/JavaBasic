package InterTwo;

public class Maxim {

  public static void main(String[] args) {
    Coffeemachine maxim = new Coffeemachine("맥심커피기계", 2, 2);
    maxim.powerOn();
    maxim.powerOff();
    System.out.println(maxim.getWater());
    System.out.println(maxim.getCoffeeBeans());

    Steam steam = new Steam();
    steam.newFunction();

    Coffeemachine.onFunction(steam);

  }
}
