// Filen Grattis.java

import javax.swing.*;
import java.util.*;

public class Grattis {
  public static void main(String[] arg) {
    String pnr = JOptionPane.showInputDialog("Ditt personnummer?");
    String m1 = pnr.substring(2,4);
    String d1 = pnr.substring(4, 6);
    String datum = Calendar.getInstance().getTime().toString();
    String d2 = datum.substring(8, 10);
    String m2 = datum.substring(4, 7);  // Månadens namn
    if (d1.equals(d2) && 
       (m1.equals("01") && m2.equals("Jan") ||
        m1.equals("02") && m2.equals("Feb") ||
        m1.equals("03") && m2.equals("Mar") ||
        m1.equals("04") && m2.equals("Apr") ||
        m1.equals("05") && m2.equals("Maj") ||
        m1.equals("06") && m2.equals("Jun") ||
        m1.equals("07") && m2.equals("Jul") ||
        m1.equals("08") && m2.equals("Aug") ||
        m1.equals("09") && m2.equals("Sep") ||
        m1.equals("10") && m2.equals("Oct") ||
        m1.equals("11") && m2.equals("Nov") ||
        m1.equals("12") && m2.equals("Dec")))
      JOptionPane.showMessageDialog(null, "Grattis");
  }
}
