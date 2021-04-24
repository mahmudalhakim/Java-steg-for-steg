// Filen RatTal.java

public class RatTal {
  int t�lj;   // t�ljaren
  int n�mn;   // n�mnaren

  public void multipliceraMed(RatTal r) {
    t�lj = t�lj * r.t�lj;
    n�mn = n�mn * r.n�mn;
    f�renkla();
  }

  public void l�ggTill(RatTal r) {
    t�lj = t�lj * r.n�mn + r.t�lj * n�mn;
    n�mn = n�mn * r.n�mn;
    f�renkla();
  }

  public void f�renkla () {
    int m = t�lj; 
    int n = n�mn;
    int r;
    while (true) {
      r = m % n;
      if (r == 0)
        break;
      m = n;
      n = r;   
    }
    t�lj = t�lj / n;
    n�mn = n�mn / n;
  }

}

