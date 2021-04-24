// Rekommenderat filnamn: Summa2.java

import java.util.*;
class Summa2 {  // Beräkning av summan 1+2+3+ .. + n
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("n? ");
    int n = scan.nextInt();
    int summa=0;
    int k=1;
    for (k=1, summa=0; k <= n; k=k+1) 
      summa = summa + k;
    System.out.println("Summan blir " + summa);
  }
}
