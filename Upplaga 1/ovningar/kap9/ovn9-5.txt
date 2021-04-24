// Filen Uttryck4.java

import javax.swing.*;

public class Uttryck4 {
  public static void main (String[] arg) {
    String tabell = "";
    for (double x=-1; x<=1; x=x+0.1) {
      double f = 2*x*x - 5*x + 1;
      tabell = tabell + String.format("%5.2f%8.2f\n", x, f);
    }      
    JOptionPane.showMessageDialog(null, tabell);
  }
}
