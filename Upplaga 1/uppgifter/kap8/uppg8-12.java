// Filen Vinst.java

import javax.swing.*;

public class Vinst {

  public static int antalÅr(double b, double r, double ut) {
    if (b * 0.01*r >= ut)
      return Integer.MAX_VALUE;
    else {
      int n = 0;
      while (true) {
        b = b + b*0.01*r-ut;
        if (b < 0)
          break;
        n++;
      }
      return n;
    }
  }

  // Testprogram
  public static void main (String[] arg) {
  	String s = JOptionPane.showInputDialog("Belopp?");
	if (s == null)
	    System.exit(0);
    double bel = Double.parseDouble(s);
	s = JOptionPane.showInputDialog("Räntesats?");
	if (s == null)
	    System.exit(0);;
    double r = Double.parseDouble(s);
    while (true) {
	  s = JOptionPane.showInputDialog("Årligt uttag?");
	  if (s == null)
	    break;
      double ut = Double.parseDouble(s);
      int tid = antalÅr(bel, r, ut);
      if (tid == Integer.MAX_VALUE)
        JOptionPane.showMessageDialog(null, "Pengarna räcker hur länge som helst");
      else        
        JOptionPane.showMessageDialog(null, "Uttag kan göras i " + tid + " år");
    }
  }
}

