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


// Filen Kortbunt.java

public class Kortbunt {
  Kort[] bunten = new Kort[52];
  int antal;
}


// Filen KortTest2.java

public class KortTest2 { 

  public static void main(String[] arg) {
    Kortbunt b1 = new Kortbunt();
    int i, val;
    for (val=1, i=0; val<=13; val++, i++) {
      b1.bunten[i] = new Kort();
      b1.bunten[i].f�rg = Kort.KL�VER;
      b1.bunten[i].val�r = val;
      b1.antal++;
    }

    Kortbunt b2 = new Kortbunt();
    int f;
    for (f=Kort.HJ�RTER, i=0; f<=Kort.SPADER; f++) {
      for (val=11; val<=13; val++, i++) {
        b2.bunten[i] = new Kort();
        b2.bunten[i].f�rg = f;
        b2.bunten[i].val�r = val;
        b2.antal++;
      }
    }
	
	// Testutskrift
	String [] fnamn = {"Kl", "Ru", "Hj", "Sp"};
	System.out.println("Bunt 1:");
	for (int j=0; j<b1.antal; j++) 
	  System.out.println(fnamn[b1.bunten[j].f�rg] + b1.bunten[j].val�r);
    System.out.println("Bunt 2:");
	for (int j=0; j<b2.antal; j++) 
	  System.out.println(fnamn[b2.bunten[j].f�rg] + b2.bunten[j].val�r);
  }
}

