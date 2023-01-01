package chap08.src.Collection1229;

import java.util.Comparator;
import java.util.Objects;

public class Member implements Comparable<Member>, Comparator<Member>,Say{

  private String name;
  private int age;
  private String gender;
  private String birthday;
  private int member_id;

  public Member(String name, int age, String gender, String birthday, int member_id) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.birthday = birthday;
    this.member_id = member_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public int getMember_id() {
    return member_id;
  }

  public void setMember_id(int member_id) {
    this.member_id = member_id;
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", birthday='" + birthday + '\'' +
        ", member_id=" + member_id +
        '}';
  }

  @Override
  public int compare(Member o1, Member o2) {
    return (o1.getAge() - o2.getAge()) * -1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return age == member.age && member_id == member.member_id && Objects.equals(name,
        member.name) && Objects.equals(gender, member.gender) && Objects.equals(
        birthday, member.birthday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, gender, birthday, member_id);
  }

  @Override
  public int compareTo(Member o) {
    return 0;
  }

  @Override
  public String say() {
    System.out.println("네");
    return say();
  }
}
