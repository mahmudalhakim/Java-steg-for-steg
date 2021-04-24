// Rekommenderat filnamn: Prim.java

import java.util.*;

class Prim {

 static boolean ärEttPrimtal(int talet) {
    for (int k = 2; k<talet; k++)
      if (talet % k == 0)
        return false;
    return true;
  }

  // Testprogram
  public static void main (String[] arg) {
	while (true) {
      // Läs in ett tal och avbryt om användaren vill sluta
      var scan = new Scanner(System.in);
      System.out.print("Talet? ");
      int talet = scan.nextInt();
      if (talet <= 0)
        break;
	   if (ärEttPrimtal(talet))
        System.out.println("Primtal");
      else
        System.out.println("Ej primtal");
    }

  }
}

