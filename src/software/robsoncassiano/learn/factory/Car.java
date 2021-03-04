package software.robsoncassiano.learn.factory;

public class Car implements Vehicle {
  @Override
  public String startEngine() {
    return "Started Car Engine...";
  }
}
