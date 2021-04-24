// Filen ProvStatistik.java
import java.util.*;
import java.io.*;

public class ProvStatistik {

  public static void main(String[] arg) throws FileNotFoundException {
    String[] namn = new String[30];
    int[][] poäng = new int[30][5];
    int antalProv = poäng[0].length; 
    int n;
    Scanner sc = new Scanner(new File("prov.txt"));
    for (n=0; sc.hasNext(); n++) {
      namn[n] = sc.nextLine();
      String rad = sc.nextLine();
      Scanner sc2 = new Scanner(rad);
      for (int i=0; i<antalProv; i++)
        poäng[n][i] = sc2.nextInt();
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

