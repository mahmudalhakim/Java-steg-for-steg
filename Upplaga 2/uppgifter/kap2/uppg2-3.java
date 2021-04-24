// Filen Hej4.java

import java.util.*;

class Hej4 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
	 System.out.print("Ange Efternamn, Förnamn: ");
    String efternamn = input.next();
    efternamn = efternamn.substring(0, efternamn.length()-1);
    String förnamn = input.next();
    System.out.println("Hej " + förnamn.toUpperCase());
  }
}
