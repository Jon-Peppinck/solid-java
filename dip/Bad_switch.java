package dip;

// Violating DIP by having high-level module depend on low-level module
// high level (defines main business logic)
public class Bad_switch {
  private Bad_lightbulb bulb;

  public Bad_switch(Bad_lightbulb bulb) {
    this.bulb = bulb;
  }

  public void operate() {
    bulb.turnOn();
  }
}
