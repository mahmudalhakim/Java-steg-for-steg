// Rekommenderat filnamn: C.java

import java.util.*;

class C {

  static double sin(double x) {    
    double term = x, 
           sum  = 0;
    int k = 1;
    while (Math.abs(term) >= 1.0e-5) {
      sum += term;
      k += 2;
      term = -term*x*x/(k-1)/k;
    }
    return sum;
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("x? ");
    double x = scan.nextDouble();
    System.out.println("sin(x) =  " + sin(x));
    // Jämför med Math.sin
    System.out.println("sin(x) =  " + Math.sin(x));    
  }
}