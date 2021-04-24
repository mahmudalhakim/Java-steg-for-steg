// Rekommenderat filnamn: Halvering.java

import java.util.*;

class Halvering {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Antal år? ");
    int t = scan.nextInt();
    double lambda = Math.log(2.0)/5730;
    double n0 = 100;  // 100 %
    double rest = n0 * Math.exp(-lambda*t);
    System.out.println("Det återstår " + rest + " %");
  }
}

