// Filen Betyg.java

import javax.swing.*;

public class Betyg {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Po�ng?");
    int po�ng = Integer.parseInt(s);
    if (po�ng >= 45)
      JOptionPane.showMessageDialog(null, "Betyg: A");
	else if (po�ng >= 40)
      JOptionPane.showMessageDialog(null, "Betyg: B");
    else if (po�ng >= 35)
      JOptionPane.showMessageDialog(null, "Betyg: C");
	else if (po�ng >= 30)
      JOptionPane.showMessageDialog(null, "Betyg: D")
    else if (po�ng >= 25)
      JOptionPane.showMessageDialog(null, "Betyg: E");
    else
      JOptionPane.showMessageDialog(null, "Betyg: F");
  }
}
