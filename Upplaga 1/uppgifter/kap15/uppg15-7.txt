// Filen RatTal.java

public class RatTal {
  int tälj;   // täljaren
  int nämn;   // nämnaren

  public void multipliceraMed(RatTal r) {
    tälj = tälj * r.tälj;
    nämn = nämn * r.nämn;
  }

  public void läggTill(RatTal r) {
    tälj = tälj * r.nämn + r.tälj * nämn;
    nämn = nämn * r.nämn;
  }

}

