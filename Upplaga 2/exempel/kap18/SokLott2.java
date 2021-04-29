import java.io.*;
import java.util.*;
class SokLott2 {
  public static void main(String[] arg)throws IOException {
    // L�s in information fr�n filen
    int n = 0;    // antal vinstlotter
    var fil = new Scanner(new File("dragningslista.txt"));
    var vinster = new HashMap<Integer, String>();
    while (fil.hasNext())    // ett varv per rad i filen
      vinster.put(fil.nextInt(), fil.nextLine().trim()); 
      
    // Fr�ga efter lottnummer
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Lottnummer? ");
      if (!scan.hasNextInt())
        break;
      String vinst = vinster.get(scan.nextInt());
      if (vinst != null)
        System.out.println("Vinst: " + vinst);
      else 
        System.out.println("Nitlott");
    }
  }
}