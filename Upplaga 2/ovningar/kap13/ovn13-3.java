// Rekommenderat filnamn: BilTest3.java

class BilTest3 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Renault Megane";
    b1.�rsmodell = 2013;
    b1.tj�nstevikt = 1460;
    b1.effekt = 81.0;
    b2.regNr = "LYX999";
    b2.fabrikat = "Tesla Model S";
    b2.�rsmodell = 2019;
    b2.tj�nstevikt = 2215;
    b2.effekt = 285.0;
    System.out.println(b1.regNr + "\n" + b1.fabrikat + 
                       " " + b1.�rsmodell + 
                       "\ntj�nstevikt: " + b1.tj�nstevikt + 
                       "\nmotoreffekt: " + b1.effekt);
    System.out.println(b2.regNr + "\n" + b2.fabrikat + 
                       " " + b2.�rsmodell + 
                       "\ntj�nstevikt: " + b2.tj�nstevikt + 
                       "\nmotoreffekt: " + b2.effekt);
  }
}
