 // Rekommenderat filnamn: Sfar.java 
 
import java.util.*;

class Sfar {
   public static void main (String[] arg) {
     var scan = new Scanner(System.in);
     boolean f�rs�kIgen = true;  // minst ett f�rs�k m�ste g�ras
     System.out.print("Radie? ");
     double r = 0;               // m�ste alltid initieras
     while (f�rs�kIgen) {
       try {
         r = scan.nextDouble();  // f�rs�k l�sa in
         if (r >= 0)
           f�rs�kIgen = false;     // det gick bra
         else {
           scan.nextLine();     // hoppa �ver den felaktiga raden
           System.out.print("Negativt tal\nRadie? ");
         }       
       }
       catch (InputMismatchException e) {  // felaktiga indata
         scan.nextLine();     // hoppa �ver den felaktiga raden
         System.out.print("Felaktigt tal\nRadie? ");
       }
       catch (NoSuchElementException e) {  // end-of-file
        System.exit(0);
       }
     }
     double v = 4*Math.PI*r*r*r/3;
     double a = 4*Math.PI*r*r;
     System.out.println("Volym = " + v + "  Area = " + a);
   }
  }


