// Filen Hus.java
public class Hus {
  private double längd;
  private double bredd;
  private int antalVåningar;
  
  // Konstruktorer
  public Hus() {}
  public Hus(double l, double b, int v) {
    sättLängd(l); sättBredd(b); sättAntalVåningar(v);
  } 
  
  // Instansmetoder
  public void sättLängd(double l) {
    if (l > 0)
      längd = l;
    else
      throw new IllegalArgumentException("Negativ längd");
  }
  
  public void sättBredd(double b) {
    if (b > 0)
      bredd = b;
    else
      throw new IllegalArgumentException("Negativ bredd");
  }
  
  public void sättAntalVåningar(int v) {
    if (v > 0)
      antalVåningar = v;
    else
      throw new IllegalArgumentException("Fel våningar");
  }
  
  public double avläsLängd() {
    return längd;
  }
  public double avläsBredd() {
    return bredd;
  }
  
  public int avläsAntalVåningar() {
    return antalVåningar;
  }
  
  public double yta() {
    return längd * bredd * antalVåningar;
  }
}

// Filen Skola.java
public class Skola extends Hus {
  private int antalKlassrum;
  
  public Skola() {}   // defaultkonstruktor
  
  public Skola(int l, int b, int v, int k) {
    super(l, b, v);
	sättAntalKlassrum(k);
  }
  
  public void sättAntalKlassrum(int k) {
    if (k > 0)
	  antalKlassrum = k;
    else
      throw new IllegalArgumentException("Fel antal klassrum");	
  }
  
  public int avläsAntalKlassrum() {
    return antalKlassrum;
  }
  
  public double antalKlassrumPerVån() {
    return (double) antalKlassrum / avläsAntalVåningar();
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
 