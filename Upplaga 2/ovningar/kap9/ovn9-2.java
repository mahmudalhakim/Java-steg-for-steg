// Rekommenderat filnamn: Summa.java

import javax.swing.*;
import java.util.*;

class Summa {
  public static void main (String[] arg) {
    var s = JOptionPane.showInputDialog("Ange talen som ska summeras");
    // Skapa en scanner som läser från variabeln s
    var scan = new Scanner(s);
    double sum = 0;       // summan av talen
    while (scan.hasNextDouble()) {   // finns det fler tal?
      double d = scan.nextDouble();  // ja, läs nästa tal
      sum += d;
    }
    JOptionPane.showMessageDialog(null, "Summan är " + sum);
  }
}