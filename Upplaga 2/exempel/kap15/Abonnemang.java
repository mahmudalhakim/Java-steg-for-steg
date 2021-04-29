class Abonnemang {
  int pris;      // per månad
  int GB;        // antal GB som ingår
  String namn;
  
  void init(int p, int g, String n) {
    pris = p;
    GB = g;
    namn = n;
  }
   
  @Override
  public String toString() {
    return namn + ", " + pris + " kr/mån, " + GB + " GB";
  }
}