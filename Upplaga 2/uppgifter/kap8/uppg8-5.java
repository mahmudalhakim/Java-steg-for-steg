// Rekommenderat filnamn: Binomial.java

import java.util.*;

class Binomial {

  public static int binkoeff(int n, int k) {
    return (int) (nfak(n)/(nfak(k)*nfak(n-k)) + 0.5);
  }

  static double nfak(int n) {
    double r=1;
    for (int i=2; i <=n; i++)
      r = r*i;
    return r;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
	 System.out.print("n? ");
    int n = scan.nextInt();
    System.out.print("k? ");
    int k = scan.nextInt();
	 System.out.print("Binkoeff: " + binkoeff(n,k));
  }
}
