// Rekommenderat filnamn: CirkelMain.java

import java.util.*;

class CirkelMain {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Radien? ");
    double r = scan.nextDouble();
    double omkr = Cirkel.omkretsen(r);
    double area = Cirkel.arean(r);
    System.out.println("Omkrets: " + omkr + "\nArea: " + area);
  }
}

class Cirkel {
  static double omkretsen(double r) {
    return 2 * Math.PI * r;
  }

  static double arean(double r) {
    return Math.PI * r * r;
  }
}
