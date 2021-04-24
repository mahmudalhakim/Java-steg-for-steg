// Rekommenderat filnamn: Hej3.java

import java.util.*;
class Hej3 {
  public static void main (String[] arg) {
    String förnamn;
    String efternamn;
    String hälsning;
    System.out.print("Förnamn? ");
    Scanner input = new Scanner(System.in);
    förnamn = input.nextLine();
    System.out.print("Efternamn? ");
    efternamn = input.nextLine();
    hälsning = "Välkommen " + förnamn + " " + efternamn;
    System.out.println(hälsning);
  }
}
