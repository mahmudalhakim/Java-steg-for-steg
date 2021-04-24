// Rekommenderat filnamn: VarningTest.java

// Test kan g�ras med f�ljande klass:
import java.awt.*;

class VarningTest {
  public static void main (String[] arg) {
     MinaMetoder.varning("Slut");
  }
}

// Metoden varning kan l�ggas i klassen MinaMetoder:

class MinaMetoder {

  static void varning(String meddelande) {
    plinga(3);  
    System.out.println(meddelande);
  }

  static void plinga(int n) {  // version 2
    for (int i=1; i<=n; i++) {
      Toolkit.getDefaultToolkit().beep();
      try {
        Thread.sleep(500);
      }
      catch (InterruptedException e) {}
    }
  }
}




