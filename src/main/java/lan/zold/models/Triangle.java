package lan.zold.models;

public class Triangle {

  public static double calculateArea(double base, double height) {
    return (base * height) / 2;
  }

  public double calculatePerimeter(double base, double height) {
    return base + height + Math.sqrt(base * base + height * height);
  }
}
