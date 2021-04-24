// Rekommenderat filnamn: Kommentarer2.java 
import java.io.*;
import javax.swing.*;

class Kommentarer2 {
 public static void main(String[] arg) throws IOException {
    JFileChooser fc = new JFileChooser();
    int resultat = fc.showOpenDialog(null);
    if (resultat != JFileChooser.APPROVE_OPTION) 
      System.exit(0);  // ingen fil valdes
    String filnamn = fc.getSelectedFile().getAbsolutePath();
    BufferedReader inström = new BufferedReader
                            (new FileReader(filnamn));
    int n = 0,    // totala antalet rader i filen
        k = 0;    // antalet rader med kommentarer
    while (true) {
      String rad = inström.readLine();
      if (rad == null)  // är filen slut?
        break;   // ja!
      n++;   // nej
      if (rad.indexOf("//") >= 0)
        k++;   // kommentar finns på raden
    }
    JOptionPane.showMessageDialog
       (null, 100.0*k/n + " % av raderna innehåller kommentarer");
  }      
}
