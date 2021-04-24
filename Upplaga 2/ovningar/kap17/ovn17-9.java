// Filen HusTest.java
class HusTest {
  public static void main(String[] arg) {
	Hus[] a = new Hus[20];
	a[0] = new Hus(15, 9, 1);                // FEL! Abstrakt klass
	a[1] = new Skola(25, 18, 3, 20);
	a[2] = new Bostadshus(10, 6, 1, true);   // FEL! Abstrakt klass
	a[3] = new Flerfamiljshus(30, 20, 4, true, 20);
	for (Hus h : a) 
	  if (h != null)
	    System.out.println(h.yta());
  }
}

// Filen Hus.java
abstract class Hus {
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

// Filen Bostadshus.java
  abstract class Bostadshus extends Hus {
  boolean till�ggsisolerat;
  
  // Konstruktoer
  Bostadshus(boolean isol) {
    till�ggsisolerat=isol;
  }
  
  Bostadshus() {
     till�ggsisolerat=true;
  }
  
  Bostadshus(double l, double b, int v, boolean isol) {
    super(l, b, v);
    till�ggsisolerat=isol;
  }
  
  // Instansmetoder
  void isolera() {
    till�ggsisolerat = true;
  }
}

// Filen Flerfamiljshus.java
  class Flerfamiljshus extends Bostadshus {
  int antalL�genheter;
  static final double hyraPerM2 = 2000;
  
    // Konstruktorer
  Flerfamiljshus() {}
  Flerfamiljshus(double l, double b, int v, 
                        boolean isol, int l�g) {
    super(l, b, v, isol);
    antalL�genheter = l�g;
  }
  
  double ber�knadHyresinkomst() {
    return yta() * hyraPerM2;
  } 
  
  @Override
  double yta() {
    return avl�sL�ngd() * avl�sBredd() * avl�sAntalV�ningar() * 0.95;
  } 
}

// Filen Skola.java
class Skola extends Hus {
  private int antalKlassrum;
  
  Skola() {}   // defaultkonstruktor, ok�nd storlek
  
  Skola(int l, int b, int v, int k) {
    super(l, b, v);
	s�ttAntalKlassrum(k);
  }
  
  void s�ttAntalKlassrum(int k) {
    if (k > 0)
	  antalKlassrum = k;
    else
      throw new IllegalArgumentException("Fel antal klassrum");	
  }
  
  int avl�sAntalKlassrum() {
    return antalKlassrum;
  }
  
  double antalKlassrumPerV�n() {
    return (double) antalKlassrum / avl�sAntalV�ningar();
  }
  
  @Override
  double yta() {
    return antalKlassrum * 50;
  }
}