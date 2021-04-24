// Rekommenderat filnamn: Blank.java

import java.util.*;

class Blank {

  static String blankaBort(String s) {
    String r = "";
    for (int i=0; i<s.length(); i++)
      if (s.charAt(i) != ' ')
        r = r + s.charAt(i);
    return r;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv en text: ");
    String s = scan.nextLine();
    System.out.println(blankaBort(s));
  }
}
