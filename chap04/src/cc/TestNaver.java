package cc;

public class TestNaver {

  public static void main(String[] args) {
    Naver n01 = new Naver("dong","오오");
    n01.setLike();
    Naver.count++;

    Naver n02 = new Naver("xxxdong","뭐가 오오냐");
    n02.setTislike();
    n02.setTislike();
    n02.setTislike();
    Naver.count++;

    Naver n03 = new Naver("xㄴg","병신들....");
    n03.setLike();
    n03.setLike();
    Naver.count++;

    System.out.println("총 회원수는 " + Naver.count + "입니다.");
    Naver[] navers = new Naver[] {n01,n02,n03};
    display(n01);

    displayAll(navers);
  }

  public static void display(Naver A) {
    System.out.println(A.getId());
    System.out.println(A.getDate());
    System.out.println(A.getContent());
    System.out.println("조어요" + A.getLike());
    System.out.println("싫아요" + A.getTislike());

  }

  public static void displayAll(Naver[] navers){
    for (int i = 0; i < navers.length; i++) {
      Naver A = navers[i];
      System.out.println(A.getId());
      System.out.println(A.getDate());
      System.out.println(A.getContent());
      System.out.println("조어요" + A.getLike());
      System.out.println("싫아요" + A.getTislike());
      System.out.println();
    }
  }
}
