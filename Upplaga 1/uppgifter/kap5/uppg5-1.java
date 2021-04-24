// Filen MinMax.java

import javax.swing.*;

public class MinMax {
  public static void main (String[] arg) {
    double st�rsta = -1.7e308;   // eller Double.MIN_VALUE
    double minsta  =  1.7e308;   // eller Double.MAX_VALUE 

    while (true) {
      String s = JOptionPane.showInputDialog("Skriv ett tal");
      if (s == null)
        break;
      double tal = Double.parseDouble(s);
      st�rsta = Math.max(st�rsta, tal);
      minsta  = Math.min(minsta, tal);
    }
    JOptionPane.showMessageDialog(null, "Minsta: " + minsta + 
                                       "\nSt�rsta: " + st�rsta);
  }
}
