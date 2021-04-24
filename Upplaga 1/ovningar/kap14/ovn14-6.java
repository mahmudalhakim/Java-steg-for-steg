// Filen SorteraAbonnemang2.java

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class SorteraAbonnemang2 {
 public static void main(String[] arg) throws IOException{
    // skapa fältet med abonnemang
    Abonnemang[] a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och läs filen
    Scanner fil = new Scanner(new File("mobildata.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext()) {
      // läs en rad i filen
      a[n] = new Abonnemang();  // Steg 3: skapa ett objekt
      a[n].namn = fil.next();
      a[n].perMån    = fil.nextDouble();
      a[n].perMinDag = fil.nextDouble();
      a[n].perMinÖvr = fil.nextDouble();
      a[n].friaDag   = fil.nextDouble();
      a[n].friaÖvr   = fil.nextDouble();
      n++;
    }
    sortera(a, 0, n-1);
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter("mobildata2.txt")));
    for (int i=0; i<n; i++)
      // Använd metoden format för att få decimalkomman i utskriften
      utström.format("%s %1.0f %1.2f %1.2f %1.2f %1.2f\n",
                       a[i].namn, a[i].perMån, a[i].perMinDag, 
                      a[i].perMinÖvr, a[i].friaDag, a[i].friaÖvr);
    utström.close();
  }

  public static void sortera(Abonnemang[] a, 
                             int start, int slut) {
    Collator c = Collator.getInstance();
    c.setStrength(Collator.PRIMARY);

    for (int k=start; k < slut; k++) {
      // Sök den minsta bland komponenterna nr k till slut
      int m = k;   // index för hittills minsta värde
      for (int i=k; i<=slut; i++) 
       if (c.compare(a[i].namn, a[m].namn) < 0) 
         m = i; // nytt minsta värde funnet
      // Låt komponenterna nr k och m byta plats
      Abonnemang  temp = a[k];
      a[k] = a[m];
      a[m] = temp;
    }
  }

}

class Abonnemang {
  String namn;
  double perMån;
  double perMinDag;
  double perMinÖvr;
  double friaDag;
  double friaÖvr;
}

