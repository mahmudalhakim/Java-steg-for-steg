// Rekommenderat filnamn: SokAbonnemang2.java

import java.util.*;
import java.io.*;
import java.text.*;   // Inneh�ller Collator

class SokAbonnemang2 {
  public static void main(String[] arg) throws IOException{
    // skapa arrayen med abonnemang
    var a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och l�s filen
    Scanner fil = new Scanner(new File("abonnemang2.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // l�s en rad i filen
      a[n] = new Abonnemang();
      a[n++].init(fil.nextInt(), fil.nextInt(),fil.nextLine().trim()); 
    }
    // S�k abonnemang
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilket abonnemang s�ker du? ");
      if (!scan.hasNextLine())
        break;
      var s�kt = new Abonnemang();
      s�kt.namn = scan.nextLine();
      // Leta efter abonnemanget i arrayen a
      int i = Arrays.binarySearch(a, 0, n, s�kt);
      if (i >= 0)  // abonnemanget hittades
        System.out.println(a[i]);
      else
        System.out.println("Kunde inte hitta " + s�kt.namn);
    } 
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