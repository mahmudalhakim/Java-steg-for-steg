// Filen RektangelProg.java

import javax.swing.*;
import java.util.*;
public class RektangelProg {
  public static void main(String[] arg) {
    Rektangel r = new Rektangel();
    while (true) {
      String s = JOptionPane.showInputDialog
                 ("Ange rektangelns bredd och h�jd");
      if (s == null) 
        break;
      Scanner sc = new Scanner(s);
      r.s�ttBredd(sc.nextDouble());
      r.s�ttH�jd(sc.nextDouble());
      JOptionPane.showMessageDialog(null, String.format
            ("Rektangeln har arean %.3f " + "och omkretsen %.3f\n", 
             r.area(), r.omkr()));
    }
  }
}
