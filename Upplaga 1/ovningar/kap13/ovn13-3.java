// Filen BilTest3.java

import javax.swing.*;

public class BilTest3 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Citroen XSara Picasso";
    b1.årsmodell = 2003;
    b1.tjänstevikt = 1360;
    b1.effekt = 115;
    b2.regNr = "XYZ001";
    b2.fabrikat = "Renault Espace";
    b2.årsmodell = 2004;
    b2.tjänstevikt = 1760;
    b2.effekt = 120;
    JOptionPane.showMessageDialog(null, b1.regNr + "\n" + b1.fabrikat + 
                                        " " + b1.årsmodell + 
                                        "\ntjänstevikt: " + b1.tjänstevikt + 
                                        "\nmotoreffekt: " + b1.effekt);
    JOptionPane.showMessageDialog(null, b2.regNr + "\n" + b2.fabrikat + 
                                        " " + b2.årsmodell + 
                                        "\ntjänstevikt: " + b2.tjänstevikt + 
                                        "\nmotoreffekt: " + b2.effekt);
  }
}
