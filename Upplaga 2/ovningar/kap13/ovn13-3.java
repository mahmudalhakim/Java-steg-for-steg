// Rekommenderat filnamn: BilTest3.java

class BilTest3 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Renault Megane";
    b1.årsmodell = 2013;
    b1.tjänstevikt = 1460;
    b1.effekt = 81.0;
    b2.regNr = "LYX999";
    b2.fabrikat = "Tesla Model S";
    b2.årsmodell = 2019;
    b2.tjänstevikt = 2215;
    b2.effekt = 285.0;
    System.out.println(b1.regNr + "\n" + b1.fabrikat + 
                       " " + b1.årsmodell + 
                       "\ntjänstevikt: " + b1.tjänstevikt + 
                       "\nmotoreffekt: " + b1.effekt);
    System.out.println(b2.regNr + "\n" + b2.fabrikat + 
                       " " + b2.årsmodell + 
                       "\ntjänstevikt: " + b2.tjänstevikt + 
                       "\nmotoreffekt: " + b2.effekt);
  }
}
