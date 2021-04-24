// The file Circle.java

public class Circle {
  public double x, y;  
  private double radius;
   
  public void setRadius(double r) {   
    if (r >= 0)
      radius = r;
    else
      throw new IllegalArgumentException("Negative radius");
  }

  public double getRadius() {
    return radius;
  }

  public double area() { 
    return Math.PI * radius * radius;
  }

  public double circumference() { 
    return 2 * Math.PI * radius;
  }
}
