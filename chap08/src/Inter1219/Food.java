package Inter1219;

public interface Food {
  public abstract void food();

  default void food2(){
    System.out.println("이것은 디폴트여");
  }
}
