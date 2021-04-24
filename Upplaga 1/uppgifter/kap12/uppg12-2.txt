// Filen SymTest.java
import java.util.*;
import java.io.*;

public class SymTest {
  public static boolean symmetrisk(int[][] m) {
    for (int i=0; i< m.length; i++) {
      if (m[i].length != m.length)
        return false;
      for (int j=0; j<m.length; j++)
        if (m[i][j] != m[j][i])
          return false;
    }
    return true;
  }

  public static void main(String[] arg) {
    int[][] f = new int[4][4];
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in en 4x4 matris");
    for (int i=0; i<4; i++)  
      for (int j=0; j<4; j++) 
        f[i][j] = sc.nextInt(); 
    if (symmetrisk(f))
      System.out.println("Matrisen är symmetrisk");
    else
      System.out.println("Matrisen är inte symmetrisk"); 
  }
}

