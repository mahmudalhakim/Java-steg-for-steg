// L�gg metoden i klassen StringMetoder:

public class StringMetoder {

  public static int s�kF�rstaIckeBland (String s, String tecken, int start) {
    for (int i=start; i<s.length(); i++) 
      if (tecken.indexOf(s.charAt(i)) == -1)
        return i;
    return -1;
  }

  // Andra metoder
  // ...

}


// Metoden kan testas med f�ljande klass:

import javax.swing.*;
public class StringTest {
  public static void main (String[] arg) {
    String t = JOptionPane.showInputDialog("Skriv en text?");
    int i = StringMetoder.s�kF�rstaIckeBland(t, "0123456789", 0);
    JOptionPane.showMessageDialog(null,
           "F�rsta tecken som inte �r siffra p� plats nr " + i);
  }
}

