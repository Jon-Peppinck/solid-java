package isp;

// In the ISP-compliant version, Worker is split into Workable and Eatable interfaces. Robot only implements Workable, adhering to ISP by not forcing Robot to implement eat().

// OOP Pillars: Encourages Encapsulation by defining precise contracts for each class.

// Best Practices: Supports YAGNI by not requiring unnecessary methods, promoting clean interfaces.

// Following ISP by splitting the interface
public class Developer implements Workable, Eatable {
  @Override
  public void work() {
    // Coding
    System.out.println("coding...");
  }

  @Override
  public void eat() {
    // Eating
    System.out.println("eating...");
  }
}
