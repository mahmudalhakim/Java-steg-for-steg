// Filen BilTest3.java

import javax.swing.*;

public class BilTest3 {
  public static void main(String[] arg) {
    // Lägg till följande kod
    Bil[] a = new Bil[3];
    for (int i=0; i<a.length; i++)
      a[i] = new Bil();
    a[0].regNr = "ZZZ999";
    a[0].fabrikat = "Ford";
    a[0].årsmodell = 2011;
    a[0].tjänstevikt = 1400;
    a[0].effekt = 109;
    a[1].regNr = "PKA792";
    a[1].fabrikat = "Volvo";
    a[1].årsmodell = 2008;
    a[1].tjänstevikt = 1600;
    a[1].effekt = 100;
    a[2].regNr = "JAV002";
    a[2].fabrikat = "BMW";
    a[2].årsmodell = 2012;
    a[2].tjänstevikt = 1400;
    a[2].effekt = 120;
    for (int i=0; i<a.length; i++) 
      JOptionPane.showMessageDialog(null, a[i].regNr + "\n" + a[i].fabrikat + 
                                        " " + a[i].årsmodell + 
                                        "\ntjänstevikt: " + a[i].tjänstevikt + 
                                        "\nmotoreffekt: " + a[i].effekt);
  }
}
