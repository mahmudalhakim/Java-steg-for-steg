// Rekommenderat filnamn: Mobil3.java

import javax.swing.*;

class Mobil3 {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Antal minuter?");
    int min = Integer.parseInt(s);
    int svar = JOptionPane.showConfirmDialog(null, "Dagtid?");
    if (svar == 0)
      JOptionPane.showMessageDialog(null, "Kostnad: " + (0.6+min*2.50));
    else if (svar == 1)
      JOptionPane.showMessageDialog(null, "Kostnad: " + (0.6+min*0.55));
  }
}

