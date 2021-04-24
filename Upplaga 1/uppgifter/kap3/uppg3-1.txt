 // Filen Sfar.java 

 import javax.swing.*;

 public class Sfar {
   public static void main (String[] arg) {
     String indata = JOptionPane.showInputDialog("Radie?");
     double r = Double.parseDouble(indata);
     double pi = 3.1415926536;
     double v = 4*pi*r*r*r/3;
     double a = 4*pi*r*r;
     JOptionPane.showMessageDialog(null, "Volym = " + v + "  Area = " + a);
   }
  }


