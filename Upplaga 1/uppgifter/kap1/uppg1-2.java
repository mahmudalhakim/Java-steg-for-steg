// Filen Diloger.java

import javax.swing.*;

public class Diloger {
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Detta �r ett informationsmeddelande",  
                      "Information", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Detta �r ett varningsmeddelande",  
                      "Varning", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "Detta �r ett felmeddelande",  
                      "Fel", JOptionPane.ERROR_MESSAGE);
  }
}
