// Filen Person.java

public class Person implements Comparable<Person> {
  Namn namnet;
  int föddÅr;
  Person partner;
  
  public int compareTo(Person p) {
    return namnet.compareTo(p.namnet);
  }
}

// Filen Namn.java
import java.text.*;   // Innehåller Collator
public class Namn implements Comparable<Namn> {
  String förnamn;
  String efternamn;
  static Collator col = Collator.getInstance();
  
  public int compareTo(Namn annatNamn) {
    col.setStrength(Collator.PRIMARY);
    int i = col.compare(efternamn, annatNamn.efternamn);
    if (i != 0)
      return i;
    else
      return col.compare(förnamn, annatNamn.förnamn);
  }
  
  @Override
  public String toString() {
    return förnamn + " " + efternamn;
  }
  
    // instansmetoder
  public void sätt(String för, String efter) {
    förnamn = för;
    efternamn = efter;
  }
  
  public void sätt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    förnamn = s.substring(k+1).trim();
  }
}