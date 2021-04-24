// Rekommenderat filnamn: Paket.java

import java.util.*;

class Paket {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Längd (cm)? ");
    int l = input.nextInt();
    System.out.print("Bredd (cm)? ");
    int b = input.nextInt();
    System.out.print("Tjocklek (cm)? ");
    int t = input.nextInt();
    if (l >= 14 && l <= 60 && b >= 9 && t <= 10 && b+l+t <= 90)
      System.out.println("Måtten OK");
    else 
      System.out.println("Felaktiga mått");
  }
}
