import java.io.*;
import java.util.*;
class Biltest {
  public static void main(String[] arg) {
    var tab = new HashMap<String, Bil>();
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Renault Megane";
    b1.årsmodell = 2013;
    b1.tjänstevikt = 1460;
    b1.effekt = 81.0;
    b2.regNr = "LYX999";
    b2.fabrikat = "Tesla Model S";
    b2.årsmodell = 2019;
    b2.tjänstevikt = 2215;
    b2.effekt = 285.0;
    tab.put(b1.regNr, b1);
    tab.put(b2.regNr, b2);
    var scan = new Scanner(System.in);
    System.out.print("Regnummer? "); 
    String nr = scan.next();
    Bil b = tab.get(nr);
    if (b != null)
      System.out.println(b.fabrikat + " " + b.årsmodell); 
    else
      System.out.println("Saknas");
    }
 }
    

class Bil {
  String regNr;
  String fabrikat;
  int årsmodell;
  double tjänstevikt;
  double effekt;
}

