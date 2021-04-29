class Hus {
  private double l�ngd;
  private double bredd;
  private int antalV�ningar; 
  
  // Konstruktorer
  Hus() {} 
  
  Hus(double l, double b, int v) {
    s�ttL�ngd(l); s�ttBredd(b); s�ttAntalV�ningar(v);
  } 
  
  // Instansmetoder
  void s�ttL�ngd(double l) {
    if (l > 0)
      l�ngd = l;
    else
      throw new IllegalArgumentException("Negativ l�ngd");
  }
  
  void s�ttBredd(double b) {
    if (b > 0)
      bredd = b;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }
  
  void s�ttAntalV�ningar(int v) {
    if (v > 0)
      antalV�ningar = v;
    else
      throw new IllegalArgumentException("Fel v�ningar");
  }
  
  double avl�sL�ngd() {
    return l�ngd;
  }
  
  double avl�sBredd() {
    return bredd;
  }
  
  int avl�sAntalV�ningar() {
    return antalV�ningar;
  }
  
  double yta() {
    return l�ngd * bredd * antalV�ningar;
  }
}