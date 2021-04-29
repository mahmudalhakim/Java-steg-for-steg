class Cirkel {
  // instansvariabler
  double x, y;     // mittpunktens koordinater
  double radie;
  // instansmetoder  
  void s�ttRadie(double r) {  // �ndrar radien  
    if (r >= 0)
      radie = r;
    else
      throw new IllegalArgumentException("Negativ radie");
  }
  double area() {             // ber�knar arean
    return Math.PI * radie * radie;
  }
  double omkr() {             // ber�knar omkretsen
    return 2 * Math.PI * radie;
  }
}