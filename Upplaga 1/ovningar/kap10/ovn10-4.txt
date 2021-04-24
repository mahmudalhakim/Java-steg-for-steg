// Filen Personer.java 
import java.io.*;
import javax.swing.*;

public class Personer {
  public static void main(String[] arg) throws IOException {
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter("personer.txt", true)));
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

