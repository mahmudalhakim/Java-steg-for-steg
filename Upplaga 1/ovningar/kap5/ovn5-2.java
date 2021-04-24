// Filen Harmonisk.java

import javax.swing.*;

public class Harmonisk {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Talet n?");
    int n = Integer.parseInt(s);
    double sum = 0;
    int i=1;
    while (i <= n) {
      sum = sum + 1.0/i;
      i= i + 1;
    }
    JOptionPane.showMessageDialog(null, "Serien blir = " + sum);
  }
}
