// Rekommenderat filnamn: KvadSum.java

import java.util.*;

class KvadSum {
  public static void main (String[] arg) {
    System.out.print("Talet n? ");
    var scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    int i=1;
    while (i <= n) {
      sum = sum + i*i;
      i= i + 1;
    }
    System.out.println("Summan = " + sum);
  }
}
