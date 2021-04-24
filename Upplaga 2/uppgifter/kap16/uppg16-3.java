// Rekommenderat filnamn: Kort.java

// Metoden ändra har ersatts av en konstruktor, 
// instansvariablerna och fälten f och v har gjorts privata.
// Nya metoder avläsFärg och avläsValör har lagts till.

class Kort implements Comparable<Kort>{
  // klassvariabler
  static final int KLÖVER  = 0;
  static final int RUTER   = 1;
  static final int HJÄRTER = 2;
  static final int SPADER  = 3;
  private static final String[] f = {"Klöver", "Ruter", "Hjärter", "Spader"};
  private static final String[] v = {"ess", "två", "tre", "fyra", "fem", "sex", "sju",
                                     "åtta", "nio", "tio", "knekt", "dam", "kung"};

  // instansvariabler
  private int färg;   
  private int valör;

  Kort(int nyFärg, int nyValör) {
    if (nyFärg>=0 && nyFärg<=3 && nyValör>=1 && nyValör<=13) {
      färg = nyFärg;
      valör = nyValör;
    }
    else
      throw new IllegalArgumentException("Felaktig kort");
  }

  int avläsFärg() {
    return färg;
  }

  int avläsValör() {
    return valör;
  } 
  
  public int compareTo(Kort k) {
    if (färg > k.färg)
      return 1;
    else if (färg < k.färg)
      return -1;
    else       // samma färg
      if (valör == k.valör)
        return 0;
	  else if (k.valör == 1)    // Ess är högst
	    return -1;
      else if (valör == 1 || valör > k.valör) 
        return 1;
      else
        return -1;
  } 

  @Override
  public String toString() {
    return f[färg] + " " + v[valör-1];
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj == null || obj.getClass() != getClass())
      return false;
    else {
      Kort k = (Kort) obj;
      return k.färg == färg && k.valör == valör;
    }
  }
    
}

