// Filen Skott2

import javax.swing.*;

public class Skott2 {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog(
                                       "Skriv ett årtal");
    int år = Integer.parseInt(s);
    if (Kalender.ärSkottår(år))
      JOptionPane.showMessageDialog(null, "Skottår");
    else
      JOptionPane.showMessageDialog(null, "Inte skottår");
  }
}

class Kalender {
  public static boolean ärSkottår(int n) {
    return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
  }
}
