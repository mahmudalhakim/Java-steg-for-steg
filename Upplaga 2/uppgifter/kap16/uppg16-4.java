// Rekommenderat filnamn: Raknare.java

// Instansvariablerna har gjorts privata.
// Metoden init har ersatts av en konstruktor, vilken ocks� f�r startv�rdet som parameter.
// Metoderna s�ttV�rde och avl�sV�rde har lagts till.
// Kontroll av det nya v�rdet sker i s�ttV�rde. 
// s�ttV�rde anropas fr�n konstruktorn samt fr�n metoderna �ka och minska.

class Raknare {
  private int v�rde, min, max;

  Raknare(int minsta, int st�rsta, int startv�rde) {
    min = minsta;
    max = st�rsta;
    s�ttV�rde(startv�rde);
  }

  void s�ttV�rde(int nyttV�rde) {
    if (nyttV�rde < min || nyttV�rde > max)
      throw new IllegalArgumentException("Felaktigt v�rde i r�knare");
    else
      v�rde = nyttV�rde;
  }  

  int avl�sV�rde() {
    return v�rde;
  }    

  void �ka() {
    s�ttV�rde(v�rde+1);
  }

  void minska() { 
    s�ttV�rde(v�rde-1);
  }
}

