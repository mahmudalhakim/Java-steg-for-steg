// Filen RatTal.java

public class RatTal {
  int tälj;   // täljaren
  int nämn;   // nämnaren

  public void multipliceraMed(RatTal r) {
    tälj = tälj * r.tälj;
    nämn = nämn * r.nämn;
    förenkla();
  }

  public void läggTill(RatTal r) {
    tälj = tälj * r.nämn + r.tälj * nämn;
    nämn = nämn * r.nämn;
    förenkla();
  }

  public void förenkla () {
    int m = tälj; 
    int n = nämn;
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    tälj = tälj / n;
    nämn = nämn / n;
  }

}

