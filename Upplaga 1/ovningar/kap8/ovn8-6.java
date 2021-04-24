// Metoden visaInfo kan t.ex. läggas i klassen MinaMetoder:

import javax.swing.*;

public class MinaMetoder {

  public static void visaInfo() {
    JOptionPane.showMessageDialog(null, 
              "Operativsystem: " + System.getProperty("os.name") +
              "\nAnvändare: " + System.getProperty("user.name"));

  }

  // Andra metoder
  // ...
}

// Metoden kan testas med följande klass:

public class VisaTest {
  public static void main (String[] arg) {
    MinaMetoder.visaInfo();
  }
}
