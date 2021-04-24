// Rekommenderat filnamn: Namn.java

import java.util.*;
import java.text.*;

class Namn {
  public static void main (String[] arg) {
    Collator c = Collator.getInstance();
    c.setStrength(Collator.PRIMARY);
    var input = new Scanner(System.in);
    System.out.print("Ange efternamn, förnamn: ");
    String s1= input.nextLine();
    System.out.print("Ange efternamn, förnamn: ");
    String s2 = input.nextLine();
    if (c.compare(s1, s2) < 0)
      System.out.println(s1 + '\n' + s2);
    else
      System.out.println(s2 + '\n' + s1);
  }
}

