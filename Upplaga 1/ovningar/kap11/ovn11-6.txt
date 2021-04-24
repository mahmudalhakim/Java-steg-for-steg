// Filen Mobil1B.java
import javax.swing.*;

public class Mobil1B {

  // Den nya metoden medelv
  public static double medelv(double[] a) {
    double sum = 0;
    for (double x : a)
      sum = sum + x;
    return sum/a.length;
  }

  public static void main(String[] arg) {
   // Läs in fältstorlek och skapa fälten
    String s = JOptionPane.showInputDialog
               ("Hur många typer av kontantkort? ");
    int n = Integer.parseInt(s);
    String[] namn = new String[n];     // fält för namnen
    double[] pris = new double[n];     // fält för priser
    // Läs in namn och priser
    for (int i=0; i<n; i++) {
      namn[i] = JOptionPane.showInputDialog
                       ("Namn för kort nr " + (i+1) +"?");
      s = JOptionPane.showInputDialog
                       ("Pris/min för " + namn[i] + "?"); 
      pris[i] = Double.parseDouble(s);
    }
    // Beräkna det lägsta priset
    int billigast = 0;           // index för billigaste
    for (int i=1; i<n; i++) 
      if (pris[i] < pris[billigast]) 
        billigast = i; // nytt lägsta pris funnet
      JOptionPane.showMessageDialog
            (null, namn[billigast] + " är billigast.\n" +
            "Kostnad: " + pris[billigast] + " kr / minut");

    // Anropa den nya metoden  
    JOptionPane.showMessageDialog
            (null, "Medelvärde av priserna: " + medelv(pris));

  }
}
