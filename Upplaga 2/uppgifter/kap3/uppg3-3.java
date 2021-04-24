 // Rekommenderat filnamn:  Gallon.java

import java.util.*;

class Gallon {
   public static void main (String[] arg) {
     var scan = new Scanner(System.in);
     System.out.print("Miles per gallon? ");
     double milesPerGallon = scan.nextDouble();
     double literPerMil = 3.785/milesPerGallon/1.609*10;
     System.out.println(literPerMil + " l/mil");
   }
}

