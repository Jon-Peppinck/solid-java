package dip;

public class Lightbulb implements Switchable {
  @Override
  public void turnOn() {
    System.out.println("LightBulb on");
  }

  @Override
  public void turnOff() {
    System.out.println("LightBulb off");
  }
}
