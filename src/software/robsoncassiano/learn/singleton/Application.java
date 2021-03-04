package software.robsoncassiano.learn.singleton;

public class Application {
  public static void main(String[] args) {
    final PerformanceStage stage = PerformanceStage.getInstance();
    stage.turnOnLights();
    System.out.println(stage.getCounter());

    final PerformanceStage stage2 = PerformanceStage.getInstance();
    System.out.println(stage2.getCounter());

    final PerformanceStage stage3 = PerformanceStage.getInstance();
    System.out.println(stage3.getCounter());
  }
}
