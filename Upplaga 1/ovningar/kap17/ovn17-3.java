// Filen HusTest.java

public class HusTest {
  public static void main(String[] arg) {
    Hus h = new Hus();
	Skola s = new Skola();
	h.bredd = 15;          // OK
	s.bredd = 15;          // OK
//	h.antalKlassrum = 15;  // Fel, ingen skola
	s.antalKlassrum = 15;  // OK
    Hus hh = new Skola();  // OK, en Skola �r alltid ett Hus
//  Skola ss = new Hus();  // Fel, ett Hus beh�ver inte vara en Skola
	h.l�ngd = 20; h.bredd = 15; h.antalV�ningar = 2;
	s.l�ngd = 20; s.bredd = 15; s.antalV�ningar = 2;
	s.antalKlassrum = 10;
	Hus h1 = h;
	Hus h2 = s;
	System.out.println(h1.yta());   // Skriver ut: 600.0
	System.out.println(h2.yta());   // Skriver ut: 500.0	
  }
}