// Filen Mobil.java

import javax.swing.*;

public class Mobil {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Antal minuter per m�nad?");
    int min = Integer.parseInt(s);
    s = JOptionPane.showInputDialog("Pris per minut?");
    double minutpris = Double.parseDouble(s);
    double kostnad = min*minutpris;
    JOptionPane.showMessageDialog(null, "M�nadskostnad: " + kostnad);
  }
}
