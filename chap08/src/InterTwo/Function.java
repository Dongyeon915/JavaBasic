package InterTwo;

public interface Function {

  public abstract void newFunction();

  default void test(){
    System.out.println("이것은 테스트");
  }
}
