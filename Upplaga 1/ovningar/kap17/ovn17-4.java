// Filen Hus.java
public class Hus {
  private double l�ngd;
  private double bredd;
  private int antalV�ningar;
  
  // Konstruktorer
  public Hus() {}
  public Hus(double l, double b, int v) {
    s�ttL�ngd(l); s�ttBredd(b); s�ttAntalV�ningar(v);
  } 
  
  // Instansmetoder
  public void s�ttL�ngd(double l) {
    if (l > 0)
      l�ngd = l;
    else
      throw new IllegalArgumentException("Negativ l�ngd");
  }
  
  public void s�ttBredd(double b) {
    if (b > 0)
      bredd = b;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }
  
  public void s�ttAntalV�ningar(int v) {
    if (v > 0)
      antalV�ningar = v;
    else
      throw new IllegalArgumentException("Fel v�ningar");
  }
  
  public double avl�sL�ngd() {
    return l�ngd;
  }
  public double avl�sBredd() {
    return bredd;
  }
  
  public int avl�sAntalV�ningar() {
    return antalV�ningar;
  }
  
  public double yta() {
    return l�ngd * bredd * antalV�ningar;
  }
}

// Filen Skola.java
public class Skola extends Hus {
  private int antalKlassrum;
  
  public Skola() {}   // defaultkonstruktor
  
  public Skola(int l, int b, int v, int k) {
    super(l, b, v);
	s�ttAntalKlassrum(k);
  }
  
  public void s�ttAntalKlassrum(int k) {
    if (k > 0)
	  antalKlassrum = k;
    else
      throw new IllegalArgumentException("Fel antal klassrum");	
  }
  
  public int avl�sAntalKlassrum() {
    return antalKlassrum;
  }
  
  public double antalKlassrumPerV�n() {
    return (double) antalKlassrum / avl�sAntalV�ningar();
  }
  
  @Override
  public double yta() {
    return antalKlassrum * 50;
  }
}

// Filen HusTest.java
public class HusTest {
  public static void main(String[] arg) {	
	Skola s2 = new Skola();
	Skola s3 = new Skola(25, 18, 3, 20);
  }
}
 