//Filen Multtab2.java

import javax.swing.*;

public class Multtab2 {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Multiplikationstabellens storlek?");
    int n = Integer.parseInt(s); 

    int[][] tab = new int[n][n];
    for (int i=0; i<tab.length; i++)
      for (int j=0; j<tab[i].length; j++)
        tab[i][j] = (i+1)*(j+1);

    for (int i=0; i<tab.length; i++) {
      for (int j=0; j<tab[i].length; j++)
        System.out.print("\t" + tab[i][j]);
      System.out.println();
    }

  }      
}
