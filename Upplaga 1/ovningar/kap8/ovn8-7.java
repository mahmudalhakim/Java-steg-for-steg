// Metoden varning kan läggas i klassen MinaMetoder:

import javax.swing.*;

public class MinaMetoder {

  public static void varning(String meddelande) {
    plinga(3);  
    JOptionPane.showMessageDialog(null, meddelande);
  }

  public static void plinga(int n) {  // version 2
    for (int i=1; i<=n; i++) {
      Toolkit.getDefaultToolkit().beep();
      try {
        Thread.sleep(500);
      }
      catch (InterruptedException e) {}
    }
  }

  // Andra metoder
  // ...
}

// Test kan göras med följande klass:

public class VarningTest {
  public static void main (String[] arg) {
     MinaMetoder.varning("Slut");
  }
}



