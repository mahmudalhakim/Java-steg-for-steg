// Filen Blank.java

import javax.swing.*;

public class Blank {

  public static String blankaBort(String s) {
    String r = "";
    for (int i=0; i<s.length(); i++)
      if (s.charAt(i) != ' ')
        r = r + s.charAt(i);
    return r;
  }

  // Testprogram
  public static void main (String[] arg) {
    while (true) {
      String s = JOptionPane.showInputDialog("Skriv en text");
	  if (s == null)
	    break;
	  JOptionPane.showMessageDialog(null, blankaBort(s));
    }
  }
}
