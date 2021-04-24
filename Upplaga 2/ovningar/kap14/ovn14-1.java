// Rekommenderat filnamn: Rektangel.java

class Rektangel {
  // instansvariabler 
  double x, y;     // startpunktens koordinater
  double b, h;     // bredd och höjd

  // instansmetoder  
  void sättBredd(double br) {  // ändrar radien  
    if (br >= 0)
      b = br;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }

  void sättHöjd(double hö) {  // ändrar höjden  
    if (hö >= 0)
      h = hö;
    else
      throw new IllegalArgumentException("Negativ höjd");
  }

  double area() {             // beräknar arean
    return b * h;
  }

  double omkr() {             // beräknar omkretsen
    return 2 * b + 2 * h;
  }
}
