// Rekommenderat filnamn: Person.java
import java.text.*;

class Person {
  String förnamn;
  String efternamn;
  int föddÅr;
  Person partner;
  
  public int compareTo(Person annan) {
    Collator col = Collator.getInstance();
    col.setStrength(Collator.PRIMARY);
    int test = col.compare(efternamn, annan.efternamn);
    if (test != 0)
      return test;
    else
      return col.compare(förnamn, annan.förnamn);       
  }
}