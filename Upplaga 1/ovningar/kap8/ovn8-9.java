// Metoden l�ggs i klassen StringMetoder:

public class StringMetoder {

  public static boolean �rPalindrom(String s) {
    return s.equals(bakl�nges(s));
  } 

  // Andra metoder
  // ... 

}


// Metoden kan testas med f�ljande klass:

import javax.swing.*;

public class PalTest {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Skriv en text?");
    if (StringMetoder.�rPalindrom(s))
       JOptionPane.showMessageDialog(null, "Palindrom");
    else
       JOptionPane.showMessageDialog(null, "Inte palindrom");
  }
}

