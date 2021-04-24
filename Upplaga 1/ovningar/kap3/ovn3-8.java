// Filen Tempteratur.java

import javax.swing.*;

public class Tempteratur {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Måndag?");
    double temp = Double.parseDouble(s);
    double maxtemp = temp;
    s = JOptionPane.showInputDialog("Tisdag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    s = JOptionPane.showInputDialog("Onsdag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    s = JOptionPane.showInputDialog("Torsdag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    s = JOptionPane.showInputDialog("Fredag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    s = JOptionPane.showInputDialog("Lördag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    s = JOptionPane.showInputDialog("Söndag?");
    temp = Double.parseDouble(s);
    maxtemp = Math.max(maxtemp, temp);
    JOptionPane.showMessageDialog(null, "Högsta temperatur: " + maxtemp);
  }
}
