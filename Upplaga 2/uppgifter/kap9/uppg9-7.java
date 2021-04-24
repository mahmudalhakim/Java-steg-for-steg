// Rekommenderat filnamn: Intervall.java

import java.util.*;

class Intervall {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Starttid (tt:mm)? ");
    String s = scan.nextLine();
    int i = s.indexOf(':');
    int tim1 = Integer.parseInt(s.substring(0,i));
    int min1 = Integer.parseInt(s.substring(i+1));
    int tid1 = tim1 * 60 + min1;
    System.out.print("Sluttid (tt:mm)? ");
    s = scan.nextLine();
    i = s.indexOf(':');
    int tim2 = Integer.parseInt(s.substring(0,i));
    int min2 = Integer.parseInt(s.substring(i+1));
    int tid2 = tim2 * 60 + min2;
    if (tid2 < tid1)
      tid2 += 60*24;
    System.out.println("Längd: " + (tid2-tid1) + " minuter"); 
  }
}