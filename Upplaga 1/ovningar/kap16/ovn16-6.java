// Filen Person.java

import java.util.*;   // inneh�ller klassen Calendar 

public class Person {
  // instansvariabler
  private String f�rnamn;
  private String efternamn;
  private int f�dd�r;
  public  Person partner;

  // konstruktor
  public Person(String f�rnamn, String efternamn, int f�dd�r) {
    s�ttF�rnamn(f�rnamn);
    s�ttEfternamn(efternamn);
    s�ttF�dd�r(f�dd�r);
  }

  // instansmetoder
  public void s�ttF�rnamn(String f�rnamn) {
    if (f�rnamn != null)
      this.f�rnamn = f�rnamn;
    else
      throw new NullPointerException();
  }

  public void s�ttEfternamn(String efternamn) {
    if (efternamn != null)
      this.efternamn = efternamn;
    else
      throw new NullPointerException();
  }

  public void s�ttF�dd�r(int f�dd�r) {
    if (f�dd�r > 1880 && 
        f�dd�r <= Calendar.getInstance().get(Calendar.YEAR))
      this.f�dd�r = f�dd�r;
    else
      throw new IllegalArgumentException("Felaktigt �r");
  }

  public String avl�sF�rnamn() {
    return f�rnamn;
  }

  public String avl�sEfternamn() {
    return efternamn;
  }

  public int avl�sF�dd�r() {
    return f�dd�r;
  }

  public String toString() {
    return f�rnamn + " " + efternamn;
  }

}
