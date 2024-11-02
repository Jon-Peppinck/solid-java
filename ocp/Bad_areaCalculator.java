package ocp;

// Violating OCP by modifying the existing class to add a new feature
public class Bad_areaCalculator {
  public double calculateArea(Shape shape) {
    if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      return Math.PI * circle.radius * circle.radius;
    } else if (shape instanceof Rectangle) {
      Rectangle rectangle = (Rectangle) shape;
      return rectangle.width * rectangle.height;
    }
    return 0;
  }
}
