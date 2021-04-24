// Filen KvadSum.java

import javax.swing.*;

public class KvadSum {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Talet n?");
    int n = Integer.parseInt(s);
    int sum = 0;
    int i=1;
    while (i <= n) {
      sum = sum + i*i;
      i= i + 1;
    }
    JOptionPane.showMessageDialog(null, "Summan = " + sum);
  }
}
