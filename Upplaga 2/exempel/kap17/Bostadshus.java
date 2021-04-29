class Bostadshus extends Hus {
  boolean tilläggsisolerat;
  
  // Konstruktorer
  Bostadshus(boolean isol) {
    tilläggsisolerat = isol;
  }
  
  Bostadshus() {
     tilläggsisolerat=true;
  }
  
  Bostadshus(double l, double b, int v, boolean isol) {
    super(l, b, v);
    tilläggsisolerat = isol;
  }
  
  // Instansmetoder
  void isolera() {
    tilläggsisolerat = true;
  }
}