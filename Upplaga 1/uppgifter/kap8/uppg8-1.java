// Filen TeckenKlass.java

import javax.swing.*;

public class TeckenKlass {

  public static int tecken(int tal) {
    if (tal>0)
      return 1;
    else if (tal==0)
      return 0;
    else
      return -1;
  }

  // Testprogram
  public static void main (String[] arg) {
    while (true) {
	  String s = JOptionPane.showInputDialog("Skriv ett tal");
	  if (s == null)
	    break;
      int n = Integer.parseInt(s);
      JOptionPane.showMessageDialog(null, "Talets tecken är " + tecken(n));
    }
  }
}
