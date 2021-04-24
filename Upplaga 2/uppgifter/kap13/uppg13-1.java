// Rekommenderat filnamn: BokTest.java

class BokTest {

  public static void main(String[] arg) {
    Bok b1 = new Bok();
    b1.titel = "Java - steg f�r steg";
    b1.f�rfattare = "Jan Skansholm";
    b1.antalSidor = 483;
    b1.pris = 400;

    Bok b2 = new Bok();
    b2.titel = "Portugisisk-Svensk ordbok";
    b2.f�rfattare = "Alexander Fernandes";
    b2.antalSidor = 367;
    b2.pris = 424;

    System.out.format("%s, %s, %1d sidor, %1.2f kr\n", 
                      b1.titel, b1.f�rfattare, b1.antalSidor, b1.pris);
    System.out.format("%s, %s, %1d sidor, %1.2f kr\n", 
                      b2.titel, b2.f�rfattare, b2.antalSidor, b2.pris);
  }
}

class Bok {
  String titel;
  String f�rfattare;
  int antalSidor;
  double pris;
}


