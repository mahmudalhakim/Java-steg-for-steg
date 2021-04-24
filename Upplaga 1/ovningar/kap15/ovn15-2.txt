// Filen RektangelProg.java

import javax.swing.*;
import java.util.*;
public class RektangelProg {
  public static void main(String[] arg) {
    Rektangel r = new Rektangel();
    while (true) {
      String s = JOptionPane.showInputDialog
                 ("Ange rektangelns bredd och höjd");
      if (s == null) 
        break;
      Scanner sc = new Scanner(s);
      r.sättBredd(sc.nextDouble());
      r.sättHöjd(sc.nextDouble());
      JOptionPane.showMessageDialog(null, String.format
            ("Rektangeln har arean %.3f " + "och omkretsen %.3f\n", 
             r.area(), r.omkr()));
    }
  }
}
