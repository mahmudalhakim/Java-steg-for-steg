import java.util.*;
class Summa {  // Beräkning av summan 1+2+3+ .. + n
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("n? ");
    int n = scan.nextInt();
    int summa=0;
    int k=1;
    while (k <= n) {
      summa = summa + k;      // öka summan med k
      k = k + 1;              // öka k med 1
    }
    System.out.println("Summan blir " + summa);
  }
}