// Filen Kort.java

// Metoden ändra har ersatts av en konstruktor, 
// instansvariablerna och fälten f och v har gjorts privata.
// Nya metoder avläsFärg och avläsValör har lagts till.

public class Kort implements Comparable<Kort>{
  // klassvariabler
  public static final int KLÖVER  = 0;
  public static final int RUTER   = 1;
  public static final int HJÄRTER = 2;
  public static final int SPADER  = 3;
  private static final String[] f = {"Klöver", "Ruter", "Hjärter", "Spader"};
  private static final String[] v = {"ess", "två", "tre", "fyra", "fem", "sex", "sju",
                                     "åtta", "nio", "tio", "knekt", "dam", "kung"};

  // instansvariabler
  private int färg;   
  private int valör;

  public Kort(int nyFärg, int nyValör) {
    if (nyFärg>=0 && nyFärg<=3 && nyValör>=1 && nyValör<=13) {
      färg = nyFärg;
      valör = nyValör;
    }
    else
      throw new IllegalArgumentException("Felaktig kort");
  }

  public int avläsFärg() {
    return färg;
  }

  public int avläsValör() {
    return valör;
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

