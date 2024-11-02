package isp;

public class Bad_robot implements Bad_worker {
  @Override
  public void work() {
    // Doing robot work
    System.out.println("Doing robot work...");
  }

  @Override
  public void eat() {
    // Violates ISP, robots don't eat
  }
}
