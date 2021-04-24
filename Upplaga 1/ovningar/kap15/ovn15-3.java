// Filen Namn.java

public class Namn {
  String f�rnamn;
  String efternamn;

  // instansmetoder
  public void s�tt(String f�r, String efter) {
    f�rnamn = f�r;
    efternamn = efter;
  }

  public void s�tt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    f�rnamn = s.substring(k+1).trim();
  }

  
  // Ny metod 
  public void s�tt(String s, char avgr�nsare) {
    int k = s.indexOf(avgr�nsare);
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    f�rnamn = s.substring(k+1).trim();
  }
}

