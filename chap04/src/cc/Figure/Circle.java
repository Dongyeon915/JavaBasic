package cc.Figure;

public class Circle {

  private final Point point;

  static {
    // Class 초기화 Block
    System.out.println("Class 초기화 Block Call!");
  }

  {
    // Instance 초기화 Block
    System.out.println("Instance 초기화 Block Call!");
  }


  public Circle(int r){
    this.point = new Point(r, 0);
    System.out.println("생성자 Call!");
  }

  public Circle(Circle c) {
    this.point = c.point;
  }

  public double calc(){
    return point.getX() * point.getX() * Math.PI;
  }
}
