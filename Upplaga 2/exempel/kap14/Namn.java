class Namn {
  String förnamn;
  String efternamn;
  // instansmetoder
  void sätt(String för, String efter) {
    förnamn = för;
    efternamn = efter;
  }
  void sätt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    förnamn = s.substring(k+1).trim();
  }
}