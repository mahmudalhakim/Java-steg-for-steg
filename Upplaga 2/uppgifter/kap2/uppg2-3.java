// Filen Hej4.java

import java.util.*;

class Hej4 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
	 System.out.print("Ange Efternamn, F�rnamn: ");
    String efternamn = input.next();
    efternamn = efternamn.substring(0, efternamn.length()-1);
    String f�rnamn = input.next();
    System.out.println("Hej " + f�rnamn.toUpperCase());
  }
}
