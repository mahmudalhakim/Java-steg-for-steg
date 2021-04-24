// Filen SokText.java

import javax.swing.*;
import java.io.*;  

public class SokText { 
  public static void main(String[] arg) throws IOException {
    String namn1 = JOptionPane.showInputDialog("Vad heter den befintliga filen?");
    BufferedReader inström = new BufferedReader
                            (new FileReader(namn1));
    String namn2 = JOptionPane.showInputDialog("Vad skall den nya filen heta?");
    PrintWriter utström = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(namn2)));
    String txt = JOptionPane.showInputDialog("Vilken text söker du?");

    while(true) {
      String s = inström.readLine();
      if (s == null)
        break;
      if (s.indexOf(txt) >= 0)
        utström.println(s); 
    }
    inström.close();
    utström.close();
  }
}
  
