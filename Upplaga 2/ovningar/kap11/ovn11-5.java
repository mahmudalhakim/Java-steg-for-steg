// Rekommenderat filnamn: Mobil2B.java 

import java.util.*;
class Mobil2B {
  public static void main(String[] arg) {
    String l�gstNamn = "";                 // l�gsta hittills
    int l�gstPris = Integer.MAX_VALUE;     // eller ett annat stort v�rde
    // L�s in namn och priser
    var scan = new Scanner(System.in);
    int n = 0;
    while(true) {
      System.out.print("Namn f�r abonnemang nr " + ++n + "? ");
      if (!scan.hasNextLine())
        break;
      String namn = scan.nextLine();
      System.out.print("Pris/m�n f�r " + namn + "? ");
      if (!scan.hasNextInt())
        break; 
      int pris = scan.nextInt(); scan.nextLine();
      if (pris < l�gstPris) {
        l�gstPris = pris;
        l�gstNamn = namn;
      }
    }
    // Skriv ut det l�gsta priset
     System.out.println(l�gstNamn + " �r billigast. " +
                        "Kostnad: " + l�gstPris + " kr/m�n");
  }
}
