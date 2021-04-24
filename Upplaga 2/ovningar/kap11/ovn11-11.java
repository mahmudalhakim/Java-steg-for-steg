// Rekommenderat filnamn:JfrAbonnemang2

import java.util.*;
import java.io.*;
class JfrAbonnemang2 {
  public static void main(String[] arg)throws IOException {
    // Skapa arrayerna
    var pris = new int[100];
    var GB  = new int[100];
    var namn = new String[100]; 
    // Koppla en scanner till filen
    Scanner fil = new Scanner(new File("abonnemang.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // l�s en rad i filen
      pris[n] = fil.nextInt();
      GB[n]   = fil.nextInt();
      if (GB[n] < 0)
        GB[n] = Integer.MAX_VALUE;
      namn[n] = fil.nextLine().trim();
      n++;
    }
    // G�r ber�kningar f�r olika indata
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("Antal GB per m�nad? "); 
      if (!scan.hasNextInt())
        break;  
      int antalGB = scan.nextInt(); 
      // S�k det billigaste abonnemanget
      int l�gst = -1;   // index f�r det billigaste 
      for (int i=0; i<n; i++)
        if (GB[i] >= antalGB && 
           (l�gst < 0 || pris[i] < pris[l�gst]))
          l�gst = i;
      // Visa resultat
      if (l�gst >= 0) 
        System.out.println(namn[l�gst] + " �r billigast. "
                 + "Kostnad: " + pris[l�gst] + " kr/m�n");
      else 
        System.out.println("Inget abonnemang passar");
    }
  }
}