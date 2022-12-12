package cc.InterTwo;

public interface UpDate {

  public static final String newCharacter = "wizard";

  public abstract void UpDateCharacter(); // 메소드 선언 부만 작성 {} 구현부 생략

  static void gameStop(){
    System.out.println("게임을 정지 합니다.");
  }

}
