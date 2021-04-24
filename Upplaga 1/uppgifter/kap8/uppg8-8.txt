// Filen Dag.java

import java.util.*;
import javax.swing.*;

public class Dag {

  public static String datum() {
    String s = Calendar.getInstance().getTime().toString();
    String d = s.substring(8, 10);
    String m = s.substring(4, 7);  // Månadens namn
    int i = s.lastIndexOf(' ');
    String å = s.substring(i+1);
    if (m.equals("Jan"))
      m = "01";
    else if (m.equals("Feb"))
      m = "02";
    else if (m.equals("Mar"))
      m = "03";
    else if (m.equals("Apr"))
      m = "04";
    else if (m.equals("Maj"))
      m = "05";
    else if (m.equals("Jun"))
      m = "06";
    else if (m.equals("Jul"))
      m = "07";
    else if (m.equals("Aug"))
      m = "08";
    else if (m.equals("Sep"))
      m = "09";
    else if (m.equals("Oct"))
      m = "10";
    else if (m.equals("Nov"))
      m = "11";
    else 
      m = "12";
    return å + '-' + m + '-' + d;
  }

  // Testprogram
  public static void main (String[] arg) {
    Simple.show("Dagens datum: " + datum());
    JOptionPane.showMessageDialog(null, "Dagens datum: " + datum());
  }
}
