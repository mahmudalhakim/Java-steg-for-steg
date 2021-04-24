// Filen Person.java
public class Person {
  String förnamn;
  String efternamn;
  int föddÅr;
  boolean singel = true;    // initiering
}


// Filen Bil.java
public class Bil {
  String regNr;
  String fabrikat;
  int årsmodell;
  double tjänstevikt;
  double effekt;
  Person ägare;
}


// Filen BilTest4.java
import javax.swing.*;

public class BilTest4 {
  public static void main(String[] arg) {
    Bil b1 = new Bil();
    Bil b2 = new Bil();
    b1.regNr = "ABC123";
    b1.fabrikat = "Citroen XSara Picasso";
    b1.årsmodell = 2010;
    b1.tjänstevikt = 1360;
    b1.effekt = 115;
    b1.ägare = new Person();
    b1.ägare.förnamn = "Lisa"; 
    b1.ägare.efternamn = "Andersson"; 
    b2.regNr = "XYZ001";
    b2.fabrikat = "Renault Espace";
    b2.årsmodell = 2009;
    b2.tjänstevikt = 1760;
    b2.effekt = 120;
    b2.ägare = new Person();
    b2.ägare.förnamn = "Mikael"; 
    b2.ägare.efternamn = "Olsson"; 

    JOptionPane.showMessageDialog(null, b1.regNr + "\n" + b1.fabrikat + 
                                        " " + b1.årsmodell + 
                                        "\ntjänstevikt: " + b1.tjänstevikt + 
                                        "\nmotoreffekt: " + b1.effekt +
                                        "\nägare: " + b1.ägare.förnamn + " " + b1.ägare.efternamn);
    JOptionPane.showMessageDialog(null, b2.regNr + "\n" + b2.fabrikat + 
                                        " " + b2.årsmodell + 
                                        "\ntjänstevikt: " + b2.tjänstevikt + 
                                        "\nmotoreffekt: " + b2.effekt+
                                        "\nägare: " + b2.ägare.förnamn + " " + b2.ägare.efternamn);

  }
}

