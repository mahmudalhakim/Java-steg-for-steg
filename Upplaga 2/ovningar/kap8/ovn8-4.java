// Rekommenderat filnamn: Skott2

import java.util.*;

class Skott2 {
  public static void main(String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Skriv ett �rtal: ");
    int �r = scan.nextInt();
    if (Kalender.�rSkott�r(�r))
      System.out.println("Skott�r");
    else
      System.out.println("Inte skott�r");
  }
}

class Kalender {
  static boolean �rSkott�r(int n) {
    return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0;
  }
}
