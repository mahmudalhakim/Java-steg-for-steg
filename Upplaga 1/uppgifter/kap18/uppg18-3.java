// Filen Person.java

import java.util.*;   // inneh�ller klassen Calendar

public class Person {
  // instansvariabler
  private String f�rnamn;
  private String efternamn;
  private int f�dd�r;
  public  Person partner;
  private List<Person> barnLista = new LinkedList<>();

  // Nya metoder:
  public void nyttBarn(Person b) {
    barnLista.add(b);
  }

  public int avl�sAntalBarn() {
    return barnLista.size();
  }

  public void skrivUtBarn() {
    for(Person b : barnLista) 
      System.out.println(b);   // toString anropas automatiskt
  }

  // konstruktor
  public Person(String f, String e, int �) {
    s�ttF�rnamn(f);
    s�ttEfternamn(e);
    s�ttF�dd�r(�);
  }

  // instansmetoder
  public void s�ttF�rnamn(String fn) {
    if (fn != null)
      f�rnamn = fn;
    else
      throw new NullPointerException();
  }

  public void s�ttEfternamn(String en) {
    if (en != null)
      efternamn = en;
    else
      throw new NullPointerException();
  }

  public void s�ttF�dd�r(int �r) {
    if (�r > 1880 && 
        �r <= Calendar.getInstance().get(Calendar.YEAR))
      f�dd�r = �r;
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

