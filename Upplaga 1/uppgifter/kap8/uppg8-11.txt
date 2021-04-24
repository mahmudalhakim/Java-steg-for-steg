// Filen AnagramKlass.java

import javax.swing.*;

public class AnagramKlass {

  public static boolean ärAnagram(String s1, String s2) {
    s1 = Blank.blankaBort(s1);
    s2 = Blank.blankaBort(s2);
    if (s1.length() != s2.length())
      return false;
    for (int i=0; i<s1.length(); i++)
      if (antal(s1, s1.charAt(i)) != antal(s2, s1.charAt(i)))
        return false;
    return true;
  }

  // Följande metod är hämtad från avsnitt 7.8
  public static int antal (String s, char c) {
    int n = 0;
    for (int i=0; i<s.length(); i++) 
      if (s.charAt(i)== c)
        n++;
    return n;
  }

  // testprogram
  public static void main (String[] arg) {
    while (true) {
	  String a = JOptionPane.showInputDialog("Det första ordet?");
	  if (a == null)
	    break;
	  String b= JOptionPane.showInputDialog("Det andra ordet?");
	  if (b == null)
	    break;
      if (ärAnagram(a, b))
        JOptionPane.showMessageDialog(null, "Anagram");
      else 
        JOptionPane.showMessageDialog(null, "Inte anagram");	  
    }
  }
}
