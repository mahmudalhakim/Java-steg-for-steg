import java.util.*;
class Summa {  // Ber�kning av summan 1+2+3+ .. + n
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("n? ");
    int n = scan.nextInt();
    int summa=0;
    int k=1;
    while (k <= n) {
      summa = summa + k;      // �ka summan med k
      k = k + 1;              // �ka k med 1
    }
    System.out.println("Summan blir " + summa);
  }
}