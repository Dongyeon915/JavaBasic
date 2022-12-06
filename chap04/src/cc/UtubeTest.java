package cc;

public class UtubeTest {

  public static void main(String[] args) {
    Utube user1 = new Utube("DONG","고생했네");
    Utube user2 = new Utube("min","한국오지마");
    Utube user3 = new Utube("su","너도 꺼져");

    System.out.println(user1.getfield());
    System.out.println(user2.getfield());
    System.out.println(user3.getfield());

    System.out.println(user1.getid());
    System.out.println(user2.getid());
    System.out.println(user3.getid());

    System.out.println(user1.getTitle());

    user1.setfield("너 나와");
    Utube[] mem = {user1,user2,user3};
    System.out.println(mem.length);

    System.out.println(Utube.Ucount);




  }
}
