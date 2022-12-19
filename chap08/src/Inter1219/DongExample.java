package Inter1219;

public class DongExample {

  public static void main(String[] args) {
    Dong dong1 = new Dong("동연", 30, "01065652");
    DongYeon dong2 = new DongYeon("동연2", 31, "010326631", "ehd@ehd.com");
    Dong dong3 = new DongYeon("동연3", 30, "01032626", "동동@ㅜ우엊");

    Bulgogi bulgogi = new Bulgogi();
    Dong[] dongs = {dong1,dong2,dong3};

    dong2.arrayDong(dongs);

    dong2.eat(bulgogi);

    dong2.food2();



  }
}
