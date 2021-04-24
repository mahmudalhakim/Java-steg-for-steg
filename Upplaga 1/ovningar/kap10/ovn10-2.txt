// Filen Log.java 
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Log {
 public static void main(String[] arg) throws IOException {
    String filnamn = JOptionPane.showInputDialog
                     ("Vad heter loggfilen?");
    Scanner sc = new Scanner(new File(filnamn));
    
    int maxtid = 0;       // längsta tid hittills
    String maxNamn = "";  // namn på användaren
    while (sc.hasNext()) {
      String namn = sc.next();   // läs namnet
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
