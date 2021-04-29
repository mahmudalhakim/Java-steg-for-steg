import java.util.*;
class Mobil2 {
  public static void main(String[] arg) {
    var namn = new String[100];    // array för namnen
    var pris = new int[100];       // array för priser
    int n = 0;      // räknare för antal abonnemang
    // Läs in namn och priser
    var scan = new Scanner(System.in);
    while(true) {
      System.out.print("Namn för abonnemang nr " + (n+1) +
                       "? ");
      if (!scan.hasNextLine())
        break;
      namn[n] = scan.nextLine();
      System.out.print("Pris/mån för " + namn[n] + "? ");
      if (!scan.hasNextInt())
        break; 
      pris[n] = scan.nextInt(); scan.nextLine();
      n++;
    }
    // Beräkna det lägsta priset
    int lägst = 0;           // index för billigaste
    for (int i=1; i<n; i++) 
      if (pris[i] < pris[lägst]) 
        lägst = i;          // nytt lägsta pris funnet
     System.out.println(namn[lägst] + " är billigast. " +
                   "Kostnad: " + pris[lägst] + " kr/mån");
  }
}