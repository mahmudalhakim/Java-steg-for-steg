import java.util.*;
import java.io.*;
class SokAbonnemang {
  public static void main(String[] arg) throws IOException{
    // skapa arrayen med abonnemang
    var a = new Abonnemang[100];   // Steg 1 och 2
    // Koppla en scanner till filen och l�s filen
    Scanner fil = new Scanner(new File("abonnemang.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // l�s en rad i filen
      a[n] = new Abonnemang();     // steg 3, skapa objekt
      a[n++].init(fil.nextInt(), fil.nextInt(),
                  fil.nextLine().trim()); 
    }
    // S�k abonnemang
    var scan = new Scanner(System.in);
    while(true) {     
      System.out.print("Vilket abonnemang s�ker du? ");
      if (!scan.hasNextLine())
        break;
      String s�kt = scan.nextLine();
      // Leta efter abonnemanget i arrayen a
      int i = 0;
      for (; i<n; i++) 
        if (a[i].namn.equals(s�kt))
          break;
      if (i < n)  // abonnemanget hittades
        System.out.println(a[i]);
      else
        System.out.println("Kunde inte hitta " + s�kt);
    } 
  }
}