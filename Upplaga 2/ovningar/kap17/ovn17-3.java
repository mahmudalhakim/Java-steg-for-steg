// Filen HusTest.java

class HusTest {
  public static void main(String[] arg) {
    Hus h = new Hus();
	 Skola s = new Skola();
	 h.bredd = 15;          // OK
	 s.bredd = 15;          // OK
//	 h.antalKlassrum = 15;  // Fel, ingen skola
	 s.antalKlassrum = 15;  // OK
    Hus hh = new Skola();  // OK, en Skola är alltid ett Hus
//  Skola ss = new Hus();  // Fel, ett Hus behöver inte vara en Skola
  }
}