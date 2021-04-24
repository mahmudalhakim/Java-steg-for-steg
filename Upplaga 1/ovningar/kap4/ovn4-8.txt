// Filen Personnr2.java

import javax.swing.*;

public class Personnr2 {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Personnumer (ååmmdd-nnnn)?");
    switch(s.charAt(9)) {
      case '0': case '2': case '4': case '6': case '8':
        JOptionPane.showMessageDialog(null, "Kvinna");
        break;
      case '1': case '3': case '5': case '7': case '9':
        JOptionPane.showMessageDialog(null, "Man");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Felaktigt personnummer");
    }
  }
}

