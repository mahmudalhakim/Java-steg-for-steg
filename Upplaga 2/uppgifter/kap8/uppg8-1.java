// Rekommenderat filnamn: TeckenKlass.java

import java.util.*;

class TeckenKlass {

  static int tecken(int tal) {
    if (tal>0)
      return 1;
    else if (tal==0)
      return 0;
    else
      return -1;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
	 System.out.print("Skriv ett tal: ");
    int n = scan.nextInt();
    System.out.println("Talets tecken är " + tecken(n));
  }
}
