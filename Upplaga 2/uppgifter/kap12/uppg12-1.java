// Rekommenderat filnamn: ProvStatistik.java
import java.util.*;
import java.io.*;

class ProvStatistik {

  public static void main(String[] arg) throws FileNotFoundException {
    String[] namn = new String[30];
    int[][] po�ng = new int[30][5];
    int antalProv = po�ng[0].length; 
    int n;
    var sc = new Scanner(new File("prov.txt"));
    for (n=0; sc.hasNextLine(); n++) {
      namn[n] = sc.nextLine();
      for (int i=0; i<antalProv; i++)
        po�ng[n][i] = sc.nextInt();
      sc.nextLine();
    }
    for (int j=0; j<n; j++) {
      double sum = 0;
      for (int i=0; i<antalProv; i++)
        sum += po�ng[j][i];      
      System.out.format("Genomsnittspo�ng f�r %s %1.1f\n", namn[j], sum/antalProv);
    }
    for (int i=0; i<antalProv; i++) {
      double sum = 0;
      for (int j=0; j<n; j++) 
        sum += po�ng[j][i];
      System.out.format("Genomsnittspo�ng p� prov nr %1d: %1.1f\n", i+1 ,sum/n);
    }    
  }
}

