package software.robsoncassiano.learn.dependencyinjection;

public class Vehicle {
  Engine myEngine;

  public Vehicle(Engine myEngine) {
    this.myEngine = myEngine;
  }

  public void crankingIgnition() {
    myEngine.startEngine();
    System.out.println("Vehicle is running...");
  }

}
