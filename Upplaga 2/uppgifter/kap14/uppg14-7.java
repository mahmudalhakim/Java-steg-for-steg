// Rekommenderat filnamn: RatTal.java

class RatTal {
  int tälj;   // täljaren
  int nämn;   // nämnaren

  void multipliceraMed(RatTal r) {
    tälj = tälj * r.tälj;
    nämn = nämn * r.nämn;
  }

  void läggTill(RatTal r) {
    tälj = tälj * r.nämn + r.tälj * nämn;
    nämn = nämn * r.nämn;
  }

}

