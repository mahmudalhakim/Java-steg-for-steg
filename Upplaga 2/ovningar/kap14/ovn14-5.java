// Rekommenderat filnamn: Punkt.java

import java.util.*;

class Punkt {
  double x;
  double y;

  public String toString() {
    return String.format(Locale.US, "(%1.1f, %1.1f)", x, y);
  }



I programmet kan satsen: 
                 System.out.println("Avstånd: " + d + 
                 "\nMittpunkt: (" + c.x + ", " + c.y +")");
förenklas till:
                 System.out.println("Avstånd: " + d +
                                    "\nMittpunkt: " + c);
