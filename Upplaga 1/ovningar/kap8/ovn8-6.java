// Metoden visaInfo kan t.ex. l�ggas i klassen MinaMetoder:

import javax.swing.*;

public class MinaMetoder {

  public static void visaInfo() {
    JOptionPane.showMessageDialog(null, 
              "Operativsystem: " + System.getProperty("os.name") +
              "\nAnv�ndare: " + System.getProperty("user.name"));

  }

  // Andra metoder
  // ...
}

// Metoden kan testas med f�ljande klass:

public class VisaTest {
  public static void main (String[] arg) {
    MinaMetoder.visaInfo();
  }
}
