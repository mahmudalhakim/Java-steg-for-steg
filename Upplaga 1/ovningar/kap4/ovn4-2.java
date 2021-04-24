// Filen Gym.java

import javax.swing.*;

public class Gym {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Pris för årskort?");
    double årskort = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Pris för biljett?");
    double biljett = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Antal besök?");
    int antal = Integer.parseInt(s);
    if (årskort < antal*biljett)
      JOptionPane.showMessageDialog(null, "Årskort är billigast");
    else
      JOptionPane.showMessageDialog(null, "Biljetter är billigast");
  }
}

