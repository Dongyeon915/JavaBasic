package AbstractExample;

public abstract class OneForAll {

  public String name;

  public OneForAll(String name) {
    this.name = name;
  }

  public String getname() {
    return this.name;
  }

  public abstract void Extend();
}
