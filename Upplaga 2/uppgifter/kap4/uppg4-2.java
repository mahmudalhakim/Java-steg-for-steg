// Rekommenderat filnamn: Cirkel.java

import java.util.*;

class Cirkel {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Radien? ");
    double r = input.nextDouble();
    if (r <= 0) {
      System.out.println("Felaktig radie");
      System.exit(0);
    }
    double omkr = 2 * Math.PI * r;
    double area = Math.PI * r * r;
    System.out.println("Omkrets: " + omkr + "\nArea: " + area);
  }
}
