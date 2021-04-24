// Rekommenderat filnamn: Mening2.java

import java.util.*;

class Mening2 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.println("Skriv en mening med minst två ord");
    String s = input.nextLine();
    int l = s.length();
    s = s.trim();
    int i1 = s.indexOf(' ');       // efter första ordet
    if (i1 > 0) { 
      // OK, minst ett blankt tecken finns
      int i2 = s.lastIndexOf(' ');   // före sista ordet
      System.out.println("Du skrev en text med " + l + " tecken" +
                        "\nDet första ordet var \"" + s.substring(0, i1) + '"' +
                        "\nDet sista ordet var \""  + s.substring(i2+1) + '"');
    }
    else
      System.out.println("Du måste skriva minst två ord");                 
  }
}
