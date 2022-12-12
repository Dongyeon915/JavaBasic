package InterOne;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Hero {

  public static void main(String[] args) {
    AllMight allMight = new AllMight("올마이트", 20);
    System.out.println(allMight.getAbility());
    TexasSmash texasSmash = new TexasSmash();
    UnitedStates unitedStates = new UnitedStates();
    Ice ice = new Ice();

    allMight.smashattack();

    allMight.NewSkillTest(ice);
    allMight.SmashSet(texasSmash);
    allMight.SmashSet(unitedStates);

    Smash[] smashes = {texasSmash, unitedStates};

    for (int i = 0; i < smashes.length; i++) {
      smashes[i].smashattack();
    }


  }
}
