// Filen Kommentarer.java
import java.io.*;
import javax.swing.*;

public class Kommentarer {
 public static void main(String[] arg) throws IOException {
    String filnamn = JOptionPane.showInputDialog
                     ("Vad heter filen med Javaprogrammet?");
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(filnamn));
    int n = 0,    // totala antalet rader i filen
        k = 0;    // antalet rader med kommentarer
    while (true) {
      String rad = instr�m.readLine();
      if (rad == null)  // �r filen slut?
        break;   // ja!
      n++;   // nej
      if (rad.indexOf("//") >= 0)
        k++;   // kommentar finns p� raden
    }
    JOptionPane.showMessageDialog
       (null, 100.0*k/n + " % av raderna inneh�ller kommentarer");
  }       
}
