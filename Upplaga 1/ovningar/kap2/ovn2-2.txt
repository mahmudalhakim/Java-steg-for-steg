// Filen Variabler2.java

import javax.swing.*;

public class Variabler2 {
  public static void main (String[] arg) {
    String namn = "Erik Andersson";
    String adress = "Lilla Gränd 4";
    String tel = "99999999";
    String allt = namn + "\n" + adress + "\n" + tel;
    JOptionPane.showMessageDialog(null, allt);
  }
}

