// Rekommenderat filnamn:  Uttryck4

import javax.swing.*;

class Uttryck4 {
  public static void main (String[] arg) {
    for (double x=-1; x<=1; x=x+0.1) {
      double f = 2*x*x - 5*x + 1;
      System.out.format("%5.2f%8.2f\n", x, f);
    } 
  }
}
