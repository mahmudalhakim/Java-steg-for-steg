// Rekommenderat filnamn: Kommun.java

import java.util.*;

class Kommun {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Vilket �r? ");
    int �r = scan.nextInt();
    int antal = 26000;
    for (int i=2020; i<�r; i++)
      antal = antal + (int) (300 - 325 + antal*(0.7-0.6)/100+0.5);    
    System.out.println("Ber�knad befolkning :" + antal);
  }
}
