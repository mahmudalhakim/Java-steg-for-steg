class Flerfamiljshus extends Bostadshus {
  int antalL�genheter;
  static final double hyraPerM2 = 2000;
  
  double ber�knadHyresinkomst() {
    return yta() * hyraPerM2;
  } 
  
  // Konstruktorer
  Flerfamiljshus() {}
  
  Flerfamiljshus(double l, double b, int v, 
                        boolean isol, int l�g) {
    super(l, b, v, isol);
    antalL�genheter = l�g;
  }
  
  @Override
  double yta() {
    return avl�sL�ngd() * avl�sBredd() * avl�sAntalV�ningar() * 0.95;
  } 
}