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

// Filen Bostadshus.java
  abstract class Bostadshus extends Hus {
  boolean tilläggsisolerat;
  
  // Konstruktoer
  Bostadshus(boolean isol) {
    tilläggsisolerat=isol;
  }
  
  Bostadshus() {
     tilläggsisolerat=true;
  }
  
  Bostadshus(double l, double b, int v, boolean isol) {
    super(l, b, v);
    tilläggsisolerat=isol;
  }
  
  // Instansmetoder
  void isolera() {
    tilläggsisolerat = true;
  }
}

// Filen Flerfamiljshus.java
  class Flerfamiljshus extends Bostadshus {
  int antalLägenheter;
  static final double hyraPerM2 = 2000;
  
    // Konstruktorer
  Flerfamiljshus() {}
  Flerfamiljshus(double l, double b, int v, 
                        boolean isol, int läg) {
    super(l, b, v, isol);
    antalLägenheter = läg;
  }
  
  double beräknadHyresinkomst() {
    return yta() * hyraPerM2;
  } 
  
  @Override
  double yta() {
    return avläsLängd() * avläsBredd() * avläsAntalVåningar() * 0.95;
  } 
}

// Filen Skola.java
class Skola extends Hus {
  private int antalKlassrum;
  
  Skola() {}   // defaultkonstruktor, okänd storlek
  
  Skola(int l, int b, int v, int k) {
    super(l, b, v);
	sättAntalKlassrum(k);
  }
  
  void sättAntalKlassrum(int k) {
    if (k > 0)
	  antalKlassrum = k;
    else
      throw new IllegalArgumentException("Fel antal klassrum");	
  }
  
  int avläsAntalKlassrum() {
    return antalKlassrum;
  }
  
  double antalKlassrumPerVån() {
    return (double) antalKlassrum / avläsAntalVåningar();
  }
  
  @Override
  double yta() {
    return antalKlassrum * 50;
  }
}