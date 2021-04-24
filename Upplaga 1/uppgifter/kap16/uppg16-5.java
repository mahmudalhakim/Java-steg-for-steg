// Filen Raknare.java

// Instansvariablerna har gjorts privata.
// Metoden init har ersatts av en konstruktor, vilken också får startvärdet som parameter.
// Metoderna sättVärde och avläsVärde har lagts till.
// Kontroll av det nya värdet sker i sättVärde. 
// sättVärde anropas från konstruktorn samt från metoderna öka och minska.

public class Raknare {
  private int värde, min, max;

  public Raknare(int minsta, int största, int startvärde) {
    min = minsta;
    max = största;
    sättVärde(startvärde);
  }

  public void sättVärde(int nyttVärde) {
    if (nyttVärde < min || nyttVärde > max)
      throw new IllegalArgumentException("Felaktigt värde i räknare");
    else
      värde = nyttVärde;
  }  

  public int avläsVärde() {
    return värde;
  }    

  public void öka() {
    sättVärde(värde+1);
  }

  public void minska() { 
    sättVärde(värde-1);
  }
}

