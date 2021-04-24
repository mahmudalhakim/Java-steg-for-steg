// Rekommenderat filnamn: PolarTest.java
import java.util.*;

class PolarTest {

  public static Punkt tillPunkt(RPunkt pol) { 
    Punkt resultat = new Punkt();
    resultat.x = pol.r * Math.cos(pol.teta);
    resultat.y = pol.r * Math.sin(pol.teta);
    return resultat;
  }

  public static void main(String[] arg) {
    System.out.print("Ange polära koordinater: ");
    Scanner sc = new Scanner(System.in);
    RPunkt rp = new RPunkt();
    rp.r = sc.nextDouble();
    rp.teta = sc.nextDouble();
    Punkt p = tillPunkt(rp);
    System.out.println("Som rektangulära koordinater (" + 
                        p.x + ", " + p.y +")");     
  }
}

class RPunkt {
  double r;
  double teta;
}

class Punkt {
  double x;
  double y;
}


