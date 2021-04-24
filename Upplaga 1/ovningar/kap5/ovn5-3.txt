// Filen Studs.java

import javax.swing.*;

public class Studs {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Höjd?");
    double h = Double.parseDouble(s);
    int i=0;
    while (h > 0.01) {
      h = h * 0.7;
      i= i + 1;
    }
    JOptionPane.showMessageDialog(null, "Den studsar " + i + " gånger");
  }
}
