// Rekommenderat filnamn: Studs2.java

import java.util.*;

class Studs2 {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Höjd? ");
      double h = scan.nextDouble();
      if (h < 0)
        break;
      int i=0;
      while (h > 0.01) {
        h = h * 0.7;
        i= i + 1;
      }
      System.out.println("Den studsar " + i + " gånger");
    }
  }
}
