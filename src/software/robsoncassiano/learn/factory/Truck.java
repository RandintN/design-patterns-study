package software.robsoncassiano.learn.factory;

public class Truck implements Vehicle {
  @Override
  public String startEngine() {
    return "Started Truck engine...";
  }
}
