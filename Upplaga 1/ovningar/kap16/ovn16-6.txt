// Filen Person.java

import java.util.*;   // innehåller klassen Calendar 

public class Person {
  // instansvariabler
  private String förnamn;
  private String efternamn;
  private int föddÅr;
  public  Person partner;

  // konstruktor
  public Person(String förnamn, String efternamn, int föddÅr) {
    sättFörnamn(förnamn);
    sättEfternamn(efternamn);
    sättFöddÅr(föddÅr);
  }

  // instansmetoder
  public void sättFörnamn(String förnamn) {
    if (förnamn != null)
      this.förnamn = förnamn;
    else
      throw new NullPointerException();
  }

  public void sättEfternamn(String efternamn) {
    if (efternamn != null)
      this.efternamn = efternamn;
    else
      throw new NullPointerException();
  }

  public void sättFöddÅr(int föddÅr) {
    if (föddÅr > 1880 && 
        föddÅr <= Calendar.getInstance().get(Calendar.YEAR))
      this.föddÅr = föddÅr;
    else
      throw new IllegalArgumentException("Felaktigt år");
  }

  public String avläsFörnamn() {
    return förnamn;
  }

  public String avläsEfternamn() {
    return efternamn;
  }

  public int avläsFöddÅr() {
    return föddÅr;
  }

  public String toString() {
    return förnamn + " " + efternamn;
  }

}
