// Filen Person.java

public class Person implements Comparable<Person> {
  Namn namnet;
  int f�dd�r;
  Person partner;
  
  public int compareTo(Person p) {
    return namnet.compareTo(p.namnet);
  }
}

// Filen Namn.java
import java.text.*;   // Inneh�ller Collator
public class Namn implements Comparable<Namn> {
  String f�rnamn;
  String efternamn;
  static Collator col = Collator.getInstance();
  
  public int compareTo(Namn annatNamn) {
    col.setStrength(Collator.PRIMARY);
    int i = col.compare(efternamn, annatNamn.efternamn);
    if (i != 0)
      return i;
    else
      return col.compare(f�rnamn, annatNamn.f�rnamn);
  }
  
  @Override
  public String toString() {
    return f�rnamn + " " + efternamn;
  }
  
    // instansmetoder
  public void s�tt(String f�r, String efter) {
    f�rnamn = f�r;
    efternamn = efter;
  }
  
  public void s�tt(String s) {
    int k = s.indexOf(',');
    if (k < 0)
      throw new IllegalArgumentException("Fel i namn");
    efternamn = s.substring(0, k).trim();
    f�rnamn = s.substring(k+1).trim();
  }
}