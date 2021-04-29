class Hus {
  private double längd;
  private double bredd;
  private int antalVåningar; 
  
  // Konstruktorer
  Hus() {} 
  
  Hus(double l, double b, int v) {
    sättLängd(l); sättBredd(b); sättAntalVåningar(v);
  } 
  
  // Instansmetoder
  void sättLängd(double l) {
    if (l > 0)
      längd = l;
    else
      throw new IllegalArgumentException("Negativ längd");
  }
  
  void sättBredd(double b) {
    if (b > 0)
      bredd = b;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }
  
  void sättAntalVåningar(int v) {
    if (v > 0)
      antalVåningar = v;
    else
      throw new IllegalArgumentException("Fel våningar");
  }
  
  double avläsLängd() {
    return längd;
  }
  
  double avläsBredd() {
    return bredd;
  }
  
  int avläsAntalVåningar() {
    return antalVåningar;
  }
  
  double yta() {
    return längd * bredd * antalVåningar;
  }
}