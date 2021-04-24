// Filen Primtal2.java

import javax.swing.*;
public class Primtal2 {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Ange talet n?");
    int n = Integer.parseInt(s);
    String r = "";
    int antal = 0;   // antalet funna primtal
    for (int talet=1; talet<=n; talet++) {
      // Undersök om talet är ett primtal
      boolean ärPrimtal = true;
      for (int k = 2; k<talet; k++)
        if (talet % k == 0)
          ärPrimtal = false;
      if (ärPrimtal) {
        antal++;
        r = r + " " + talet;
        if (antal % 30 == 0)  // visa 30 tal per rad
          r = r + '\n';
      }
    }
    // Visa primtalen
    JOptionPane.showMessageDialog(null, r);
  }
}
