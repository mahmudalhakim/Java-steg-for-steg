// Rekommenderat filnamn:  RektangelProg.java

import java.util.*;
class RektangelProg {
  public static void main(String[] arg) {
    Rektangel r = new Rektangel();
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Ange rektangelns bredd och höjd: ");
      if (!scan.hasNextDouble()) 
        break;
      r.sättBredd(scan.nextDouble());
      r.sättHöjd(scan.nextDouble());
      System.out.format("Rektangeln har arean %.3f " + "och omkretsen %.3f\n", 
                         r.area(), r.omkr());
    }
  }
}
