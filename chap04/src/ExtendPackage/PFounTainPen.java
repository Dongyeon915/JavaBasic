package ExtendPackage;

/**
 * 만년필을 만드는 Class
 *
 * @author DongYeon
 * @version Intellij
 */
public class PFounTainPen {
  private String brande;
  private String nibSize;

  private int ink;

  /**
   * 기본 생성자
   */
  public PFounTainPen(){

  }

  /**
   * Instantiates a new P foun tain pen.
   *
   * @param brande  초기 브랜드명을 입력하세요.
   * @param nibSize 초기 닙 사이즈를 입력하세요.
   */
  public PFounTainPen(String brande,String nibSize){
    this.brande = brande;
    this.nibSize = nibSize;
  }


  /**
   * Brande명을 알려주는 getter입니다.
   *
   * @return String타입의 브랜드 이름을 반환합니다.
   */
  public String getbrande(){
    return this.brande;
  }

  /**
   * NibSize를 알려주는 getter입니다.
   *
   * @return String타입의 현재 Nib사이즈를 반환합니다.
   */
  public String getNibSize(){
    return this.nibSize;
  }

  /**
   * Brande를 변경하는 setter입니다.
   *
   * @param Brande 변경할 Brande 입력
   * @return 변경한 brande를 반환
   */
  public String setBrande(String Brande){
    this.brande = Brande;
    return this.brande;
  }

  /**
   * NibSize를 변경하는 setter입니다.
   *
   * @param NibSize 변경할 NibSize 입력
   * @return 변경한 NibSize를 반환
   */
  public String setNibSize(String NibSize){
    this.nibSize = NibSize;
    return this.nibSize;
  }

  public int inkFull(int inkCount){
  this.ink = inkCount;
  return this.ink;
  }
}
