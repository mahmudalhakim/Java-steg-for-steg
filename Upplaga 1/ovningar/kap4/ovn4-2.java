// Filen Gym.java

import javax.swing.*;

public class Gym {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Pris f�r �rskort?");
    double �rskort = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Pris f�r biljett?");
    double biljett = Double.parseDouble(s);
    s = JOptionPane.showInputDialog("Antal bes�k?");
    int antal = Integer.parseInt(s);
    if (�rskort < antal*biljett)
      JOptionPane.showMessageDialog(null, "�rskort �r billigast");
    else
      JOptionPane.showMessageDialog(null, "Biljetter �r billigast");
  }
}

