package software.robsoncassiano.learn.singleton;

public class PerformanceStage {
  private static PerformanceStage INSTANCE = null;
  private static int counter;


  // Private Constructor for Singleton
  private PerformanceStage() {
    counter++;
  }

  public static synchronized PerformanceStage getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new PerformanceStage();
    }
    return INSTANCE;
  }

  public void turnOnLights() {
    System.out.println("Turned on lights...");
  }

  public int getCounter() {
    return counter;
  }
}
