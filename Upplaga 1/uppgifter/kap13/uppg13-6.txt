// Filen Kort.java

public class Kort {
  // klassvariabler
  public static final int KLÖVER  = 0;
  public static final int RUTER   = 1;
  public static final int HJÄRTER = 2;
  public static final int SPADER  = 3;

  // instansvariabler
  int färg;   
  int valör;
}


// Filen KortTest.java

public class KortTest { 

  public static void main(String[] arg) {
    Kort k1 = new Kort();
    Kort k2 = new Kort();
    k1.färg = Kort.SPADER;
    k1.valör = 12;
    k2.färg = Kort.KLÖVER;
    k2.valör = 7;  
  }
}

