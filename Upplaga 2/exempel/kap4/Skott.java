import java.util.*;
class Skott {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv ett �rtal: ");
    int �r = scan.nextInt();
    if ((�r % 4 == 0 && �r % 100 != 0) || �r % 400 == 0)
      System.out.println("Skott�r");
    else
      System.out.println("Inte skott�r");
  }
}