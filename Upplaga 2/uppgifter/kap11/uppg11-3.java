// // Rekommenderat filnamn: TestaSortering.java

import java.util.*;    // inneh�ller klassen Scanner

class TestaSortering {

  public static boolean �rSorterad(double[] f, int antal) {
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
    if (�rSorterad(a, n))
      System.out.println("Arrayen �r sorterad");
    else
      System.out.println("Arrayen �r inte sorterad");
  }
}    
    
      
    
