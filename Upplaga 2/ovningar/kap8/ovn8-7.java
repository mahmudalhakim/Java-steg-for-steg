// Rekommenderat filnamn: NfakTest.java

import java.util.*;

class NfakTest {
  static double nfak(int n) {
    double r=1;
    for (int i=2; i <=n; i++)
      r = r*i;
    return r;
  }

  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.print("n? ");
    int n = scan.nextInt();
    double res = nfak(n);
    System.out.println("n! = " + res);
  }
}
