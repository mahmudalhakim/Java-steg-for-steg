// Rekommenderat filnamn: Personnr.java

import java.util.*;

class Personnr {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Personnumer för den första personen? ");
    String s1= input.nextLine();
    System.out.print("Personnumer för den andra personen?  ");
    String s2 = input.nextLine();
    // plocka ut månad och dag
    s1 = s1.substring(2,6);
    s2 = s2.substring(2,6);
    if (s1.equals(s2))
      System.out.println("Samma födelsedag");
    else
      System.out.println("Olika födelsedag");
  }
}
