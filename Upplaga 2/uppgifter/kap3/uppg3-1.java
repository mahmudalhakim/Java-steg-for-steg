 // Rekommenderat filnamn: Sfar.java 
 
import java.util.*;

class Sfar {
   public static void main (String[] arg) {
     var scan = new Scanner(System.in);
     System.out.print("Radie? ");
     double r = scan.nextDouble();
     double v = 4*Math.PI*r*r*r/3;
     double a = 4*Math.PI*r*r;
     System.out.println("Volym = " + v + "  Area = " + a);
   }
  }


