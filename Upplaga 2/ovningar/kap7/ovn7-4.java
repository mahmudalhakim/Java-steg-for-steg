// Rekommenderat filnamn: Harmonisk.java

import javax.swing.*;

class Harmonisk {
  public static void main (String[] arg) {
    boolean f�rs�kIgen = true;
    int n = 0;
    String s = JOptionPane.showInputDialog("Talet n?");
    while (f�rs�kIgen) {
      if (s == null)
        System.exit(0);
        try {       
          n = Integer.parseInt(s);
          f�rs�kIgen = false;
        }
        catch (NumberFormatException e) {
          s = JOptionPane.showInputDialog("Felaktigt tal\nTalet n?");
        }
    }        
    double sum = 0;
    int i=1;
    while (i <= n) {
      sum = sum + 1.0/i;
      i= i + 1;
    }
    JOptionPane.showMessageDialog(null, "Serien blir = " + sum);
  }
}
