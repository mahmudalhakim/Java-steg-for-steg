// Filen Person.java

import java.util.*;   // innehåller klassen Calendar

public class Person {
  // instansvariabler
  private String förnamn;
  private String efternamn;
  private int föddÅr;
  public  Person partner;
  private List<Person> barnLista = new LinkedList<>();

  // Nya metoder:
  public void nyttBarn(Person b) {
    barnLista.add(b);
  }

  public int avläsAntalBarn() {
    return barnLista.size();
  }

  public void skrivUtBarn() {
    for(Person b : barnLista) 
      System.out.println(b);   // toString anropas automatiskt
  }

  // konstruktor
  public Person(String f, String e, int å) {
    sättFörnamn(f);
    sättEfternamn(e);
    sättFöddÅr(å);
  }

  // instansmetoder
  public void sättFörnamn(String fn) {
    if (fn != null)
      förnamn = fn;
    else
      throw new NullPointerException();
  }

  public void sättEfternamn(String en) {
    if (en != null)
      efternamn = en;
    else
      throw new NullPointerException();
  }

  public void sättFöddÅr(int år) {
    if (år > 1880 && 
        år <= Calendar.getInstance().get(Calendar.YEAR))
      föddÅr = år;
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

