package ocp;

public class Rectangle extends Shape {
  double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  double area() {
    return width * height;
  }
}
