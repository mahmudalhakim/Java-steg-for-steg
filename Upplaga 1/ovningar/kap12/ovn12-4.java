//Filen KolSumOvn.java 

import javax.swing.*;

public class KolSumOvn {
  public static void main(String[] arg) {
    double[][] a = new double[5][4];
    a[0][2] = 1;
    for (int i=1; i<a.length; i++) 
      a[i][2] = a[i-1][2]/10;  
    System.out.println("Summan av tredje kolumnen �r " + kolSum(a, 2)); 
  }

  public static double kolSum(double[][] f, int k) {
    // summerar komponenterna i kolumn nummer k
    double sum = 0;
    for (int i=0; i<f.length; i++)
      sum = sum + f[i][k];
    return sum;
  }    
}
