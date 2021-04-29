class Cirkel {
  // instansvariabler
  double x, y;     // mittpunktens koordinater
  double radie;
  // instansmetoder  
  void sättRadie(double r) {  // ändrar radien  
    if (r >= 0)
      radie = r;
    else
      throw new IllegalArgumentException("Negativ radie");
  }
  double area() {             // beräknar arean
    return Math.PI * radie * radie;
  }
  double omkr() {             // beräknar omkretsen
    return 2 * Math.PI * radie;
  }
}