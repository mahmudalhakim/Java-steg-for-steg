// Rekommenderat filnamn: Betyg.java

import java.util.*;

class Betyg {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Hur m�nga po�ng? ");
    int po�ng = input.nextInt();
    if (po�ng >= 45)
      System.out.println("Betyg: A");
	else if (po�ng >= 40)
      System.out.println("Betyg: B");
    else if (po�ng >= 35)
      System.out.println("Betyg: C");
	else if (po�ng >= 30)
      System.out.println("Betyg: D");
    else if (po�ng >= 25)
      System.out.println("Betyg: E");
    else
      System.out.println("Betyg: F");
  }
}
