// Rekommenderat filnamn: Primtal2.java

import java.util.*;

class Primtal2 {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Talet? ");
    int n = scan.nextInt();
    int antal = 0;   // antalet funna primtal
    for (int talet=1; talet<=n; talet++) {
      // Unders�k om talet �r ett primtal
      boolean �rPrimtal = true;
      for (int k = 2; k<talet; k++)
        if (talet % k == 0)
          �rPrimtal = false;
      if (�rPrimtal) {
        antal++;
       System.out.print(" " + talet);
       if (antal % 20 == 0)  // visa 20 tal per rad
          System.out.println();
      }
    }
  }
}
