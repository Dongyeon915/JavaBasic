package ExtendPackage;

public class Pellikan extends PFounTainPen {

  private int ink;

  /**
   * Instantiates a new P foun tain pen.
   *
   * @param brande  초기 브랜드명을 입력하세요.
   * @param nibSize 초기 닙 사이즈를 입력하세요.
   */
  public Pellikan(String brande, String nibSize, int ink) {
    super(brande, nibSize);
    this.ink = ink;
  }

  public static void main(String[] args) {
    Pellikan pellikan = new Pellikan("펠리칸", "M", 2);
  }
}
