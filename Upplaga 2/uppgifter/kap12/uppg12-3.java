// Rekommenderat filnamn: MagiTest.java
import java.util.*;
import java.io.*;

class MagiTest {
  static boolean magisk(int[][] m) {
    // kontrollera radlängderna och diagonalsummorna
    int diagonal1 = 0, diagonal2 = 0;
    for (int i=0; i< m.length; i++) {
      if (m[i].length != m.length)
        return false;
      diagonal1 += m[i][i];
      diagonal2 += m[i][m.length-i-1];
    }
    if (diagonal1 != diagonal2)
      return false;

    // kontrollera radsummorna   
    for (int i=0; i<m.length; i++) {
      int radsum = 0;
      for (int j=0; j<m.length; j++) 
        radsum += m[i][j];
      if (radsum != diagonal1)
        return false;
    }

    // kontrollera kolumnsummorna  
    for (int j=0; j<m.length; j++) {
      int kolsum = 0;
      for (int i=0; i<m.length; i++) 
        kolsum += m[i][j];
      if (kolsum != diagonal1)
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
    if (magisk(f))
      System.out.println("Matrisen är magisk");
    else
      System.out.println("Matrisen är inte magisk"); 
  }
}

