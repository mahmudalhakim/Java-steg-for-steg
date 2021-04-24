// Filen Variabler.java

import javax.swing.*;

public class Variabler {
  public static void main (String[] arg) {
    String namn, adress, tel, allt;
    namn = "Erik Andersson";
    adress = "Lilla Gränd 4";
    tel = "99999999";
    allt = namn + "\n" + adress + "\n" + tel;
    JOptionPane.showMessageDialog(null, allt);
  }
}


