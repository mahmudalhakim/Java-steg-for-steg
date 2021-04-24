// Filen Betyg.java

import javax.swing.*;

public class Betyg {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Poäng?");
    int poäng = Integer.parseInt(s);
    if (poäng >= 45)
      JOptionPane.showMessageDialog(null, "Betyg: A");
	else if (poäng >= 40)
      JOptionPane.showMessageDialog(null, "Betyg: B");
    else if (poäng >= 35)
      JOptionPane.showMessageDialog(null, "Betyg: C");
	else if (poäng >= 30)
      JOptionPane.showMessageDialog(null, "Betyg: D")
    else if (poäng >= 25)
      JOptionPane.showMessageDialog(null, "Betyg: E");
    else
      JOptionPane.showMessageDialog(null, "Betyg: F");
  }
}
