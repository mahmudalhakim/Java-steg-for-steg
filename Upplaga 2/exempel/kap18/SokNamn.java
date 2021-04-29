import java.io.*;
import java.util.*;
import java.text.*;     // Inneh�ller Collator

class SokNamn {
  public static void main(String[] arg)throws IOException {
    // Skapa listan och l�s in fr�n filen
    var listan = new ArrayList<String>();  
    var fil = new Scanner(new File("namn.txt"));
    while (fil.hasNext()) 
      listan.add(fil.nextLine());
      
    // Sortera listan
    var jfr = Collator.getInstance();  // j�mf�rare
    jfr.setStrength(Collator.PRIMARY);
    Collections.sort(listan, jfr);
    
    // G�r s�kningar
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Namn? ");
      if (!scan.hasNextLine())
        break;
      String s�kt = scan.nextLine();
      int k = Collections.binarySearch(listan, s�kt, jfr);
      if (k >= 0)
        System.out.println("Medlem");
      else
        System.out.println("Inte medlem");
    }
  }
}