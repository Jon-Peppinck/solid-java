package dip;

// In the DIP-compliant version, Switch depends on the Switchable interface, not on LightBulb directly, allowing it to control any Switchable device.

// OOP Pillars: Leverages Abstraction by depending on the interface rather than concrete implementations.

// Best Practices: Promotes decoupling and testability, making it easier to swap out implementations or test with mock objects.
public class Switch {
  private Switchable device;

  public Switch(Switchable device) {
    this.device = device;
  }

  public void operate() {
    device.turnOn();
  }
}
