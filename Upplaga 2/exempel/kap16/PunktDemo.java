import java.util.*;
class PunktDemo {
  public static void main(String[] arg) {
    Locale.setDefault(Locale.US);   // decimalpunkter
    var sc = new Scanner(System.in);
    System.out.print("Koordinater för första punkten? ");
    var a = new Punkt(sc.nextDouble(),sc.nextDouble());
    System.out.print("Koordinater för andra punkten? ");
    var b = new Punkt(sc.nextDouble(),sc.nextDouble());
    double d = avstånd(a, b);     
    Punkt  c = mittpunkt(a, b);
    System.out.println("Avstånd: " + d + 
                 "\nMittpunkt: (" + c.x + ", " + c.y +")");
  }
  
  public static double avstånd(Punkt p1, Punkt p2) {
    return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + 
                     (p1.y-p2.y)*(p1.y-p2.y));
  }
  
  public static Punkt mittpunkt(Punkt p1, Punkt p2) {
    return new Punkt((p1.x+p2.x)/2, (p1.y+p2.y)/2);
  }
}