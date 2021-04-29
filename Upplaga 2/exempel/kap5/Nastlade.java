import java.util.*;
class Nastlade {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Antal rader? ");
    int n = scan.nextInt();
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++)
        System.out.print('+');
      System.out.println();     // avsluta raden
    }
  }
}