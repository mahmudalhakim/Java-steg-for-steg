// Filen Mening.java

import java.util.*;

class Mening {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println("Skriv en mening med minst tv� ord");
    String s = scan.nextLine();
    int l = s.length();
    s = s.trim();
    int i1 = s.indexOf(' ');       // efter f�rsta ordet
    int i2 = s.lastIndexOf(' ');   // f�re sista ordet
    System.out.println("Du skrev en text med " + l + " tecken" +
                      "\nDet f�rsta ordet var \"" + s.substring(0, i1) + '"' +
                      "\nDet sista ordet var \""  + s.substring(i2+1) + '"');            
  }
}
