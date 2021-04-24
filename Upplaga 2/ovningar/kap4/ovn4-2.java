// Rekommenderat filnamn: Gym.java

import java.util.*;

class Gym {
  public static void main (String[] arg) {

    var input = new Scanner(System.in);

    System.out.print("Pris för ärskort? ");
    double arskort = input.nextDouble();

    System.out.print("Pris för biljett? ");
    double biljett = input.nextDouble();

    System.out.print("Antal besök? ");
    int antal = input.nextInt();

    if (arskort < antal*biljett)
      System.out.println("Årskort är billigast");
    else
      System.out.println("Biljetter är billigast");
  }
}

