// Rekommenderat filnamn: Person.java
import java.text.*;

class Person {
  String f�rnamn;
  String efternamn;
  int f�dd�r;
  Person partner;
  
  public int compareTo(Person annan) {
    Collator col = Collator.getInstance();
    col.setStrength(Collator.PRIMARY);
    int test = col.compare(efternamn, annan.efternamn);
    if (test != 0)
      return test;
    else
      return col.compare(f�rnamn, annan.f�rnamn);       
  }
}