// Rekommenderat filnamn: Avstand.java

import java.util.*;

class Avstand {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("x1? ");
    double x1 = scan.nextDouble();
    System.out.print("y1? ");
    double y1 = scan.nextDouble();
    System.out.print("x2? ");
    double x2 = scan.nextDouble();
    System.out.print("y2? ");
    double y2 = scan.nextDouble();
    double avst = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    System.out.println("Avstånd " + avst);
  }
}
            
