// Rekommenderat filnamn: ProvStatistik.java
import java.util.*;
import java.io.*;

class ProvStatistik {

  public static void main(String[] arg) throws FileNotFoundException {
    String[] namn = new String[30];
    int[][] poäng = new int[30][5];
    int antalProv = poäng[0].length; 
    int n;
    var sc = new Scanner(new File("prov.txt"));
    for (n=0; sc.hasNextLine(); n++) {
      namn[n] = sc.nextLine();
      for (int i=0; i<antalProv; i++)
        poäng[n][i] = sc.nextInt();
      sc.nextLine();
    }
    for (int j=0; j<n; j++) {
      double sum = 0;
      for (int i=0; i<antalProv; i++)
        sum += poäng[j][i];      
      System.out.format("Genomsnittspoäng för %s %1.1f\n", namn[j], sum/antalProv);
    }
    for (int i=0; i<antalProv; i++) {
      double sum = 0;
      for (int j=0; j<n; j++) 
        sum += poäng[j][i];
      System.out.format("Genomsnittspoäng på prov nr %1d: %1.1f\n", i+1 ,sum/n);
    }    
  }
}

