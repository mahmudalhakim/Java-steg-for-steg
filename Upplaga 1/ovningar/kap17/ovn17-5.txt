// Filen HusTest.java
public class HusTest {
  public static void main(String[] arg) {
	Hus[] a = new Hus[20];
	a[0] = new Hus(15, 9, 1);
	a[1] = new Skola(25, 18, 3, 20);
	a[2] = new Bostadshus(10, 6, 1, true);
	a[3] = new Flerfamiljshus(30, 20, 4, true, 20);
	for (Hus h : a) 
	  if (h != null)
	    System.out.println(h.yta());
  }
}

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

// Filen Bostadshus.java
public class Bostadshus extends Hus {
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
  public void isolera() {
    tilläggsisolerat = true;
  }
}

// Filen Flerfamiljshus.java
public class Flerfamiljshus extends Bostadshus {
  int antalLägenheter;
  public static final double hyraPerM2 = 2000;
  
    // Konstruktorer
  public Flerfamiljshus() {}
  public Flerfamiljshus(double l, double b, int v, 
                        boolean isol, int läg) {
    super(l, b, v, isol);
    antalLägenheter = läg;
  }
  
  public double beräknadHyresinkomst() {
    return yta() * hyraPerM2;
  } 
  
  @Override
  public double yta() {
    return avläsLängd() * avläsBredd() * avläsAntalVåningar() * 0.95;
  } 
}

// Filen Skola.java
public class Skola extends Hus {
  private int antalKlassrum;
  
  public Skola() {}   // defaultkonstruktor, okänd storlek
  
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


