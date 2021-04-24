// Rekommenderat filnamn: Rektangel.java

class Rektangel {
  // instansvariabler 
  double x, y;     // startpunktens koordinater
  double b, h;     // bredd och h�jd

  // instansmetoder  
  void s�ttBredd(double br) {  // �ndrar radien  
    if (br >= 0)
      b = br;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }

  void s�ttH�jd(double h�) {  // �ndrar h�jden  
    if (h� >= 0)
      h = h�;
    else
      throw new IllegalArgumentException("Negativ h�jd");
  }

  double area() {             // ber�knar arean
    return b * h;
  }

  double omkr() {             // ber�knar omkretsen
    return 2 * b + 2 * h;
  }
}
