class Abonnemang {
  int pris;      // per m�nad
  int GB;        // antal GB som ing�r
  String namn;
  
  void init(int p, int g, String n) {
    pris = p;
    GB = g;
    namn = n;
  }
   
  @Override
  public String toString() {
    return namn + ", " + pris + " kr/m�n, " + GB + " GB";
  }
}