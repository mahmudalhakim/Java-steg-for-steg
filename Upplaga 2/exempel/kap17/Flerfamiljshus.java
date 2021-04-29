class Flerfamiljshus extends Bostadshus {
  int antalLägenheter;
  static final double hyraPerM2 = 2000;
  
  double beräknadHyresinkomst() {
    return yta() * hyraPerM2;
  } 
  
  // Konstruktorer
  Flerfamiljshus() {}
  
  Flerfamiljshus(double l, double b, int v, 
                        boolean isol, int läg) {
    super(l, b, v, isol);
    antalLägenheter = läg;
  }
  
  @Override
  double yta() {
    return avläsLängd() * avläsBredd() * avläsAntalVåningar() * 0.95;
  } 
}