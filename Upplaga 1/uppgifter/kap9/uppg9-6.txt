// Filen Filanalys.java

import java.io.*; 
import java.util.*;

class Filanalys {

  public static void main(String[] arg) throws IOException {
    Scanner sc1 = new Scanner(System.in);
    int rader=0, ord=0, tecken=0;
    while (sc1.hasNext()) { 
      String rad = sc1.nextLine();
      rader++;
      Scanner sc2 = new Scanner(rad);
	  while (sc2.hasNext()) {
	    String s = sc2.next();
        ord++;
	  }
      tecken = tecken + rad.length();
    }
    System.out.println(rader + "  " + ord + "  " + tecken);
  }
}


