// Filen Temperatur.java

import javax.swing.*;

public class Temperatur {
  public static void main(String[] arg) {
    String indata = JOptionPane.showInputDialog("Temperatur i Fahrenheit?");
    double f = Double.parseDouble(indata);
    double c = (f-32)*5/9;
    JOptionPane.showMessageDialog(null, "Motsvarar " + c + " grader C");
  }
}
            
