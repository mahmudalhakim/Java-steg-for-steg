// Filen BilTest4.java

class BilTest4 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Renault Megane";
    b1.�rsmodell = 2013;
    b1.tj�nstevikt = 1460;
    b1.effekt = 81.0;
    b1.�gare = new Person();
    b1.�gare.f�rnamn = "Mikael"; 
    b1.�gare.efternamn = "Andersson"; 
    b2.regNr = "LYX999";
    b2.fabrikat = "Tesla Model S";
    b2.�rsmodell = 2019;
    b2.tj�nstevikt = 2215;
    b2.effekt = 285.0;
    b2.�gare = new Person();
    b2.�gare.f�rnamn = "Lisa"; 
    b2.�gare.efternamn = "Olsson"; 
    System.out.println(b1.regNr + "\n" + b1.fabrikat + 
                       " " + b1.�rsmodell + 
                       "\ntj�nstevikt: " + b1.tj�nstevikt + 
                       "\nmotoreffekt: " + b1.effekt +
                       "\n�gare: " + b1.�gare.f�rnamn + " " + b1.�gare.efternamn);
    System.out.println(b2.regNr + "\n" + b2.fabrikat + 
                       " " + b2.�rsmodell + 
                       "\ntj�nstevikt: " + b2.tj�nstevikt + 
                       "\nmotoreffekt: " + b2.effekt +
                       "\n�gare: " + b2.�gare.f�rnamn + " " + b2.�gare.efternamn);
  }
}

// Filen Person.java
class Person {
  String f�rnamn;
  String efternamn;
  int f�dd�r;
  boolean singel = true;    // initiering
}


// Filen Bil.java
class Bil {
  String regNr;
  String fabrikat;
  int �rsmodell;
  double tj�nstevikt;
  double effekt;
  Person �gare;
}

