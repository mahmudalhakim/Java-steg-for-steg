class Bostadshus extends Hus {
  boolean till�ggsisolerat;
  
  // Konstruktorer
  Bostadshus(boolean isol) {
    till�ggsisolerat = isol;
  }
  
  Bostadshus() {
     till�ggsisolerat=true;
  }
  
  Bostadshus(double l, double b, int v, boolean isol) {
    super(l, b, v);
    till�ggsisolerat = isol;
  }
  
  // Instansmetoder
  void isolera() {
    till�ggsisolerat = true;
  }
}