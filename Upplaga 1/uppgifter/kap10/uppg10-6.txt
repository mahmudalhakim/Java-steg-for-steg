// Filen SlumpNamn.java

import javax.swing.*;
import java.io.*;  

public class SlumpNamn { 
  public static void main(String[] arg) throws IOException {
    String filnamn = JOptionPane.showInputDialog("Vad heter filen med namn?");
    BufferedReader inström = new BufferedReader
                            (new FileReader(filnamn));
    String namn = "";
    int n = 0;
    while(true) {
      namn = inström.readLine();
      if (namn == null)
        break;
      n++;
    }
    inström.close();

    inström = new BufferedReader
             (new FileReader(filnamn)); 
    int k = (int) (Math.random() * n);  // 0 <= k < n
    for (int i=0; i <= k ; i++) 
      namn = inström.readLine();
    JOptionPane.showMessageDialog(null, namn);
    inström.close();
  }
}      
