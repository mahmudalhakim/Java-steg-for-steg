//Filen TaBortPersoner.java 
import java.io.*;
import javax.swing.*;

public class TaBortPersoner {
 public static void main(String[] arg) throws IOException{
    String filnamn = JOptionPane.showInputDialog
                          ("Vad heter filen med resultat?");
    while (true) { // ett varv för varje ny person
      // Läs in namn och poäng för den nya personen
      String bort = JOptionPane.showInputDialog("Person som skall tas bort?");
      if (bort == null)
         break; 
      boolean borttagen = false;   

      // Steg 1: Läs från resultatfilen och 
      //         skriv till den temporära filen
      BufferedReader inström = new BufferedReader
                              (new FileReader(filnamn));
      File f = File.createTempFile("fil", null);
      PrintWriter utström = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(f)));
      while (true) { // ett varv för varje person i filen
        String rad1 = inström.readLine();
        if (rad1 == null)  // Är resultatfilen slut?
          break;
        String rad2 = inström.readLine();
        if (rad1.equals(bort)) 
          borttagen = true;
        else {
          utström.println(rad1); 
          utström.println(rad2);
        }   
      }
      inström.close();   // stäng resultatfilen
      utström.close();   // stäng den temporära filen

      if (borttagen) {
        // Steg 2: Kopiera tillbaka till resultatfilen 
        inström = new BufferedReader
                 (new FileReader(f));
        utström = new PrintWriter
                 (new BufferedWriter
                 (new FileWriter(filnamn)));
        // Kopiera rad för rad
        while (true) {
          String rad = inström.readLine();
          if (rad == null) // Är den temporära filen slut?
            break; 
          utström.println(rad);   
        }
        inström.close();   // stäng den temporära filen
        utström.close();   // stäng resultatfilen
      }
      else
        JOptionPane.showMessageDialog(null, bort + " finns inte i filen");
    }
  }      
}
