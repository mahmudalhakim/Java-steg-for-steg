// Rekommenderat filnamn: MultTab.java

import java.util.*;

class MultTab {

 static void visaTab(int tal) {
    String tabell = "";
    for (int i=1; i<=10; i++)
      System.out.println(i + "  " + tal*i);    
  }

  // Testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
	 System.out.print("Skriv ett tal: ");
    int n = scan.nextInt();
    visaTab(n);
  }
}
