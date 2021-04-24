// Rekommenderat filnamn: Bak.java

import java.util.*;

class Bak {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println("Skriv en text");
    String s = scan.nextLine();
    String r = "";
    for (int i=s.length()-1; i>=0; i--)
      System.out.print(s.charAt(i));
  }
}
