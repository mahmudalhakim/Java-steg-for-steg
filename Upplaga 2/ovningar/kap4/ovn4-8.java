// Rekommenderat filnamn: Personnr.java

import java.util.*;

class Personnr {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Personnumer f�r den f�rsta personen? ");
    String s1= input.nextLine();
    System.out.print("Personnumer f�r den andra personen?  ");
    String s2 = input.nextLine();
    // plocka ut m�nad och dag
    s1 = s1.substring(2,6);
    s2 = s2.substring(2,6);
    if (s1.equals(s2))
      System.out.println("Samma f�delsedag");
    else
      System.out.println("Olika f�delsedag");
  }
}
