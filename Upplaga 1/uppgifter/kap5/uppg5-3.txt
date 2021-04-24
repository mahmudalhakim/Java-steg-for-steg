// Filen Rik.java

import javax.swing.*;

public class Rik {
  public static void main (String[] arg) {
    int antalDagar = 1;
    double dagensLön = 0.01;
    double totaltBelopp = 0.01; 
    while (totaltBelopp < 10000000) {
      antalDagar++;
      dagensLön = dagensLön * 2;
      totaltBelopp = totaltBelopp + dagensLön;
    }      
    JOptionPane.showMessageDialog(null, "Du måste arbeta " + antalDagar + " dagar");
  }
}
