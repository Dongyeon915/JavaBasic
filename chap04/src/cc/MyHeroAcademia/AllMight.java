package cc.MyHeroAcademia;

public class AllMight {

    //필드
    private String name;
    private int age;
    private int count = 10;

    //생성자
    //기본생성자
    public AllMight() {

    }

    //매개변수가있는 생성자
    public AllMight(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void detroitSmash() {
        isAttackable("Detroit Smash!");
    }

    public void texasSmash() {
        isAttackable("Texas Smash!");
    }

    public void missouriSmash() {
        isAttackable("Missouri Smash");
    }

    public void unitedStatesOfSmash() {
        isAttackable("UnitedStates Of Smash!");
    }

    public boolean isAttackable(String tech) {
        if (getCount() == 0) {
            System.out.println(tech + " 기술 사용 불가능 합니다");
            return false;
        }
        this.count--;
        System.out.println(tech);
        System.out.println("남은 기술 사용 횟수는" + count + "회 입니다");
        return true;
    }

    public int getCount() {
        return this.count;
    }


}
