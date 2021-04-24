// Filen Tecken1.java

import javax.swing.*; 

public class Tecken1 {
  public static void main (String[] arg) {
    char c1, c2;
    c1 = '\u00D8';
    c2 = Character.toLowerCase(c1);
    JOptionPane.showMessageDialog(null, "" + c1);
    JOptionPane.showMessageDialog(null, "" + c2);
  }
}
