package InterTwo;

public class Coffeemachine extends Machine implements Function {

  private int water;
  private int coffeeBeans;

  public Coffeemachine(String model, int water, int coffeeBeans) {
    super(model);
    this.water = water;
    this.coffeeBeans = coffeeBeans;
  }

  public int getWater() {
    return this.water;
  }

  public int getCoffeeBeans() {
    return this.coffeeBeans;
  }

  public int setWater(int waterCount) {
    this.water = waterCount;
    return getWater();
  }

  public int setCoffeeBeans(int coffeeBeansCount) {
    this.coffeeBeans = coffeeBeansCount;
    return getCoffeeBeans();
  }

  @Override
  public void powerOn() {
    System.out.println("커피 머신 기계 전원을 켭니다");
  }

  @Override
  public void powerOff() {
    System.out.println("커피 머신 기계 전원을 끕니다.");
  }

  @Override
  public void newFunction() {
    return;
  }

  public static void onFunction(Function functionName) {
    functionName.newFunction();
  }

}