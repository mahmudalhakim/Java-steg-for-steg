// Rekommenderat filnamn: Textanalys.java

import java.io.*; 
import java.util.*;

class Textanalys {

  public static void main(String[] arg) throws IOException {
    var sc1 = new Scanner(System.in);
    int antalRader=0, antalOrd=0, antalTecken=0;
    while (sc1.hasNextLine()) { 
      String rad = sc1.nextLine();
      antalRader++;
      var sc2 = new Scanner(rad);
	  while (sc2.hasNext()) {
	    String ord = sc2.next();
        antalOrd++;
	  }
     antalTecken = antalTecken + rad.length();
    }
    System.out.println(antalRader + "  " + antalOrd + "  " + antalTecken);
  }
}


