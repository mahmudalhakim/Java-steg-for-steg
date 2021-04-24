 // Rekommenderat filnamn: Sfar.java 
 
import java.util.*;

class Sfar {
   public static void main (String[] arg) {
     var scan = new Scanner(System.in);
     boolean försökIgen = true;  // minst ett försök måste göras
     System.out.print("Radie? ");
     double r = 0;               // måste alltid initieras
     while (försökIgen) {
       try {
         r = scan.nextDouble();  // försök läsa in
         if (r >= 0)
           försökIgen = false;     // det gick bra
         else {
           scan.nextLine();     // hoppa över den felaktiga raden
           System.out.print("Negativt tal\nRadie? ");
         }       
       }
       catch (InputMismatchException e) {  // felaktiga indata
         scan.nextLine();     // hoppa över den felaktiga raden
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


