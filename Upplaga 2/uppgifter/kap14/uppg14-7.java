// Rekommenderat filnamn: RatTal.java

class RatTal {
  int t�lj;   // t�ljaren
  int n�mn;   // n�mnaren

  void multipliceraMed(RatTal r) {
    t�lj = t�lj * r.t�lj;
    n�mn = n�mn * r.n�mn;
  }

  void l�ggTill(RatTal r) {
    t�lj = t�lj * r.n�mn + r.t�lj * n�mn;
    n�mn = n�mn * r.n�mn;
  }

}

