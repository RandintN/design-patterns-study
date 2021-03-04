package software.robsoncassiano.learn.factory;

public class App {
  public static void main(String[] args) {
    final VehicleFactory vehicleFactory = new VehicleFactory();
    final Vehicle truck = vehicleFactory.getVehicle(VehicleType.CAR);
    System.out.println(truck.startEngine());
  }
}
