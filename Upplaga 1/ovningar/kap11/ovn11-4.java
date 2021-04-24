// Filen Mobil2B.java

import javax.swing.*;

public class Mobil2B {
  public static void main(String[] arg) {
    String[] namn = new String[100];         // fält för namnen
    int billigast = 0;                       // index för billigaste
    double lägstPris = Double.MAX_VALUE;     // eller ett annat stort värde
    // Läs in namn och priser
    int n = 0;    // räknare för antal typer av kort
    while (true) {
      namn[n] = JOptionPane.showInputDialog
                        ("Namn för kort nr " + (n+1) +"?");
      if (namn[n] == null)
         break;
      String s = JOptionPane.showInputDialog
                        ("Pris/min för " + namn[n] + "?"); 
      if (s == null)
         break;
      double pris = Double.parseDouble(s);
      if (pris < lägstPris) {
        lägstPris = pris;
        billigast = n;
      }
      n++;     // öka antalet typer av kort med 1
    }
    JOptionPane.showMessageDialog
            (null, namn[billigast] + " är billigast.\n" +
             "Det kostar " + lägstPris + " / minut");
  }
}
