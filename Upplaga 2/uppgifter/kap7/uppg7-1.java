// Rekommenderat filnamn: DemoAvFel2.java

import java.util.*;

class DemoAvFel2 {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Ett tal? ");
    String t = scan.nextLine();
    int i;
    for (i=0; i<t.length(); i++)
      if (t.charAt(i) < '0' ||  t.charAt(i) > '9')
        break;
    if (i < t.length())
      System.out.println("Inget tal"); 
    else       
      System.out.println("Talet är OK"); 
  }
}