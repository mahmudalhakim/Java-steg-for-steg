// Rekommenderat filnamn: DelTest.java
import java.util.*;
import java.io.*;

class DelTest {
  static int[][] väljDel(int[][] f, int r1, int r2, int k1, int k2) {
    if (r1<0 || k1<0 || r2<r1 || k2<k1 || r2>=f.length || k2>=f[0].length)
      return null;
    int[][] r = new int[r2-r1+1][k2-k1+1];
 
    for (int i=0; i<r.length; i++) {
      for (int j=0; j<r[i].length; j++) 
        r[i][j] = f[r1+i][k1+j];
    }
    return r;
  }

  // Testprogram
  public static void main(String[] arg) {
    int[][] f1 = {{1,2,3,4,5}, 
                  {6,7,8,9,10}, 
                  {11,12,13,14,15}};
    int[][] f2 = new int[2][3];
    f2 = väljDel(f1, 1, 2, 2, 4);
    for (int i=0; i<f2.length; i++) { 
      for (int j=0; j<f2[i].length; j++) 
        System.out.print(f2[i][j] + "  ");
      System.out.println(); 
    }
  }
}

