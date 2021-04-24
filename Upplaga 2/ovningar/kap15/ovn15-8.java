// Rekommenderat filnamn: SokAbonnemang2.java

import java.util.*;
import java.io.*;
import java.text.*;   // Innehåller Collator

class SokAbonnemang2 {
  public static void main(String[] arg) throws IOException{
    // skapa arrayen med abonnemang
    var a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och läs filen
    Scanner fil = new Scanner(new File("abonnemang2.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // läs en rad i filen
      a[n] = new Abonnemang();
      a[n++].init(fil.nextInt(), fil.nextInt(),fil.nextLine().trim()); 
    }
    // Sök abonnemang
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilket abonnemang söker du? ");
      if (!scan.hasNextLine())
        break;
      var sökt = new Abonnemang();
      sökt.namn = scan.nextLine();
      // Leta efter abonnemanget i arrayen a
      int i = Arrays.binarySearch(a, 0, n, sökt);
      if (i >= 0)  // abonnemanget hittades
        System.out.println(a[i]);
      else
        System.out.println("Kunde inte hitta " + sökt.namn);
    } 
  }
}

class Abonnemang implements Comparable<Abonnemang> {
  int pris;      // per månad
  int GB;        // antal GB som ingår
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
    return namn + ", " + pris + " kr/mån, " + GB + " GB";
  }
}