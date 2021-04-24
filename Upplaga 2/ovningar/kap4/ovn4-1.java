// Rekommenderat filnamn: Godis.java

import java.util.*;

class Godis {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Hur många gram? ");
    int gram = input.nextInt();
	 System.out.print("Pris per hekto? ");
    double hgpris = input.nextDouble();
    double pris = gram * hgpris / 100;
    if (pris >= 100)
      pris = pris - pris * 0.10;
    System.out.println("Det kostar " +  pris + " kr");				   
  }
}
