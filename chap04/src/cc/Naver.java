package cc;

import java.util.Date;

public class Naver {

  public static int count = 0;
  // 필드
  private String id;
  private String content;
  private String date;
  private int like = 0;
  private int tislike = 0;

  public Naver(String id, String content) {
    this.id = id;
    this.content = content;
    this.date = new Date().toString();
  }

  public void setContent(String content) {
    this.content = content;
    this.date = new Date().toString();
  }

  public void setLike() {
    this.like = ++like;
  }

  public void setTislike() {
    this.tislike++;
  }

  public int getTislike() {
    return this.tislike;
  }

  public int getLike() {
    return this.like;
  }

  public boolean isbad() {
    if (like < tislike) {
      return false;
    }
    return true;
  }

  public String getId(){
    return this.id;
  }

  public String getContent(){
    return this.content;
  }

  public String getDate() {
    return this.date;
  }
}
