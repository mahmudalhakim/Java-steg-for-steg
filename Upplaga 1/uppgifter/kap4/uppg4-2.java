// Filen Cirkel.java

import javax.swing.*;

public class Cirkel {
  public static void main (String[] arg) {
    String s;
    s = JOptionPane.showInputDialog("Radien?");
    double r = Double.parseDouble(s);
    if (r <= 0) {
      JOptionPane.showMessageDialog(null, "Felaktig radie");
      System.exit(0);
    }
    double omkr = 2 * 3.1415926536 * r;
    double area = 3.1415926536 * r * r;
    JOptionPane.showMessageDialog(null, 
                "Omkrets: " + omkr + "\nArea: " + area);
  }
}
