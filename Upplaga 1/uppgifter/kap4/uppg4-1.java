// Filen Abonnemang.java

import javax.swing.*;

public class Abonnemang {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Antal minuter per m�nad?");
    int min = Integer.parseInt(s);
    if (min  <= 33)
      JOptionPane.showMessageDialog(null, "V�lj Kontant");
    else if (min > 33 && min  <= 66)
      JOptionPane.showMessageDialog(null, "V�lj Normal");
    else
      JOptionPane.showMessageDialog(null, "V�lj Plus");
  }
}
