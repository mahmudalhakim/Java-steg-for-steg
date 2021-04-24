// Filen Prim.java

import javax.swing.*;

public class Prim {

  public static boolean ärEttPrimtal(int talet) {
    for (int k = 2; k<talet; k++)
      if (talet % k == 0)
        return false;
    return true;
  }

  // Testprogram
  public static void main (String[] arg) {
	while (true) {
	  String s = JOptionPane.showInputDialog("Skriv ett tal");
	  if (s == null)
	    break;
      int n = Integer.parseInt(s);
	  if (ärEttPrimtal(n))
	    JOptionPane.showMessageDialog(null, "Primtal");
	  else 
	    JOptionPane.showMessageDialog(null, "Inte primtal");
    }

  }
}
