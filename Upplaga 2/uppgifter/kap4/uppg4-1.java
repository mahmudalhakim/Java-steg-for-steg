// Rekommenderat filnamn: Mobiltel.java

import java.util.*;

class Mobiltel {
  public static void main(String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Antal minuter per m�nad? ");
    int min = input.nextInt();
    if (min  <= 33)
      System.out.println("V�lj Kontant");
    else if (min > 33 && min  <= 66)
      System.out.println("V�lj Normal");
    else
      System.out.println("V�lj Plus");
  }
}
