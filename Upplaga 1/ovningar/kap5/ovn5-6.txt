// Filen Vitt.java

import javax.swing.*;

public class Vitt { 
  public static void main (String[] arg) {
    // Leta efter det sista vita tecknet i en text
    String s = JOptionPane.showInputDialog("Skriv en text?");
    int i;
    for (i=s.length()-1; i>=0; i=i-1)
      if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
        break;
    if (i >= 0)
      JOptionPane.showMessageDialog(null, 
              "Sista vita tecken finns på plats nr " + i);
    else
      JOptionPane.showMessageDialog(null, "Inga vita tecken");
  }
}
