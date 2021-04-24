// Rekommenderat filnamn: Vitt.java

import java.util.*;

class Vitt { 
  public static void main (String[] arg) {
    // Leta efter det sista vita tecknet i en text
    var scan = new Scanner(System.in);
    System.out.println("Skriv en text");
    String s = scan.nextLine();
    int i;
    for (i=s.length()-1; i>=0; i=i-1)
      if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
        break;
    if (i >= 0)
      System.out.println("Sista vita tecken finns på plats nr " + i);
    else
      System.out.println( "Inga vita tecken");  }
}
