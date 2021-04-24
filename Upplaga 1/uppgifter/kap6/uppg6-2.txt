// Filen Euclides.java

import javax.swing.*;

public class Euclides {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Första talet?"); 
    int m = Integer.parseInt(s);
    s = JOptionPane.showInputDialog("Andra talet?"); 
    int n = Integer.parseInt(s);
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    JOptionPane.showMessageDialog(null, "Minsta gemensamma nämnare är " + n);
  }
}

