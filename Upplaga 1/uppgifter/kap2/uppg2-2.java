// Filen Hej3.java

import javax.swing.*;

public class Hej3 {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Ange Efternamn, F�rnamn");
    s = s.trim();
    int i = s.lastIndexOf(',');
    String f�rnamn = s.substring(i+1);
    JOptionPane.showMessageDialog(null, "Hej " + f�rnamn.toUpperCase());
  }
}
