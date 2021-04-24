// Rekommenderat filnamn: Mobiltel.java

import java.util.*;

class Mobiltel {
  public static void main(String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Antal minuter per månad? ");
    int min = input.nextInt();
    if (min  <= 33)
      System.out.println("Välj Kontant");
    else if (min > 33 && min  <= 66)
      System.out.println("Välj Normal");
    else
      System.out.println("Välj Plus");
  }
}
