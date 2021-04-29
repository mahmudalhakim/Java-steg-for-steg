import java.util.*;
class Mobil2 {
  public static void main(String[] arg) {
    var namn = new String[100];    // array f�r namnen
    var pris = new int[100];       // array f�r priser
    int n = 0;      // r�knare f�r antal abonnemang
    // L�s in namn och priser
    var scan = new Scanner(System.in);
    while(true) {
      System.out.print("Namn f�r abonnemang nr " + (n+1) +
                       "? ");
      if (!scan.hasNextLine())
        break;
      namn[n] = scan.nextLine();
      System.out.print("Pris/m�n f�r " + namn[n] + "? ");
      if (!scan.hasNextInt())
        break; 
      pris[n] = scan.nextInt(); scan.nextLine();
      n++;
    }
    // Ber�kna det l�gsta priset
    int l�gst = 0;           // index f�r billigaste
    for (int i=1; i<n; i++) 
      if (pris[i] < pris[l�gst]) 
        l�gst = i;          // nytt l�gsta pris funnet
     System.out.println(namn[l�gst] + " �r billigast. " +
                   "Kostnad: " + pris[l�gst] + " kr/m�n");
  }
}