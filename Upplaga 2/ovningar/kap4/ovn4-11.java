// Rekommenderat filnamn: Personnr2.java

import java.util.*;

class Personnr2 {
  public static void main (String[] arg) {
    var input = new Scanner(System.in);
    System.out.print("Personnumer (ååmmdd-nnnn)? ");
    String s = input.nextLine();
    switch(s.charAt(8)) {
      case '0': case '2': case '4': case '6': case '8':
        System.out.println("Kvinna");
        break;
      case '1': case '3': case '5': case '7': case '9':
        System.out.println("Man");
        break;
      default:
        System.out.println("Felaktigt personnummer");
    }
  }
}

