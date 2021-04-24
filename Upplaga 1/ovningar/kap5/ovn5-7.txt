// Filen Uttryck1

import javax.swing.*;

public class Uttryck1 {
  public static void main (String[] arg) {
    String tabell = "";
    for (int x=-10; x<=10; x=x+1) {
      int f = 2*x*x - 5*x + 1;
      tabell = tabell + x + "   " + f + "\n";
    }      
    JOptionPane.showMessageDialog(null, tabell);
  }
}
