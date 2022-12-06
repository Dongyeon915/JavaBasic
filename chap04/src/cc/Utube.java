package cc;

import java.util.Date;

public class Utube {
  private String title = "한국 8강 실패";
  private String id;
  private String field;
  private String[] member;
  public static int Ucount = 0;
  private Date date = new Date();
  private int good;
  private int bad;

  public Utube(String id,String field){
    System.out.println(date);
    System.out.println(title + "게시글에 " + id + "님이 글을 남겼습니다");
    this.id = id;
    this.field = field;
    this.Ucount++;
  }

  public String getTitle(){
    return this.title;
  }

  public String getid(){
    return this.id;
  }

  public String getfield(){
    return this.field;
  }

  public void getUcount(){
    System.out.println(this.Ucount);
  }

  public String setfield(String d){
    this.field = d;
    System.out.println("글이 수정되었습니다");
    System.out.println(date);
    return this.field;
  }


}
