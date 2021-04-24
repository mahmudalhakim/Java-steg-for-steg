// Rekommenderat filnamn: RatTalTest2.java

class RatTalTest2 {

  static RatTal f�renkla (RatTal tal) {
    int m = tal.t�lj; 
    int n = tal.n�mn;
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    RatTal resultat = new RatTal();
    resultat.t�lj = tal.t�lj / n;
    resultat.n�mn = tal.n�mn / n;
    return resultat;
  }


  public static void main(String[] arg) { 
     RatTal r4 = new RatTal();
     RatTal r5 = new RatTal();
     r4.t�lj = 5; r4.n�mn = 15;
     r5.t�lj = 8; r5.n�mn = 12; 
     RatTal r6 = f�renkla(r4);
     RatTal r7 = f�renkla(r5); 
     System.out.println("r6 = " + r6.t�lj + "/" + r6.n�mn);
     System.out.println("r7 = " + r7.t�lj + "/" + r7.n�mn);   
  }
}

class RatTal {
  int t�lj;   // t�ljaren
  int n�mn;   // n�mnaren
}
    
