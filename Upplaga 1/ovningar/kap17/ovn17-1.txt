// Filen Hus.java
public class Hus {
  double längd;
  double bredd;
  int antalVåningar;
  public double yta() {
    return längd * bredd * antalVåningar;
  }
}

// Filen Skola.java
public class Skola extends Hus {
  int antalKlassrum;
  
  public double antalKlassrumPerVån() {
    return (double) antalKlassrum / antalVåningar;
  }
}

// Filen HusTest.java
public class HusTest {
  public static void main(String[] arg) {
    Hus h = new Hus();
	Skola s = new Skola();
	h.bredd = 15;          // OK
	s.bredd = 15;          // OK
	h.antalKlassrum = 15;  // Fel, ingen skola
	s.antalKlassrum = 15;  // OK	
  }
}
