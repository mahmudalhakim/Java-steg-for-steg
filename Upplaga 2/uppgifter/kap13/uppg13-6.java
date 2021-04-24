// Rekommenderat filnamn: KortTest.java

class KortTest { 

  public static void main(String[] arg) {
    Kort k1 = new Kort();
    Kort k2 = new Kort();
    k1.färg = Kort.SPADER;
    k1.valör = 12;
    k2.färg = Kort.KLÖVER;
    k2.valör = 7;  
  }
}

class Kort {
  // klassvariabler
  static final int KLÖVER  = 0;
  static final int RUTER   = 1;
  static final int HJÄRTER = 2;
  static final int SPADER  = 3;

  // instansvariabler
  int färg;   
  int valör;
}

