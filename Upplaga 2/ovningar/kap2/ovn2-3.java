// Rekommenderat filnamn: Hej3.java

import java.util.*;
class Hej3 {
  public static void main (String[] arg) {
    String f�rnamn;
    String efternamn;
    String h�lsning;
    System.out.print("F�rnamn? ");
    Scanner input = new Scanner(System.in);
    f�rnamn = input.nextLine();
    System.out.print("Efternamn? ");
    efternamn = input.nextLine();
    h�lsning = "V�lkommen " + f�rnamn + " " + efternamn;
    System.out.println(h�lsning);
  }
}
