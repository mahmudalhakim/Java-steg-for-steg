// Filen Hej3.java

import javax.swing.*;

public class Hej3 {
  public static void main (String[] arg) {
    String f?rnamn;
    String efternamn;
    String h?lsning;
    f?rnamn = JOptionPane.showInputDialog("F?rnamn?");
    efternamn = JOptionPane.showInputDialog("Efternamn?");
    h?lsning = "V?lkommen " + f?rnamn + " " + efternamn;
    JOptionPane.showMessageDialog(null, h?lsning);
  }
}
