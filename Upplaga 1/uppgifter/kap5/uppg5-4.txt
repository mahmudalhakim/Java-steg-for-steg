// Filen Bak.java

import javax.swing.*;

public class Bak {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Skriv en text");
    String r = "";
    for (int i=s.length()-1; i>=0; i--)
      r = r + s.charAt(i);
    JOptionPane.showMessageDialog(null, r);
  }
}
