// Rekommenderat filnamn: Temperatur.java

import java.util.*;

class Temperatur {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Måndag?  ");
    double temp = scan.nextDouble();
    double maxtemp = temp;
    System.out.print("Tisdag?  ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.print("Onsdag?  ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.print("Torsdag? ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.print("Fredag?  ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.print("Lördag?  ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.print("Söndag?  ");
    temp = scan.nextDouble();
    maxtemp = Math.max(maxtemp, temp);
    System.out.println("Högsta temperatur: " + maxtemp);
  }
}
