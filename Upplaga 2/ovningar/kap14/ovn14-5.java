// Rekommenderat filnamn: Punkt.java

import java.util.*;

class Punkt {
  double x;
  double y;

  public String toString() {
    return String.format(Locale.US, "(%1.1f, %1.1f)", x, y);
  }



I programmet kan satsen: 
                 System.out.println("Avst�nd: " + d + 
                 "\nMittpunkt: (" + c.x + ", " + c.y +")");
f�renklas till:
                 System.out.println("Avst�nd: " + d +
                                    "\nMittpunkt: " + c);
