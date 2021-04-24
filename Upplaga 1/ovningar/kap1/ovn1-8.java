// Filen OsNamn.java

import javax.swing.*;

public class OsNamn {
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Du kör " + 
                  System.getProperty("os.name") + " idag");
  }
}


