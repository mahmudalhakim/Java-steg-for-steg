// Rekommenderat filnamn: Kort.java

class Kort implements Comparable<Kort> {
  // klassvariabler
  static final int KL�VER  = 0;
  static final int RUTER   = 1;
  static final int HJ�RTER = 2;
  static final int SPADER  = 3;
  static final String[] f = {"Kl�ver", "Ruter", "Hj�rter", "Spader"};
  static final String[] v = {"ess", "tv�", "tre", "fyra", "fem", "sex", "sju",
                             "�tta", "nio", "tio", "knekt", "dam", "kung"};

  // instansvariabler
  int f�rg;   
  int val�r;
  
  public int compareTo(Kort k) {
    if (f�rg > k.f�rg)
      return 1;
    else if (f�rg < k.f�rg)
      return -1;
    else       // samma f�rg
      if (val�r == k.val�r)
        return 0;
	  else if (k.val�r == 1)    // Ess �r h�gst
	    return -1;
      else if (val�r == 1 || val�r > k.val�r) 
        return 1;
      else
        return -1;
  }

  @Override
  public String toString() {
    return f[f�rg] + " " + v[val�r-1];
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj == null || obj.getClass() != getClass())
      return false;
    else {
      Kort k = (Kort) obj;
      return k.f�rg == f�rg && k.val�r == val�r;
    }
  }	

  void �ndra(int nyF�rg, int nyVal�r) {
    if (nyF�rg>=0 && nyF�rg<=3 && nyVal�r>=1 && nyVal�r<=13) {
      f�rg = nyF�rg;
      val�r = nyVal�r;
    }
    else
      throw new IllegalArgumentException("Felaktig kort");
  } 
    
}

