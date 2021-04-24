// Filen Kort.java

public class Kort {
  // klassvariabler
  public static final int KLÖVER  = 0;
  public static final int RUTER   = 1;
  public static final int HJÄRTER = 2;
  public static final int SPADER  = 3;
  static final String[] f = {"Klöver", "Ruter", "Hjärter", "Spader"};
  static final String[] v = {"ess", "två", "tre", "fyra", "fem", "sex", "sju",
                             "åtta", "nio", "tio", "knekt", "dam", "kung"};

  // instansvariabler
  int färg;   
  int valör;

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

  public void ändra(int nyFärg, int nyValör) {
    if (nyFärg>=0 && nyFärg<=3 && nyValör>=1 && nyValör<=13) {
      färg = nyFärg;
      valör = nyValör;
    }
    else
      throw new IllegalArgumentException("Felaktig kort");
  }
    
}

