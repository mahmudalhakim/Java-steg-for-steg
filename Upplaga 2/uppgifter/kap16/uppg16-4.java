// Rekommenderat filnamn: Raknare.java

// Instansvariablerna har gjorts privata.
// Metoden init har ersatts av en konstruktor, vilken också får startvärdet som parameter.
// Metoderna sättVärde och avläsVärde har lagts till.
// Kontroll av det nya värdet sker i sättVärde. 
// sättVärde anropas från konstruktorn samt från metoderna öka och minska.

class Raknare {
  private int värde, min, max;

  Raknare(int minsta, int största, int startvärde) {
    min = minsta;
    max = största;
    sättVärde(startvärde);
  }

  void sättVärde(int nyttVärde) {
    if (nyttVärde < min || nyttVärde > max)
      throw new IllegalArgumentException("Felaktigt värde i räknare");
    else
      värde = nyttVärde;
  }  

  int avläsVärde() {
    return värde;
  }    

  void öka() {
    sättVärde(värde+1);
  }

  void minska() { 
    sättVärde(värde-1);
  }
}

