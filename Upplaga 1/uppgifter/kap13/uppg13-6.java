// Filen Kort.java

public class Kort {
  // klassvariabler
  public static final int KL�VER  = 0;
  public static final int RUTER   = 1;
  public static final int HJ�RTER = 2;
  public static final int SPADER  = 3;

  // instansvariabler
  int f�rg;   
  int val�r;
}


// Filen KortTest.java

public class KortTest { 

  public static void main(String[] arg) {
    Kort k1 = new Kort();
    Kort k2 = new Kort();
    k1.f�rg = Kort.SPADER;
    k1.val�r = 12;
    k2.f�rg = Kort.KL�VER;
    k2.val�r = 7;  
  }
}

