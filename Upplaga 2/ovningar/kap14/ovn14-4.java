// Rekommenderat filnamn: Namn.java

class Namn {
  String f�rnamn;
  String efternamn;

  // instansmetoder
  void s�tt(String f�r, String efter) {
    f�rnamn = f�r;
    efternamn = efter;
  }

  void s�tt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    f�rnamn = s.substring(k+1).trim();
  }

  
  // Ny metod 
  void s�tt(String s, char avgr�nsare) {
    int k = s.indexOf(avgr�nsare);
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    f�rnamn = s.substring(k+1).trim();
  }
}

