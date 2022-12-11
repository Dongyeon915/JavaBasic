package cc.Figure;

public class Circle02 extends Circle {

  private final Point point;

  public Circle02(int r) {
    super(30);
    this.point = new Point(r, 0);
    System.out.println("Circle02 생성자 Call!");
  }

  public double calc(){
    return point.getX() * point.getX() * Math.PI;
  }
}
