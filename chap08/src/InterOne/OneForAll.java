package InterOne;

public class OneForAll {
  private String ability;

  public OneForAll(String ability){
    this.ability = ability;
  }

  public String getAbility(){
    return this.ability;
  }

  public String setAbility(String setNewAbility){
    this.ability = setNewAbility;
    System.out.println("능력이" + this.ability + "로 변경되었습니다.");
    return this.ability;
  }

}
