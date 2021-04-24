// Rekommenderat filnamn: Prim.java

import java.util.*;

class Prim {

 static boolean �rEttPrimtal(int talet) {
    for (int k = 2; k<talet; k++)
      if (talet % k == 0)
        return false;
    return true;
  }

  // Testprogram
  public static void main (String[] arg) {
	while (true) {
      // L�s in ett tal och avbryt om anv�ndaren vill sluta
      var scan = new Scanner(System.in);
      System.out.print("Talet? ");
      int talet = scan.nextInt();
      if (talet <= 0)
        break;
	   if (�rEttPrimtal(talet))
        System.out.println("Primtal");
      else
        System.out.println("Ej primtal");
    }

  }
}

