// Rekommenderat filnamn: BilTest3.java

class BilTest3 {
  public static void main(String[] arg) {
    // L�gg till f�ljande kod
    Bil[] a = new Bil[3];
    for (int i=0; i<a.length; i++)
      a[i] = new Bil();
    a[0].regNr = "ZZZ999";
    a[0].fabrikat = "Ford";
    a[0].�rsmodell = 2011;
    a[0].tj�nstevikt = 1400;
    a[0].effekt = 109;
    a[1].regNr = "PKA792";
    a[1].fabrikat = "Volvo";
    a[1].�rsmodell = 2008;
    a[1].tj�nstevikt = 1600;
    a[1].effekt = 100;
    a[2].regNr = "JAV002";
    a[2].fabrikat = "BMW";
    a[2].�rsmodell = 2012;
    a[2].tj�nstevikt = 1400;
    a[2].effekt = 120;
    for (int i=0; i<a.length; i++) 
      System.out.println(a[i].regNr + "\n" + a[i].fabrikat + 
                         " " + a[i].�rsmodell + 
                         "\ntj�nstevikt: " + a[i].tj�nstevikt + 
                         "\nmotoreffekt: " + a[i].effekt);
  }
}

class Bil {
  String regNr;
  String fabrikat;
  int �rsmodell;
  double tj�nstevikt;
  double effekt;
}
