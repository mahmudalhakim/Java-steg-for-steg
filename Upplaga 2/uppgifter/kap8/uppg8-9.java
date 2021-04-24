// Rekommenderat filnamn: Justera.java

import java.util.*;

class Justera {

  static String redigera(String s, int n) {
    if (s.length() > n)
      s = s.substring(s.length()-n);
    else 
      while (s.length()<n)
        s = ' ' + s;
    return s;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv en text: ");
    String s = scan.nextLine();
    System.out.print("Önskad textlängd? ");
    int n = scan.nextInt();
	 System.out.println("\"" + redigera(s, n) + "\"");
  }
}
