// Filen Persontest.java

import javax.swing.*;

public class Persontest {
  public static void main(String[] arg) {
    int kön = JOptionPane.showConfirmDialog(null, "Är du en kille?",
                                "Fråga", JOptionPane.YES_NO_OPTION);
    String s = JOptionPane.showInputDialog("Ditt personnummer?");
    String t = s.substring(s.length()-2, s.length()-1);  // näst sista siffran
    int nr = Integer.parseInt(t);
    if (kön == 0 && nr%2 == 1 || kön==1 && nr%2 == 0)
      JOptionPane.showMessageDialog(null, "Stämmer");
    else 
      JOptionPane.showMessageDialog(null, "Stämmer inte");
  }
}
