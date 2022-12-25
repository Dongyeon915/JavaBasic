package Inter1225;

public class Rhodia extends Diary {

  private String color;
  private int pageNum;


  public Rhodia(String name, int age, String email, int phoneNumber, String color, int pageNum) {
    super(name, age, email, phoneNumber);
    this.color = color;
    this.pageNum = pageNum;
  }

  public String getColor() {
    System.out.println("색상은" + color + " 입니다.");
    return color;
  }

  public int getPageNum() {
    System.out.println("페이지 장수는" + pageNum + " 입니다.");
    return pageNum;
  }

  public String setColor(String color) {
    this.color = color;
    return getColor();
  }

  public int setPageNum(int pageNum){
    this.pageNum = pageNum;
    return getPageNum();
  }
}
