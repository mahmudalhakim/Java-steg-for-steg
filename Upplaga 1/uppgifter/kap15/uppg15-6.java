// Filen Raknare.java

public class Raknare {
  int värde, min, max; 

  public void init(int minsta, int största) {
    min = minsta;
    max = största;
  }

  public void öka() {
    if (värde < max)
      värde++;
    else
      throw new IllegalStateException("För stort värde i räknare");
  }

  public void minska() {
    if (värde > min)
      värde--;
    else
      throw new IllegalStateException("För litet värde i räknare");
  }
}

