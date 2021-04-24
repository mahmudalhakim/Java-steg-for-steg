// Rekommenderat filnamn:  Euclides.java

import java.util.*;

class Euclides {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println("F�rsta talet? ");
    int m = scan.nextInt();
    System.out.println("Andra talet? ");
    int n = scan.nextInt();
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    System.out.println("St�rsta gemensamma delare �r " + n);
  }
}

