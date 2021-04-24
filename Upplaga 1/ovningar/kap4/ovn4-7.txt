// Filen Namn.java

import javax.swing.*;
import java.text.*;

public class Namn {
  public static void main (String[] arg) {
    Collator c = Collator.getInstance();
    c.setStrength(Collator.PRIMARY);
    String s1 = JOptionPane.showInputDialog("Ange efternamn, förnamn");
    String s2 = JOptionPane.showInputDialog("Ange efternamn, förnamn");
    if (c.compare(s1, s2) < 0)
      JOptionPane.showMessageDialog(null, s1 + '\n' + s2);
    else
      JOptionPane.showMessageDialog(null, s2 + '\n' + s1);
  }
}

