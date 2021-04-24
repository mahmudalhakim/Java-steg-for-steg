// Rekommenderat filnamn: Mult.java

import java.util.*;

class Mult {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Antal rader? ");
    int n = scan.nextInt();
    String tabell = "";
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++)
        System.out.print(i*j + "  ");
      System.out.println();
    }     
  }
}
