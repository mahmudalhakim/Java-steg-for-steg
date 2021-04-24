// Rekommenderat filnamn: Mobil1B.java
import java.util.*;
class Mobil1B {

  // Den nya metoden medelv
  static double medelv(int[] a) {
    double sum = 0;
    for (int x : a)
      sum = sum + x;
    return sum/a.length;
  }
  
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    // Läs in arraystorlek och skapa arrayen
    System.out.print("Hur många abonnemang? ");
    int n = scan.nextInt(); scan.nextLine(); 
    var namn = new String[n];     // array för namnen
    var pris = new int[n];        // array för priser
    // Läs in namn och priser
    for (int i=0; i<n; i++) {
      System.out.print("Namn för abonnemang nr " + (i+1) +
                       "? ");
      namn[i] = scan.nextLine();
      System.out.print("Pris/mån för " + namn[i] + "? "); 
      pris[i] = scan.nextInt(); scan.nextLine(); 
    }
    // Beräkna det lägsta priset
    int lägst = 0;           // index för billigaste
    for (int i=1; i<n; i++) 
      if (pris[i] < pris[lägst]) 
        lägst = i;           // nytt lägsta pris funnet
     System.out.println(namn[lägst] + " är billigast. " +
                   "Kostnad: " + pris[lägst] + " kr/mån");
    // Anropa den nya metoden  
    System.out.println("Medelvärde av priserna: " + medelv(pris));
  }
}
