// Filen HusTest.java
 class HusTest {
  public static void main(String[] arg) {	
	Skola s2 = new Skola();
	Skola s3 = new Skola(25, 18, 3, 20);
  }
}

// Filen Hus.java
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

// Filen Skola.java
class Skola extends Hus {
  private int antalKlassrum;
  
   Skola() {}   // defaultkonstruktor
  
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


 