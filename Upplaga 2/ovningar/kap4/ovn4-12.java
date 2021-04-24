// Rekommenderat filnamn: Personnr3.java

import java.util.*;

class Personnr3 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Personnumer (ååmmdd-nnnn)? ");
    String s = input.nextLine();
    switch(s.charAt(8)) {
      case '0', '2', '4', '6','8' ->
        System.out.println("Kvinna");
      case '1', '3', '5', '7', '9' ->
                System.out.println("Man");
      default ->
        System.out.println("Felaktigt personnummer");
    }
  }
}
