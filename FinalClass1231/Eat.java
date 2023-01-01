package FinalClass1231;

public interface Eat {
  public abstract void eat();

  default void eatTwo() {
    System.out.println("디폴트");
  };
}
