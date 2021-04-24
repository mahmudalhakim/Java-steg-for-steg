// Filen Justera.java

import javax.swing.*;

public class Justera {

  public static String redigera(String s, int n) {
    if (s.length() > n)
      s = s.substring(s.length()-n);
    else 
      while (s.length()<n)
        s = ' ' + s;
    return s;
  }

  // Testprogram
  public static void main (String[] arg) {
    while (true) {
	  String s = JOptionPane.showInputDialog("Skriv en text");
	  if (s == null)
	    break;
	  String s2 = JOptionPane.showInputDialog("Önskad textlängd?");
	  if (s2 == null)
	    break;
      int n = Integer.parseInt(s2);
	  JOptionPane.showMessageDialog(null, "\"" + redigera(s, n) + "\"");
    }
  }
}
