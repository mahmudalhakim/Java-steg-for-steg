//Filen SkrivUtOvn.java 

import javax.swing.*;

public class SkrivUtOvn {

  public static void main(String[] arg) {
    int[][] a = new int[10][7];
    ändra(a);
    skrivUt(a);
  }

  public static void ändra(int[][] f) {
    for (int i=0; i<f.length; i++)
      for (int j=0; j<f[i].length; j++)
        f[i][j] = i+j;
  }

  public static void skrivUt(int[][] f) {
    for (int i=0; i<f.length; i++) {
      for (int j=0; j<f[i].length; j++)
        System.out.print(f[i][j]+ "\t");
      System.out.println();
    }
  }
}
