// Rekommenderat filnamn: RatTalTest2.java

class RatTalTest2 {

  static RatTal förenkla (RatTal tal) {
    int m = tal.tälj; 
    int n = tal.nämn;
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    RatTal resultat = new RatTal();
    resultat.tälj = tal.tälj / n;
    resultat.nämn = tal.nämn / n;
    return resultat;
  }


  public static void main(String[] arg) { 
     RatTal r4 = new RatTal();
     RatTal r5 = new RatTal();
     r4.tälj = 5; r4.nämn = 15;
     r5.tälj = 8; r5.nämn = 12; 
     RatTal r6 = förenkla(r4);
     RatTal r7 = förenkla(r5); 
     System.out.println("r6 = " + r6.tälj + "/" + r6.nämn);
     System.out.println("r7 = " + r7.tälj + "/" + r7.nämn);   
  }
}

class RatTal {
  int tälj;   // täljaren
  int nämn;   // nämnaren
}
    
