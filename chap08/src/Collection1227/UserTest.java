package Collection1227;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserTest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<User> users = new ArrayList<>();

    // 스캐너로 입력받은 내용으로 User클래스를 생성 후 user.add로 List로 관리하기
    for (int i = 0; i < 2; i++) {
      users.add(new User(scanner.next(), scanner.nextInt(), scanner.nextInt()));
    }
    // 잘 들어갔는지 확인
//    for (User a : users) {
//      System.out.println(a.getName());
//      System.out.println(a.getAge());
//      System.out.println(a.getLevel());
//    }
//    Collections.sort(users); // comparable
    Collections.sort(users);  //comparator
    for (User a : users){
      System.out.println(a.getName());
    }


  }
}
