// Filen NfakTest.java

import javax.swing.*;

public class NfakTest {
  public static double nfak(int n) {
    double r=1;
    for (int i=2; i <=n; i++)
      r = r*i;
    return r;
  }

  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("n?");
    int n = Integer.parseInt(s);
    double res = nfak(n);
    JOptionPane.showMessageDialog(null, "n! = " + res);
  }
}
