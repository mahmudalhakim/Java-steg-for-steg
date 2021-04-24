// Rekommenderat filnamn: Vara.java

import java.util.*;

class Vara {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Pris (inkl. moms)? ");
    double pris = scan.nextDouble();
    System.out.print("Momssats? ");
    int procent = scan.nextInt();
    double exkl = pris / (1 + 0.01 * procent);
    double moms = pris - exkl;
    System.out.println("Pris (exkl. moms): " + exkl + "\nMoms: " + moms);
  }
}
