// Filen RatTal.java

public class RatTal {
  int t�lj;   // t�ljaren
  int n�mn;   // n�mnaren

  public void multipliceraMed(RatTal r) {
    t�lj = t�lj * r.t�lj;
    n�mn = n�mn * r.n�mn;
  }

  public void l�ggTill(RatTal r) {
    t�lj = t�lj * r.n�mn + r.t�lj * n�mn;
    n�mn = n�mn * r.n�mn;
  }

}

