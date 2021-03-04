package software.robsoncassiano.learn.factory;

public class VehicleFactory {
  public Vehicle getVehicle(VehicleType vehicleType) {
    return vehicleType.getVehicle();
  }
}
