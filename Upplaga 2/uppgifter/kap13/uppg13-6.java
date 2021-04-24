// Rekommenderat filnamn: KortTest.java

class KortTest { 

  public static void main(String[] arg) {
    Kort k1 = new Kort();
    Kort k2 = new Kort();
    k1.f�rg = Kort.SPADER;
    k1.val�r = 12;
    k2.f�rg = Kort.KL�VER;
    k2.val�r = 7;  
  }
}

class Kort {
  // klassvariabler
  static final int KL�VER  = 0;
  static final int RUTER   = 1;
  static final int HJ�RTER = 2;
  static final int SPADER  = 3;

  // instansvariabler
  int f�rg;   
  int val�r;
}

