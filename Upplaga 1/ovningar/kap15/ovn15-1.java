// Filen Rektangel.java

public class Rektangel {
  // instansvariabler 
  double x, y;     // startpunktens koordinater
  double b, h;     // bredd och h�jd

  // instansmetoder  
  public void s�ttBredd(double br) {  // �ndrar radien  
    if (br >= 0)
      b = br;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }

  public void s�ttH�jd(double h�) {  // �ndrar h�jden  
    if (h� >= 0)
      h = h�;
    else
      throw new IllegalArgumentException("Negativ h�jd");
  }

  public double area() {             // ber�knar arean
    return b * h;
  }

  public double omkr() {             // ber�knar omkretsen
    return 2 * b + 2 * h;
  }
}
