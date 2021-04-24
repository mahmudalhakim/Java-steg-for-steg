// Rekommenderat filnamn: Summa.java

import javax.swing.*;
class Summa {  // Beräkning av summan 1+2+3+ .. + n
  public static void main (String[] arg) {
    while (true) {
      var s = JOptionPane.showInputDialog("n?");
      if (s == null)
        break;       // användaren klickade på Avbryt
      int n = Integer.parseInt(s);
      int summa=0;
      int k=1;
      while (k <= n) {
        summa = summa + k;   // öka summa med k
        k = k + 1;           // öka k med 1
      }
      JOptionPane.showMessageDialog(null, "Summan blir " + summa);
    } // slut på den yttre while-satsen
    // hit kommer man när break exekveras
  }
}