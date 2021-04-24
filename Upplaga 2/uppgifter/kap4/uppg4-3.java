// Rekommenderat filnamn: Postnummer.java

import java.util.*;

class Postnummer {
  public static void main(String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Postnummer? ");
    String s = input.nextLine();
    String t = s.substring(0, 2);
    int nr = Integer.parseInt(t);
    if (nr>=20 && nr<=62 || nr==65 || nr==66)
      System.out.println("Götaland");
    else if (nr>=80)
      System.out.println("Norrland");
    else
      System.out.println("Svealand");
  }
}
