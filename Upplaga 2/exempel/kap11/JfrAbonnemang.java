import java.util.*;
import java.io.*;
class JfrAbonnemang {
  public static void main(String[] arg)throws IOException {
    // Skapa arrayerna
    var pris = new int[100];
    var GB  = new int[100];
    var namn = new String[100]; 
    // Koppla en scanner till filen
    Scanner fil = new Scanner(new File("abonnemang.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNextLine() && n < 100) {
      // läs en rad i filen
      pris[n] = fil.nextInt();
      GB[n]   = fil.nextInt();
      namn[n] = fil.nextLine().trim();
      n++;
    }
    // Gör beräkningar för olika indata
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("Antal GB per månad? "); 
      if (!scan.hasNextInt())
        break;  
      int antalGB = scan.nextInt(); 
      // Sök det billigaste abonnemanget
      int lägst = -1;   // index för det billigaste 
      for (int i=0; i<n; i++)
        if (GB[i] >= antalGB && 
           (lägst < 0 || pris[i] < pris[lägst]))
          lägst = i;
      // Visa resultat
      if (lägst >= 0) 
        System.out.println(namn[lägst] + " är billigast. "
                 + "Kostnad: " + pris[lägst] + " kr/mån");
      else 
        System.out.println("Inget abonnemang passar");
    }
  }
}