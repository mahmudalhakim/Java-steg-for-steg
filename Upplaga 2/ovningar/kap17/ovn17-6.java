// Filen HusTest.java
 class HusTest {
  public static void main(String[] arg) {	
	Skola s2 = new Skola();
	Skola s3 = new Skola(25, 18, 3, 20);
  }
}

// Filen Hus.java
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

// Filen Skola.java
class Skola extends Hus {
  private int antalKlassrum;
  
   Skola() {}   // defaultkonstruktor
  
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


 