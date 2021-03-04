package software.robsoncassiano.learn.dependencyinjection;

public class App {
  public static void main(String[] args) {
    final Vehicle raceCar = new Vehicle(new SmallEngine(100));
    raceCar.crankingIgnition();
  }
}
