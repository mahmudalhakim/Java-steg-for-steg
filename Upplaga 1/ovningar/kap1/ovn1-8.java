// Filen OsNamn.java

import javax.swing.*;

public class OsNamn {
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Du k�r " + 
                  System.getProperty("os.name") + " idag");
  }
}


