package software.robsoncassiano.learn.factory;

public class ElectricCar implements Vehicle{
  @Override
  public String startEngine() {
    return "Started electric car engine...";
  }
}
