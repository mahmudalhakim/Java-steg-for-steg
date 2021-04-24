// Rekommenderat filnamn: JfrAbonnemang2.java
import java.text.*;   // Inneh�ller Collator

import java.util.*;
import java.io.*;
class JfrAbonnemang2 {
  public static void main(String[] arg) throws IOException{
    // skapa arrayen med abonnemang
    var a = new Abonnemang[100];   // Steg 1 och 2  
    // Koppla en skanner till filen och l�s filen
    var fil = new Scanner(new File("abonnemang.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // l�s en rad i filen
      a[n] = new Abonnemang();
      a[n++].init(fil.nextInt(), fil.nextInt(),fil.nextLine().trim()); 
    }
    Arrays.sort(a, 0, n);
    PrintWriter utstr�m = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter("abonnemang2.txt")));
    for (int i = 0; i<n; i++) 
      utstr�m.println(a[i].pris + " " + a[i].GB + " " + a[i].namn);
    utstr�m.close();
  }
}


class Abonnemang implements Comparable<Abonnemang> {
  int pris;      // per m�nad
  int GB;        // antal GB som ing�r
  String namn;
  
  void init(int p, int g, String n) {
    namn=n;
    pris = p;
    GB = g;
  }
  
  public int compareTo(Abonnemang annan) {
    Collator col = Collator.getInstance();
    col.setStrength(Collator.PRIMARY);
    return col.compare(namn, annan.namn);
  }
  
  @Override
  public String toString() {
    return namn + ", " + pris + " kr/m�n, " + GB + " GB";
  }
}