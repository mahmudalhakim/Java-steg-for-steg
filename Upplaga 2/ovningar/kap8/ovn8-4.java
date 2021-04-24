// Rekommenderat filnamn: Skott2

import java.util.*;

class Skott2 {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Skriv ett årtal: ");
    int år = scan.nextInt();
    if (Kalender.ärSkottår(år))
      System.out.println("Skottår");
    else
      System.out.println("Inte skottår");
  }
}

class Kalender {
  static boolean ärSkottår(int n) {
    return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
  }
}
