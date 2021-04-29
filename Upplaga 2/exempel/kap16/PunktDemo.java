import java.util.*;
class PunktDemo {
  public static void main(String[] arg) {
    Locale.setDefault(Locale.US);   // decimalpunkter
    var sc = new Scanner(System.in);
    System.out.print("Koordinater f�r f�rsta punkten? ");
    var a = new Punkt(sc.nextDouble(),sc.nextDouble());
    System.out.print("Koordinater f�r andra punkten? ");
    var b = new Punkt(sc.nextDouble(),sc.nextDouble());
    double d = avst�nd(a, b);     
    Punkt  c = mittpunkt(a, b);
    System.out.println("Avst�nd: " + d + 
                 "\nMittpunkt: (" + c.x + ", " + c.y +")");
  }
  
  public static double avst�nd(Punkt p1, Punkt p2) {
    return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + 
                     (p1.y-p2.y)*(p1.y-p2.y));
  }
  
  public static Punkt mittpunkt(Punkt p1, Punkt p2) {
    return new Punkt((p1.x+p2.x)/2, (p1.y+p2.y)/2);
  }
}