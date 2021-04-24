// Lägg metoden i klassen StringMetoder:

public class StringMetoder {

  public static int sökFörstaIckeBland (String s, String tecken, int start) {
    for (int i=start; i<s.length(); i++) 
      if (tecken.indexOf(s.charAt(i)) == -1)
        return i;
    return -1;
  }

  // Andra metoder
  // ...

}


// Metoden kan testas med följande klass:

import javax.swing.*;
public class StringTest {
  public static void main (String[] arg) {
    String t = JOptionPane.showInputDialog("Skriv en text?");
    int i = StringMetoder.sökFörstaIckeBland(t, "0123456789", 0);
    JOptionPane.showMessageDialog(null,
           "Första tecken som inte är siffra på plats nr " + i);
  }
}

