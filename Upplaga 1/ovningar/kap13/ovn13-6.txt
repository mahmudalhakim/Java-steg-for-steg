// Filen Bil.java
import java.io.*;
public class Bil implements Serializable {
  static double skattPerKg = 1.3;
  String regNr;
  String fabrikat;
  int årsmodell;
  double tjänstevikt;
  double effekt;
  Person ägare;
}


// Filen Person.java
import java.io.*;
public class Person implements Serializable {
  String förnamn;
  String efternamn;
  int föddÅr;
  boolean singel = true;    // initiering
}

// Filen BilTest6_1.java
import javax.swing.*;
import java.io.*;

public class BilTest6_1 {
  public static void main(String[] arg) throws IOException {
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

    ObjectOutputStream utström = new ObjectOutputStream
                 (new FileOutputStream("bilfil.data"));
    utström.writeObject(b1);
    utström.writeObject(b2);
    utström.close();
  }
}


// Filen BilTest6_2.java
import javax.swing.*;
import java.io.*;

public class BilTest6_2 {
  public static void main(String[] arg) throws Exception {
   ObjectInputStream inström = new ObjectInputStream
                  (new FileInputStream("bilfil.data"));
    Bil b;
    while (true) {
      try {
        b = (Bil) inström.readObject();
      }
      catch (EOFException e) {
        break;
      }
     JOptionPane.showMessageDialog(null, b.regNr + "\n" + b.fabrikat + 
                                        " " + b.årsmodell + 
                                        "\ntjänstevikt: " + b.tjänstevikt + 
                                        "\nmotoreffekt: " + b.effekt +
                                        "\nägare: " + b.ägare.förnamn + " " + b.ägare.efternamn +
                                        "\nskatt: " + b.tjänstevikt*Bil.skattPerKg);
    }

  }
}

