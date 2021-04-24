// Filen CirkelMain.java

import javax.swing.*;

public class CirkelMain {
  public static void main (String[] arg) {
    String s;
    s = JOptionPane.showInputDialog("Radien?");
    double r = Double.parseDouble(s);
    double omkr = 2 * 3.1415926536 * r;
    double area = 3.1415926536 * r * r;
    JOptionPane.showMessageDialog(null, 
                "Omkrets: " + omkr + "\nArea: " + area);
  }
}
