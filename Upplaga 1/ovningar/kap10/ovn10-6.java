// Filen Personer2.java 
import java.io.*;
import javax.swing.*;

public class Personer2 {
  public static void main(String[] arg) throws IOException {
    String aktuellMapp = System.getProperty("user.dir");
    JFileChooser fc = new JFileChooser(aktuellMapp);
    int resultat = fc.showSaveDialog(null);
    if (resultat != JFileChooser.APPROVE_OPTION) 
      System.exit(0);  // ingen fil valdes
    String filnamn = fc.getSelectedFile().getAbsolutePath();
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(filnamn, true)));
    while(true) {
      String namn = JOptionPane.showInputDialog
                     ("Skriv ett nytt namn?");
      if (namn == null)
        break;
      utström.println(namn);
    }       
    utström.close();
  }      
}

