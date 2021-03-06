
// Filen BilTest5.java
import javax.swing.*;

class BilTest5 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Citroen XSara Picasso";
    b1.?rsmodell = 2010;
    b1.tj?nstevikt = 1360;
    b1.effekt = 115;
    b1.?gare = new Person();
    b1.?gare.f?rnamn = "Lisa"; 
    b1.?gare.efternamn = "Andersson"; 
    b2.regNr = "XYZ001";
    b2.fabrikat = "Renault Espace";
    b2.?rsmodell = 2009;
    b2.tj?nstevikt = 1760;
    b2.effekt = 120;
    b2.?gare = new Person();
    b2.?gare.f?rnamn = "Mikael"; 
    b2.?gare.efternamn = "Olsson"; 
    
    System.out.println(b1.regNr + "\n" + b1.fabrikat + 
                       " " + b1.?rsmodell + 
                       "\ntj?nstevikt: " + b1.tj?nstevikt + 
                       "\nmotoreffekt: " + b1.effekt +
                       "\n?gare: " + b1.?gare.f?rnamn + " " + b1.?gare.efternamn +
                       "\nskatt: " + b1.tj?nstevikt*Bil.skattPerKg);
    System.out.println(b2.regNr + "\n" + b2.fabrikat + 
                       " " + b2.?rsmodell + 
                       "\ntj?nstevikt: " + b2.tj?nstevikt + 
                       "\nmotoreffekt: " + b2.effekt +
                       "\n?gare: " + b2.?gare.f?rnamn + " " + b2.?gare.efternamn +
                       "\nskatt: " + b2.tj?nstevikt*Bil.skattPerKg);

  }
}

// Filen Person.java
class Person {
  String f?rnamn;
  String efternamn;
  int f?dd?r;
  boolean singel = true;    // initiering
}


// Filen Bil.java
class Bil {
  static double skattPerKg = 1.3;
  String regNr;
  String fabrikat;
  int ?rsmodell;
  double tj?nstevikt;
  double effekt;
  Person ?gare;
}

