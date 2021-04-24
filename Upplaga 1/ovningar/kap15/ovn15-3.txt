// Filen Namn.java

public class Namn {
  String förnamn;
  String efternamn;

  // instansmetoder
  public void sätt(String för, String efter) {
    förnamn = för;
    efternamn = efter;
  }

  public void sätt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    förnamn = s.substring(k+1).trim();
  }

  
  // Ny metod 
  public void sätt(String s, char avgränsare) {
    int k = s.indexOf(avgränsare);
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    förnamn = s.substring(k+1).trim();
  }
}

