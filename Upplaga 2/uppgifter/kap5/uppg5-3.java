// Rekommenderat filnamn: Rik.java

class Rik {
  public static void main (String[] arg) {
    int antalDagar = 1;
    double dagensLön = 0.01;
    double totaltBelopp = 0.01; 
    while (totaltBelopp < 10000000) {
      antalDagar++;
      dagensLön = dagensLön * 2;
      totaltBelopp = totaltBelopp + dagensLön;
    }      
    System.out.println("Du måste arbeta " + antalDagar + " dagar");
  }
}
