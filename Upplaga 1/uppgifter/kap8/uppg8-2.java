// Filen PrisKlass.java

import javax.swing.*;

public class PrisKlass {

  public static double pris(double exkl, double procent) {
     return exkl + exkl*procent/100;
  }

  // Testprogram
  public static void main (String[] arg) {
	while (true) {
	  String s = JOptionPane.showInputDialog("Pris exkl. moms?");
	  if (s == null)
	    break;
      double x = Double.parseDouble(s);
      JOptionPane.showMessageDialog(null, "Pris inkl. moms: " + pris(x, 25));
    }
  }
}
