// Metoden läggs i klassen StringMetoder:

public class StringMetoder {

  public static boolean ärPalindrom(String s) {
    return s.equals(baklänges(s));
  } 

  // Andra metoder
  // ... 

}


// Metoden kan testas med följande klass:

import javax.swing.*;

public class PalTest {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Skriv en text?");
    if (StringMetoder.ärPalindrom(s))
       JOptionPane.showMessageDialog(null, "Palindrom");
    else
       JOptionPane.showMessageDialog(null, "Inte palindrom");
  }
}

