// Du kan lägga till följande i klassen MinMath

import javax.swing.*;

public class MinMath {

  public static int antalSiffror(int tal) {
    int i = 0;
    while (tal > 0) {
      tal = tal / 10;
      i++;
    }
    return i;
 }

 // Andra metoder
 // ...
           
}

// Denna metod kan testas med hjälp av följande klass:

import javax.swing.*;

public class siffTest {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Ett heltal? ");
    int i = Integer.parseInt(s);
    int k = MinMath.antalSiffror(i);
    JOptionPane.showMessageDialog(null, "Antal: " + k);
   }
}



