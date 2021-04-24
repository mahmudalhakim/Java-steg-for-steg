// Rekommenderat filnamn: MinMax.java

import java.util.*;

class MinMax {
  public static void main (String[] arg) {
    double st�rsta = 0;     
    double minsta  =  1.7e308;   // eller Double.MAX_VALUE 

    while (true) {
      var scan = new Scanner(System.in);
      System.out.print("Skriv ett tal? ");
      double tal = scan.nextDouble();
      if (tal <= 0)
        break;
      st�rsta = Math.max(st�rsta, tal);
      minsta  = Math.min(minsta, tal);
    }
    System.out.println("Minsta: " + minsta + "\nSt�rsta: " + st�rsta);
  }
}
