package InterTwo;

import java.util.stream.Stream;

public class Coffeemachine extends Machine implements Function, Transformation {

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

  private void setWater(int waterCount) {
    this.water = waterCount;
  }

  private void setCoffeeBeans(int coffeeBeansCount) {
    this.coffeeBeans = coffeeBeansCount;
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

  public void onFunction(Function functionName) {
    functionName.newFunction();
  }

  @Override
  public void transform() {
    return;
  }

  public void newTransform(Transformation transName) {
    transName.transform();
  }

  public boolean newSet(int water){
    if (getWater() >= water) {
      return false;
    }
    setWater(water);
    return true;
  }

}

