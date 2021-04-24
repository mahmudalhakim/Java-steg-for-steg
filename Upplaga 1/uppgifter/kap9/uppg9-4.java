// Filen Saldo.java

import java.io.*;
import java.util.*;

public class Saldo {

  public static void skrivSaldo
                  (double b, double r, int n, double ut) {
    if (ut > b*0.01*r) { // är uttaget större än räntan?
      System.out.println("För stort uttag");
    }
    else { 
      for (int i=1; i <= n; i++) {   // ett varv per år
         b = b + b*0.01*r - ut;
         System.out.format("%3d%15.2f\n", i, b);
      }
    }
  }


  public static void main (String[] arg) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.print("Belopp? "); System.out.flush();
    double belopp = sc.nextDouble();
    System.out.print("Ränta? ");  System.out.flush();
    double ränta = sc.nextDouble();
    System.out.print("Antal år? ");  System.out.flush();
    int antal = sc.nextInt();
    System.out.print("Uttag? ");  System.out.flush();
    double uttag = sc.nextDouble();    
    skrivSaldo(belopp, ränta, antal, uttag);
  }
}
