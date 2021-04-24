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
  double l�ngd;
  double bredd;
  int antalV�ningar;
  double yta() {
    return l�ngd * bredd * antalV�ningar;
  }
}

// Filen Skola.java
class Skola extends Hus {
  int antalKlassrum;
  
  double antalKlassrumPerV�n() {
    return (double) antalKlassrum / antalV�ningar;
  }
}


