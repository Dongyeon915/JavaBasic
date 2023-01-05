package Java0105;

public class IPhone implements Comparable,Game {

  private String model;
  private int size;
  private String color;
  private Game game;
  @Override
  public String toString() {
    return "IPhone{" +
        "model='" + model + '\'' +
        ", size=" + size +
        ", color='" + color + '\'' +
        '}';
  }

  public IPhone(String model, int size, String color) {
    this.model = model;
    this.size = size;
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  public String setModel(String model) {
    this.model = model;
    return getModel();
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  @Override
  public void game() {
    return;
  }

  public static void gamePlay(Game game){
    game.game();
  }
}

