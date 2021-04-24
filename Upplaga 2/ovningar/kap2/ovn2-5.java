// Rekommenderat filnamn: Hej4.java

import java.util.*;
class Hej4 {
  public static void main (String[] arg) {
    // variabeldeklarationer
    String förnamn;
    String efternamn;
    String hälsning;
    // läs in förnamnet
    System.out.print("Förnamn? ");
    Scanner input = new Scanner(System.in);
    förnamn = input.nextLine();
    // läs in efternamnet
    System.out.print("Efternamn? ");
    efternamn = input.nextLine();
    // bilda en hälsningstext
    hälsning = "Välkommen " + förnamn + " " + efternamn;
    // skriv ut hälsningstexten
    System.out.println(hälsning);
  }
}
