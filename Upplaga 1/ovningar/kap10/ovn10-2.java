// Filen Log.java 
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Log {
 public static void main(String[] arg) throws IOException {
    String filnamn = JOptionPane.showInputDialog
                     ("Vad heter loggfilen?");
    Scanner sc = new Scanner(new File(filnamn));
    
    int maxtid = 0;       // l�ngsta tid hittills
    String maxNamn = "";  // namn p� anv�ndaren
    while (sc.hasNext()) {
      String namn = sc.next();   // l�s namnet
      int tottid = 0;
      while (sc.hasNextInt())
        tottid = tottid + sc.nextInt();   // addera tiderna
      if (tottid > maxtid) {
        maxtid = tottid;
        maxNamn = namn;
      }  
    }
    JOptionPane.showMessageDialog
       (null, maxNamn + " har varit inloggad " + maxtid + " minuter");
  }      
}
