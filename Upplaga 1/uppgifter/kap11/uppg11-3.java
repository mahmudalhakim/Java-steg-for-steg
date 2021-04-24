// Filen TestaSortering.java

import java.util.*;    // inneh�ller klassen Scanner

public class TestaSortering {

  public static boolean �rSorterat(double[] f, int antal) {
    for (int i=1; i < antal; i++)
      if (f[i] < f[i-1])
        return false;
    return true;
  }

  public static void main(String[] arg) { 
    double[] a = new double[1000];
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in talen. Avsluta med ctrl-z");
    while (sc.hasNextDouble()) 
      a[n++] = sc.nextDouble();
    if (�rSorterat(a, n))
      System.out.println("F�ltet �r sorterat");
    else
      System.out.println("F�ltet �r inte sorterat");
  }
}    
    
      
    
