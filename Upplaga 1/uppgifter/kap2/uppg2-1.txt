// Filen Tid.java

import javax.swing.*;
import java.util.*;

public class Tid {
  public static void main (String[] arg) {
    String d =  Calendar.getInstance().getTime().toString();
    int i = d.indexOf(':');    // index för första ':'
    JOptionPane.showMessageDialog(null, "Klockan är: " + d.substring(i-2, i+6));             
  }
}
