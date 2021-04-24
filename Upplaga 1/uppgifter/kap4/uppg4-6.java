// Filen Triangel.java

import javax.swing.*;

public class Triangel {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("L�ngden f�r f�rsta sidan?");
    double a = Double.parseDouble(s);

    s = JOptionPane.showInputDialog("L�ngden f�r andra sidan?");
    double b = Double.parseDouble(s);

    s = JOptionPane.showInputDialog("Vinkeln mellan sidorna?");
    double v = Double.parseDouble(s);
    double gamma = v * 2 * 3.1415926536 / 360;  // omr�kning till radianer

    double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(gamma));
    double e = 1e-10;  // ett litet tal

    if (Math.abs(a-b) < e && Math.abs(a-c) < e && Math.abs(b-c) < e)
      JOptionPane.showMessageDialog(null, "Liksidig");
    else if (Math.abs(a-b) < e || Math.abs(a-c) < e || Math.abs(b-c) < e)
      JOptionPane.showMessageDialog(null, "Likbent");
    else
      JOptionPane.showMessageDialog(null, "Oliksidig");
  }
}
