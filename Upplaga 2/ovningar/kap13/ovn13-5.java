// Filen BilTest4.java

class BilTest4 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Renault Megane";
    b1.årsmodell = 2013;
    b1.tjänstevikt = 1460;
    b1.effekt = 81.0;
    b1.ägare = new Person();
    b1.ägare.förnamn = "Mikael"; 
    b1.ägare.efternamn = "Andersson"; 
    b2.regNr = "LYX999";
    b2.fabrikat = "Tesla Model S";
    b2.årsmodell = 2019;
    b2.tjänstevikt = 2215;
    b2.effekt = 285.0;
    b2.ägare = new Person();
    b2.ägare.förnamn = "Lisa"; 
    b2.ägare.efternamn = "Olsson"; 
    System.out.println(b1.regNr + "\n" + b1.fabrikat + 
                       " " + b1.årsmodell + 
                       "\ntjänstevikt: " + b1.tjänstevikt + 
                       "\nmotoreffekt: " + b1.effekt +
                       "\nägare: " + b1.ägare.förnamn + " " + b1.ägare.efternamn);
    System.out.println(b2.regNr + "\n" + b2.fabrikat + 
                       " " + b2.årsmodell + 
                       "\ntjänstevikt: " + b2.tjänstevikt + 
                       "\nmotoreffekt: " + b2.effekt +
                       "\nägare: " + b2.ägare.förnamn + " " + b2.ägare.efternamn);
  }
}

// Filen Person.java
class Person {
  String förnamn;
  String efternamn;
  int föddÅr;
  boolean singel = true;    // initiering
}


// Filen Bil.java
class Bil {
  String regNr;
  String fabrikat;
  int årsmodell;
  double tjänstevikt;
  double effekt;
  Person ägare;
}

