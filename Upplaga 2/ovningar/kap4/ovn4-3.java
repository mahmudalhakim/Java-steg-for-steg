// Rekommenderat filnamn: Betyg.java

import java.util.*;

class Betyg {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Hur många poäng? ");
    int poäng = input.nextInt();
    if (poäng >= 45)
      System.out.println("Betyg: A");
	else if (poäng >= 40)
      System.out.println("Betyg: B");
    else if (poäng >= 35)
      System.out.println("Betyg: C");
	else if (poäng >= 30)
      System.out.println("Betyg: D");
    else if (poäng >= 25)
      System.out.println("Betyg: E");
    else
      System.out.println("Betyg: F");
  }
}
