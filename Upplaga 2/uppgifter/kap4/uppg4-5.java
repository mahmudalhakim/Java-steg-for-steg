// Rekommenderat filnamn: Triangel.java

import java.util.*;

class Triangel {
  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    System.out.print("L�ngden f�r f�rsta sidan? ");
    double a = input.nextDouble();
    System.out.print("L�ngden f�r andra sidan? ");
    double b = input.nextDouble();
    System.out.print("Vinkeln mellan sidorna? ");
    double v = input.nextDouble();
    double gamma = v * 2 * Math.PI / 360;  // omr�kning till radianer
    double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(gamma));
    double e = 1e-10;  // ett litet tal

    if (Math.abs(a-b) < e && Math.abs(a-c) < e && Math.abs(b-c) < e)
      System.out.println("Liksidig");
    else if (Math.abs(a-b) < e || Math.abs(a-c) < e || Math.abs(b-c) < e)
      System.out.println("Likbent");
    else
      System.out.println("Oliksidig");
  }
}
