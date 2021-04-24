// Rekommenderat filnamn:  RektangelProg.java

import java.util.*;
class RektangelProg {
  public static void main(String[] arg) {
    Rektangel r = new Rektangel();
    var scan = new Scanner(System.in);
    while (true) {
      System.out.print("Ange rektangelns bredd och h�jd: ");
      if (!scan.hasNextDouble()) 
        break;
      r.s�ttBredd(scan.nextDouble());
      r.s�ttH�jd(scan.nextDouble());
      System.out.format("Rektangeln har arean %.3f " + "och omkretsen %.3f\n", 
                         r.area(), r.omkr());
    }
  }
}
