// Rekommenderat filnamn: Summa.java

import javax.swing.*;
class Summa {  // Ber�kning av summan 1+2+3+ .. + n
  public static void main (String[] arg) {
    while (true) {
      var s = JOptionPane.showInputDialog("n?");
      if (s == null)
        break;       // anv�ndaren klickade p� Avbryt
      int n = Integer.parseInt(s);
      int summa=0;
      int k=1;
      while (k <= n) {
        summa = summa + k;   // �ka summa med k
        k = k + 1;           // �ka k med 1
      }
      JOptionPane.showMessageDialog(null, "Summan blir " + summa);
    } // slut p� den yttre while-satsen
    // hit kommer man n�r break exekveras
  }
}