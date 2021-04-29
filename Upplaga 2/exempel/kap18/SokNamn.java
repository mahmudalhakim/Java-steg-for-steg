import java.io.*;
import java.util.*;
import java.text.*;     // Innehåller Collator

class SokNamn {
  public static void main(String[] arg)throws IOException {
    // Skapa listan och läs in från filen
    var listan = new ArrayList<String>();  
    var fil = new Scanner(new File("namn.txt"));
    while (fil.hasNext()) 
      listan.add(fil.nextLine());
      
    // Sortera listan
    var jfr = Collator.getInstance();  // jämförare
    jfr.setStrength(Collator.PRIMARY);
    Collections.sort(listan, jfr);
    
    // Gör sökningar
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Namn? ");
      if (!scan.hasNextLine())
        break;
      String sökt = scan.nextLine();
      int k = Collections.binarySearch(listan, sökt, jfr);
      if (k >= 0)
        System.out.println("Medlem");
      else
        System.out.println("Inte medlem");
    }
  }
}