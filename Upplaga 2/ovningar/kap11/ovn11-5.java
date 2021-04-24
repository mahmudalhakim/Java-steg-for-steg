// Rekommenderat filnamn: Mobil2B.java 

import java.util.*;
class Mobil2B {
  public static void main(String[] arg) {
    String lägstNamn = "";                 // lägsta hittills
    int lägstPris = Integer.MAX_VALUE;     // eller ett annat stort värde
    // Läs in namn och priser
    var scan = new Scanner(System.in);
    int n = 0;
    while(true) {
      System.out.print("Namn för abonnemang nr " + ++n + "? ");
      if (!scan.hasNextLine())
        break;
      String namn = scan.nextLine();
      System.out.print("Pris/mån för " + namn + "? ");
      if (!scan.hasNextInt())
        break; 
      int pris = scan.nextInt(); scan.nextLine();
      if (pris < lägstPris) {
        lägstPris = pris;
        lägstNamn = namn;
      }
    }
    // Skriv ut det lägsta priset
     System.out.println(lägstNamn + " är billigast. " +
                        "Kostnad: " + lägstPris + " kr/mån");
  }
}
