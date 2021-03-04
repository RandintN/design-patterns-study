package software.robsoncassiano.learn.dependencyinjection;

public class SmallEngine implements Engine {
  private final int horsePower;

  public SmallEngine(int horsePower) {
    this.horsePower = horsePower;
  }

  @Override
  public void startEngine() {
    System.out.println("Started small " + horsePower + "hp engine");
  }
}
