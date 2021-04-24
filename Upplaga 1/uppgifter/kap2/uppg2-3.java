// Filen Mening.java

import javax.swing.*;

public class Mening {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Skriv en mening med minst två ord");
    int l = s.length();
    s = s.trim();
    int i1 = s.indexOf(' ');       // efter första ordet
    int i2 = s.lastIndexOf(' ');   // före sista ordet
    JOptionPane.showMessageDialog(null, 
          "Du skrev en text med " + l + " tecken" +
          "\nDet första ordet var \"" + s.substring(0, i1) + '"' +
          "\nDet sista ordet var \""  + s.substring(i2+1) + '"');            
  }
}
