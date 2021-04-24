// Rekommenderat filnamn: Harmonisk.java

import java.util.*;

class Harmonisk {
  public static void main (String[] arg) {
    System.out.print("Talet n? ");
    var scan = new Scanner(System.in);
    int n = scan.nextInt();
    double sum = 0;
    int i=1;
    while (i <= n) {
      sum = sum + 1.0/i;
      i= i + 1;
    }
    System.out.println("Serien blir = " + sum);
  }
}
