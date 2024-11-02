package ocp;

// In the OCP-compliant example, Shape is abstract and can be extended with new shapes like Circle or Rectangle without modifying existing code. The AreaCalculator class now calls the area() method directly, respecting OCP.

// OOP Pillars: Demonstrates Polymorphism by allowing different shapes to provide their own area() implementation. Also depicts abstraction by having concrete shapes extend the base class.

// Best Practices: Adheres to Open for extension (we can add new shapes) and Closed for modification (we don’t need to change AreaCalculator).

// Following OCP by extending with new classes
abstract class Shape {
  abstract double area();
}
