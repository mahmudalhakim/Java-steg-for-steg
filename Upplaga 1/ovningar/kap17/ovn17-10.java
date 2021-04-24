// Filen Namnsortering.java
import java.util.*;
import java.io.*;

public class Namnsortering {
  public static void main(String[] arg) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("personer.txt"));
	Namn[] personer = new Namn[100];
	int antal = 0;
	while (sc.hasNext()) {
	  Namn n = new Namn();
	  n.s�tt(sc.nextLine());
	  personer[antal++] = n;
	}
	Arrays.sort(personer, 0, antal);
	for (int i=0; i<antal; i++)
	  System.out.println(personer[i]);
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

      	  
	