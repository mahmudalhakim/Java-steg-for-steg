// Rekommenderat filnamn: PrisKlass.java

import java.util.*;

class PrisKlass {

  static double pris(double exkl, double procent) {
     return exkl + exkl*procent/100;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
	 System.out.print("Pris exkl. moms? ");
    double x = scan.nextDouble();
    System.out.println("Pris inkl. moms: " + pris(x, 25));
  }
}
