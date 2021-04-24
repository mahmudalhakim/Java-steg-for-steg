// Rekommenderat filnamn: Palindrom.java

import java.util.*;

class Palindrom {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv en text? ");
    String s = scan.nextLine();
    int i, j;
    for (i=0, j=s.length()-1; i<j && s.charAt(i)==s.charAt(j); i++, j--)
      ;    // en tom sats
    if (i>=j)
      System.out.println("Palindrom");
    else
      System.out.println("Inte palindrom");
  }
}
