// Filen Nastlade2.java

import javax.swing.*;

public class Nastlade2 {
  public static void main (String[] arg) {
    String s =JOptionPane.showInputDialog("Antal rader?");
    int n = Integer.parseInt(s);
    String txt = "";
    for (int i=n; i>0; i--) {
      for (int j=1; j<=i; j++)
        txt = txt + '+';
      txt = txt + '\n';
    }
    JOptionPane.showMessageDialog(null, txt);
  }
}
