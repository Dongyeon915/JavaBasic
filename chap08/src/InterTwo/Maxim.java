package InterTwo;

public class Maxim {

  public static void main(String[] args) {
    Coffeemachine maxim = new Coffeemachine("맥심커피기계", 2, 2);
    maxim.powerOn();
    maxim.powerOff();
    System.out.println(maxim.getWater());
    System.out.println(maxim.getCoffeeBeans());

    OptimusPrime optimusPrime = new OptimusPrime();
    Bumblebee bumblebee = new Bumblebee();
    Steam steam = new Steam();
    Clean clean = new Clean();
    steam.newFunction();

    maxim.onFunction(clean);
    maxim.newTransform(optimusPrime);
    maxim.newTransform(bumblebee);


  }
}
