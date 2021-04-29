import java.util.*;
class Skott {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv ett årtal: ");
    int år = scan.nextInt();
    if ((år % 4 == 0 && år % 100 != 0) || år % 400 == 0)
      System.out.println("Skottår");
    else
      System.out.println("Inte skottår");
  }
}