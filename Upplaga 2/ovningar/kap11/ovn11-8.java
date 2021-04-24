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
    // L�s in arraystorlek och skapa arrayen
    System.out.print("Hur m�nga abonnemang? ");
    int n = scan.nextInt(); scan.nextLine(); 
    var namn = new String[n];     // array f�r namnen
    var pris = new int[n];        // array f�r priser
    // L�s in namn och priser
    for (int i=0; i<n; i++) {
      System.out.print("Namn f�r abonnemang nr " + (i+1) +
                       "? ");
      namn[i] = scan.nextLine();
      System.out.print("Pris/m�n f�r " + namn[i] + "? "); 
      pris[i] = scan.nextInt(); scan.nextLine(); 
    }
    // Ber�kna det l�gsta priset
    int l�gst = 0;           // index f�r billigaste
    for (int i=1; i<n; i++) 
      if (pris[i] < pris[l�gst]) 
        l�gst = i;           // nytt l�gsta pris funnet
     System.out.println(namn[l�gst] + " �r billigast. " +
                   "Kostnad: " + pris[l�gst] + " kr/m�n");
    // Anropa den nya metoden  
    System.out.println("Medelv�rde av priserna: " + medelv(pris));
  }
}
