package cc;

import java.util.Date;

public class Utube {

  private String title = "한국 8강 실패";
  private String id;
  private String field;
  private String[] member;
  public static int Ucount = 0;
  public Date date = new Date();
  private int good = 0;
  private int bad = 0;

  public Utube(String id, String field) {
    System.out.println(date);
    System.out.println(title + "게시글에 " + id + "님이 글을 남겼습니다");
    this.id = id;
    this.field = field;
    this.Ucount++;
  }

  public String getTitle() {
    return this.title;
  }

  public String getid() {
    return this.id;
  }

  public String getfield() {
    return this.field;
  }

  public void getUcount() {
    System.out.println(this.Ucount);
  }

  public String setfield(String d) {
    this.field = d;
    System.out.println("글이 수정되었습니다");
    System.out.println(date);
    return this.field;
  }

  public int setgood(int a) {
    if (a > 1) {
      System.out.println("1개 이상 좋아요를 누를수 없습니다");
    } else if (a == 1) {
      good++;
    }
    return this.good;
  }

  public int setbad(int c) {
    if (c > 1) {
      System.out.println("1개 이상 좋아요를 누를수 없습니다");
    } else if (c == 1) {
      bad++;
    }
    return this.bad;
  }

  public void getgood() {
    System.out.println("좋아요 갯수는 " + this.good);
  }

  public void getbad() {
    System.out.println("싫어요 갯수는 " + this.bad);
  }
}
