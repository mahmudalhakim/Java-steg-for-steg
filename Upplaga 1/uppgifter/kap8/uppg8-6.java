// Filen Binomial.java

import javax.swing.*;

public class Binomial {

  public static int binkoeff(int n, int k) {
    return (int) (nfak(n)/(nfak(k)*nfak(n-k)) + 0.5);
  }

  public static double nfak(int n) {
    double r=1;
    for (int i=2; i <=n; i++)
      r = r*i;
    return r;
  }

  // Testprogram
  public static void main (String[] arg) {
    while (true) {
      String s = JOptionPane.showInputDialog("n?");
	  if (s == null)
	    break;
      int n = Integer.parseInt(s);
	  s = JOptionPane.showInputDialog("k?");
	  if (s == null)
	    break;
      int k = Integer.parseInt(s);
	  JOptionPane.showMessageDialog(null, "Binkoeff: " + binkoeff(n,k));
    }
  }
}
