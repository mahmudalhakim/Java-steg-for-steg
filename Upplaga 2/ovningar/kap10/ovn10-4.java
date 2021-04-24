// Rekommenderat filnamn:  Log.java 
import java.io.*;
import java.util.*;

class Log {
 public static void main(String[] arg) throws IOException {
    Scanner tangentbord = new Scanner(System.in);
    System.out.print("Vad heter loggfilen? ");
    String filnamn = tangentbord.nextLine();
    Scanner fil = new Scanner(new File(filnamn));  
    int maxtid = 0;       // längsta tid hittills
    String maxNamn = "";  // namn på användaren
    while (fil.hasNext()) {
      String namn = fil.next();   // läs namnet
      int tottid = 0;
      while (fil.hasNextInt())
        tottid = tottid + fil.nextInt();   // addera tiderna
      if (tottid > maxtid) {
        maxtid = tottid;
        maxNamn = namn;
      }  
    }
    System.out.print(maxNamn + " har varit inloggad " + maxtid + " minuter");
  }      
}
