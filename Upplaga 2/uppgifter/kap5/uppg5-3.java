// Rekommenderat filnamn: Rik.java

class Rik {
  public static void main (String[] arg) {
    int antalDagar = 1;
    double dagensL�n = 0.01;
    double totaltBelopp = 0.01; 
    while (totaltBelopp < 10000000) {
      antalDagar++;
      dagensL�n = dagensL�n * 2;
      totaltBelopp = totaltBelopp + dagensL�n;
    }      
    System.out.println("Du m�ste arbeta " + antalDagar + " dagar");
  }
}
