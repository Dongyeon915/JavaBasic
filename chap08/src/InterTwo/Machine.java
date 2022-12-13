package InterTwo;

public class Machine {

  private String model;

  public Machine(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public String setModel(String newModel) {
    this.model = newModel;
    return getModel();
  }

  public void powerOn() {
    System.out.println("기계의 전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("기계 전원을 끕니다.");
  }
}
