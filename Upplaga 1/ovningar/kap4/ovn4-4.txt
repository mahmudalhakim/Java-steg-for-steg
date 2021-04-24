// Filen Paket.java

import javax.swing.*;

public class Paket {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Längd (mm)?");
    int l = Integer.parseInt(s);
    s = JOptionPane.showInputDialog("Bredd (mm)?");
    int b = Integer.parseInt(s);
    s = JOptionPane.showInputDialog("Tjocklek (mm)?");
    int t = Integer.parseInt(s);

    if (l >= 140 && l <= 600 && b >= 90 && t <= 100 && b+l+t <= 900)
      JOptionPane.showMessageDialog(null, "Måtten OK");
    else 
      JOptionPane.showMessageDialog(null, "Felaktiga mått");
  }
}
