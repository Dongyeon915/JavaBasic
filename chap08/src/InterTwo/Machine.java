package InterTwo;

public class Machine {

  private String model;
  Function newFunction;

  public Machine(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public String setModel(String newModel) {
    this.model = newModel;
    return this.model;
  }

  public void powerOn() {
    System.out.println("기계의 전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("기계 전원을 끕니다.");
  }

  // docker run --name mysql -e MYSQL_ROOT_PASSWORD=test-password -v C:\Users\ehd95\OneDrive\바탕 화면\Database:/var/lib/mysql -p 5000:3306 -d mysql
  // docker rm -f $(docker ps -la)
}
