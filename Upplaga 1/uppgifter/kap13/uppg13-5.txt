// Filen RPunkt.java

public class RPunkt {
  double r;
  double teta;
}

// Filen PolarTest.java
import javax.swing.*;
import java.util.*;

public class PolarTest {

  public static Punkt tillPunkt(RPunkt pol) { 
    Punkt resultat = new Punkt();
    resultat.x = pol.r * Math.cos(pol.teta);
    resultat.y = pol.r * Math.sin(pol.teta);
    return resultat;
  }

  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Ange polära koordinater");
    Scanner sc = new Scanner(s);
    RPunkt rp = new RPunkt();
    rp.r = sc.nextDouble();
    rp.teta = sc.nextDouble();
    Punkt p = tillPunkt(rp);
    JOptionPane.showMessageDialog(null, "Som rektangulära koordinater (" + 
                                         p.x + ", " + p.y +")");     
  }
}


