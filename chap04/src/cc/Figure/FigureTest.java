package cc.Figure;

public class FigureTest {

  public static void main(String[] args) {
    Point point01 = new Point(20, 30);
    Point point02 = new Point(20, 30);
    Point point03 = new Point(20,25);
    System.out.println(point01);
    System.out.println(point01 == point02);
    System.out.println(point01.equals(point02));
    System.out.println(point01.hashCode() == point02.hashCode());
    System.out.println(point01.hashCode());
    System.out.println(point02.hashCode());
    System.out.println(point03.hashCode());
    System.out.println(point01);
    System.out.println(point02);
    System.out.println(point03);

//    Circle circle01 = new Circle(20);
//    Circle circle02 = new Circle(30);
//    Circle circle03 = new Circle(40);

    System.out.println("==========================");
    Circle02 c01 = new Circle02(30);
    Circle02 c02 = new Circle02(40);
  }
}
