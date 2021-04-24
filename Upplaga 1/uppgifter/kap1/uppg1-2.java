// Filen Diloger.java

import javax.swing.*;

public class Diloger {
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Detta är ett informationsmeddelande",  
                      "Information", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Detta är ett varningsmeddelande",  
                      "Varning", JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, "Detta är ett felmeddelande",  
                      "Fel", JOptionPane.ERROR_MESSAGE);
  }
}
