// Filen SorteraAbonnemang.java

import javax.swing.*;
import java.util.*;
import java.io.*;

public class SorteraAbonnemang {
 public static void main(String[] arg) throws IOException{
    // skapa f‰ltet med abonnemang 
    Abonnemang[] a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och l‰s filen
    Scanner fil = new Scanner(new File("mobildata.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext()) {
      // l‰s en rad i filen
      a[n] = new Abonnemang();  // Steg 3: skapa ett objekt
      a[n].namn = fil.next();
      a[n].perMÂn    = fil.nextDouble();
      a[n].perMinDag = fil.nextDouble();
      a[n].perMin÷vr = fil.nextDouble();
      a[n].friaDag   = fil.nextDouble();
      a[n].fria÷vr   = fil.nextDouble();
      n++;
    }
    sortera(a, 0, n-1);
    for (int i=0; i<n; i++)
      System.out.println(a[i].namn);
    System.exit(0);
  }

  public static void sortera(Abonnemang[] a, 
                             int start, int slut) {
    for (int k=start; k < slut; k++) {
      // Sˆk den minsta bland komponenterna nr k till slut
      int m = k;   // index fˆr hittills minsta v‰rde
      for (int i=k; i<=slut; i++) 
       if (a[i].perMin÷vr < a[m].perMin÷vr) 
         m = i; // nytt minsta v‰rde funnet
      // LÂt komponenterna nr k och m byta plats
      Abonnemang  temp = a[k];
      a[k] = a[m];
      a[m] = temp;
    }
  }

}

class Abonnemang {
  String namn;
  double perMÂn;
  double perMinDag;
  double perMin÷vr;
  double friaDag;
  double fria÷vr;
}

