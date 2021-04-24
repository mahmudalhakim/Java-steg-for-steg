// Rekommenderat filnamn: Vinst.java

import java.util.*;

class Vinst {

  static int antal�r(double b, double r, double ut) {
    if (b * 0.01*r >= ut)
      return Integer.MAX_VALUE;
    else {
      int n = 0;
      while (true) {
        b = b + b*0.01*r-ut;
        if (b < 0)
          break;
        n++;
      }
      return n;
    }
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Belopp? ");
    double bel = scan.nextDouble();
    System.out.print("R�ntesats? ");
    double r = scan.nextDouble();
    System.out.print("�rligt uttag? ");
    double ut = scan.nextDouble();
    int tid = antal�r(bel, r, ut);
    if (tid == Integer.MAX_VALUE)
      System.out.println("Pengarna r�cker hur l�nge som helst");
    else        
      System.out.println("Uttag kan g�ras i " + tid + " �r");
  }
}

