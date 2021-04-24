// Filen SokAbonnemang2.java

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class SokAbonnemang2 {
  public static void main(String[] arg) throws IOException{
    // skapa fältet med abonnemang
    Abonnemang[] a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och läs filen
    Scanner fil = new Scanner(new File("mobildata2.txt"));
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
    // Sök abonnemang
    while(true) {
      String sökt = JOptionPane.showInputDialog
                          ("Vilket abonnemang söker du?");
      if (sökt == null)
        break;
      // Leta efter abonnemanget i fältet a
      int k = binSök(a, 0, n-1, sökt);

      int i = 0;
      for (; i<n; i++) 
        if (a[i].namn.equals(sökt))
          break;
      if (k > 0)  // abonnemanget hittades
        JOptionPane.showMessageDialog(null, String.format
                         ("Fast månadskostnad: %.2f " +
                          "\nPris per minut: %.2f", 
                          a[k].perMån, a[k].perMinDag));
      else
        JOptionPane.showMessageDialog(null, 
                             "Kunde inte hitta " + sökt);
    }      
  }

  public static int binSök(Abonnemang[] a, int start, 
                           int slut, String sökt) {
   Collator c = Collator.getInstance();
   c.setStrength(Collator.PRIMARY);

   int i1 = start, i2 = slut, m = 0;
   while (i1 <= i2) {
     m = (i1 + i2)/2; 
     if (c.compare(sökt, a[m].namn)<0)
       i2 = m-1;
     else if(c.compare(sökt, a[m].namn)>0)
       i1 = m+1;
     else // lika
       break;  // man hittade abonnemanget 
   }
   if (c.compare(sökt, a[m].namn)==0)
     return m;
   else
     return start-1;
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

