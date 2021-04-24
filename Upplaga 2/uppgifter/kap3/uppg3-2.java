// Rekommenderat filnamn: Temperatur.java

import java.util.*;

class Temperatur {
  public static void main(String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Temperatur i Fahrenheit? ");
    double f = scan.nextDouble();
    double c = (f-32)*5/9;
    System.out.println("Motsvarar " + c + " grader C");
  }
}
            
