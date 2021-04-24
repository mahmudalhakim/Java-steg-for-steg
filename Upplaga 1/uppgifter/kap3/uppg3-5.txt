// Filen Halvering.java

import javax.swing.*;

public class Halvering {
  public static void main(String[] arg) {
    String indata = JOptionPane.showInputDialog("Antal år?");
    int t = Integer.parseInt(indata);
    double lambda = Math.log(2.0)/5730;
    double n0 = 100;  // 100 %
    double rest = n0 * Math.exp(-lambda*t);
    JOptionPane.showMessageDialog(null, "Det återstår " + rest + " %");
  }
}

