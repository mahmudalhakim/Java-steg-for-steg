// Rekommenderat filnamn: Hej4.java

import java.util.*;
class Hej4 {
  public static void main (String[] arg) {
    // variabeldeklarationer
    String f�rnamn;
    String efternamn;
    String h�lsning;
    // l�s in f�rnamnet
    System.out.print("F�rnamn? ");
    Scanner input = new Scanner(System.in);
    f�rnamn = input.nextLine();
    // l�s in efternamnet
    System.out.print("Efternamn? ");
    efternamn = input.nextLine();
    // bilda en h�lsningstext
    h�lsning = "V�lkommen " + f�rnamn + " " + efternamn;
    // skriv ut h�lsningstexten
    System.out.println(h�lsning);
  }
}
