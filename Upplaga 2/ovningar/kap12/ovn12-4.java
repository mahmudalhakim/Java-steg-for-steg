//Rekommenderat filnamn: Multtab3.java

import java.util.*;

class Multtab3 {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Multiplikationstabellens storlek? ");
    int n = scan.nextInt(); 
    int[][] tab = new int[n][];
    for (int i=0; i<tab.length; i++) 
      tab[i] = new int[i+1]; 

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
