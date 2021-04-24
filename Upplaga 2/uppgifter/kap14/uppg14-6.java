// Rekommenderat filnamn: Raknare.java

class Raknare {
  int värde, min, max; 

  void init(int minsta, int största) {
    min = minsta;
    max = största;
  }

  void öka() {
    if (värde < max)
      värde++;
    else
      throw new IllegalStateException("För stort värde i räknare");
  }

  void minska() {
    if (värde > min)
      värde--;
    else
      throw new IllegalStateException("För litet värde i räknare");
  }
}

