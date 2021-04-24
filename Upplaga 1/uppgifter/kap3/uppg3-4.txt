// Filen Avstand.java

import javax.swing.*;

public class Avstand {
  public static void main(String[] arg) {
    String indata = JOptionPane.showInputDialog("x1?");
    double x1 = Double.parseDouble(indata);
    indata = JOptionPane.showInputDialog("y1?");
    double y1 = Double.parseDouble(indata);
    indata = JOptionPane.showInputDialog("x2?");
    double x2 = Double.parseDouble(indata);
    indata = JOptionPane.showInputDialog("y2?");
    double y2 = Double.parseDouble(indata);
    double avst = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    JOptionPane.showMessageDialog(null, "Avstånd " + avst);
  }
}
            
