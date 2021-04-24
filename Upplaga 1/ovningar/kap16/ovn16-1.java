// Filen ImportDemo3.java

import javax.swing.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;
import static java.lang.Double.*;

public class ImportDemo3 {
  public static void main(String[] arg) {
    String s = showInputDialog("Radien?");
    double r = parseDouble(s);
    double y = PI * r * r;
    showMessageDialog(null, "Arean är " + y); 
  }  
}
