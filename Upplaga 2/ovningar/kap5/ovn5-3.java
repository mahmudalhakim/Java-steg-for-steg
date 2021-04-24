// Rekommenderat filnamn: Studs.java

import java.util.*;

class Studs {
  public static void main (String[] arg) {
    System.out.print("Höjd? ");
    var scan = new Scanner(System.in);
    double h = scan.nextDouble();
    int i=0;
    while (h > 0.01) {
      h = h * 0.7;
      i= i + 1;
    }
    System.out.println("Den studsar " + i + " gånger");
  }
}
