// Filen Tab.java

import javax.swing.*;

public class Tab {
  public static void main (String[] arg) {
    String tabell = "";
    for (int i=1; i<=12; i++)
      tabell = tabell + i + "   " + i*i + "   " + i*i*i + "\n";     
    JOptionPane.showMessageDialog(null, tabell);
  }
}
