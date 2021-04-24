// Filen Mult.java

import javax.swing.*;

public class Mult {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Antal rader?");
    int n = Integer.parseInt(s);
    String tabell = "";
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++)
        tabell = tabell + i*j + "  ";
      tabell = tabell + "\n";
    }     
    JOptionPane.showMessageDialog(null, tabell);
  }
}
