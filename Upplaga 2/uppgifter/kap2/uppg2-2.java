// Filen Hej3.java

import java.util.*;

class Hej3 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
	 System.out.print("Ange Efternamn, F�rnamn: ");
    String s = input.nextLine();
    s = s.trim();
    int i = s.lastIndexOf(',');
    String f�rnamn = s.substring(i+1);
    System.out.println("Hej " + f�rnamn.toUpperCase());
  }
}
