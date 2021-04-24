// Filen Mening.java

import java.util.*;

class Mening {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println("Skriv en mening med minst två ord");
    String s = scan.nextLine();
    int l = s.length();
    s = s.trim();
    int i1 = s.indexOf(' ');       // efter första ordet
    int i2 = s.lastIndexOf(' ');   // före sista ordet
    System.out.println("Du skrev en text med " + l + " tecken" +
                      "\nDet första ordet var \"" + s.substring(0, i1) + '"' +
                      "\nDet sista ordet var \""  + s.substring(i2+1) + '"');            
  }
}
