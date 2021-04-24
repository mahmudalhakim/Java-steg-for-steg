// Filen Mobil2.java

import javax.swing.*;

public class Mobil2 {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Antal minuter per månad?");
    int min = Integer.parseInt(s);
    s = JOptionPane.showInputDialog("Pris per minut?");
    double minutpris = Double.parseDouble(s);
    double kostnad = min*minutpris;
    if (kostnad >= 1000)
      kostnad = kostnad - kostnad * 0.10;
    JOptionPane.showMessageDialog(null, "Månadskostnad: " + kostnad);
  }
}

