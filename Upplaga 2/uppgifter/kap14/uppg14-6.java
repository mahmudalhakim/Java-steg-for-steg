// Rekommenderat filnamn: Raknare.java

class Raknare {
  int v�rde, min, max; 

  void init(int minsta, int st�rsta) {
    min = minsta;
    max = st�rsta;
  }

  void �ka() {
    if (v�rde < max)
      v�rde++;
    else
      throw new IllegalStateException("F�r stort v�rde i r�knare");
  }

  void minska() {
    if (v�rde > min)
      v�rde--;
    else
      throw new IllegalStateException("F�r litet v�rde i r�knare");
  }
}

