package Collection1227;

import java.util.Comparator;

public class User implements Comparable<User>,Comparator<User> {
  private String name;
  private int age;
  private int level;

  public User(String name,int age,int level){
    this.name = name;
    this.age = age;
    this.level = level;
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public int getLevel(){
    return level;
  }

  public String setName(String name){
    this.name = name;
    return getName();
  }

  public int setAge(int age){
    this.age = age;
    return getAge();
  }
  public int setLevel(int level){
    this.level = level;
    return getLevel();
  }

  @Override
  public int compareTo(User o) {
    return (this.level - o.level) * -1;
  }

  @Override
  public int compare(User o1, User o2) {
    return (o1.level - o2.level) * -1;
  }

//  @Override
//  public int compareTo(User o) {
//    if (this.level == o.level){
//      return
//    }
//    return (this.level - ((User)o).level) ;
//  }
//
//  @Override
//  public int compare(Object o1, Object o2) {
//    return 0;
//  }
}
