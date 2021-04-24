// Filen HusTest.java
class HusTest {
  public static void main(String[] arg) {
    Hus h = new Hus();
	Skola s = new Skola();
	h.bredd = 15;          // OK
	s.bredd = 15;          // OK
	//h.antalKlassrum = 15;  // Fel, ingen skola
	s.antalKlassrum = 15;  // OK	
  }
}

// Filen Hus.java
class Hus {
  double längd;
  double bredd;
  int antalVåningar;
  double yta() {
    return längd * bredd * antalVåningar;
  }
}

// Filen Skola.java
class Skola extends Hus {
  int antalKlassrum;
  
  double antalKlassrumPerVån() {
    return (double) antalKlassrum / antalVåningar;
  }
}


