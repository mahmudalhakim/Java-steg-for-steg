import java.util.*;
import java.io.*;
class JfrAbonnemang2 {
  public static void main(String[] arg) throws IOException{
    // skapa arrayen med abonnemang
    var a = new Abonnemang[100];   // Steg 1 och 2 
    // Koppla en skanner till filen 
    var fil = new Scanner(new File("abonnemang.txt"));
    int n = 0;    // antal olika abonnemang
    while (fil.hasNext() && n < 100) {
      // läs en rad i filen
      a[n] = new Abonnemang();     // steg 3, skapa objekt
      a[n++].init(fil.nextInt(), fil.nextInt(),
                  fil.nextLine().trim()); 
    }
    // Gör beräkningar för olika indata
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.print("Antal GB per månad? "); 
      if (!scan.hasNextInt())
        break;  
      int antalGB = scan.nextInt();
      // Sök det billigaste abonnemanget
      int billigast = -1;   // index för det billigaste 
      for (int i=0; i<n; i++)
        if (a[i].GB >= antalGB && (billigast < 0 ||
            a[i].pris < a[billigast].pris))
          billigast = i;
      // Visa resultat
      if (billigast >= 0) 
        System.out.println("Billigast: " + a[billigast]);
      else 
        System.out.println("Inget abonnemang passar");
    }
  }
}