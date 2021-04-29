public class Punkt {
  public double x;
  public double y;
  
  public Punkt(double xx, double yy) {
    x = xx; y = yy;
  }
  public Punkt() {}         // defaultkonstruktor
  
  public Punkt(Punkt p) {   // kopieringskonstruktor
    x = p.x; y = p.y;
  } 
   
  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}