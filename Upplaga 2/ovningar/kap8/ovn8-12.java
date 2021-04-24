// Rekommenderat filnamn: StringTest.java

// Metoden kan testas med f�ljande klass:
import java.util.*;

class StringTest {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv en text? " );
    String t = scan.nextLine();
    int i = StringMetoder.s�kF�rstaIckeBland(t, "0123456789", 0);
    System.out.println("F�rsta tecken som inte �r siffra p� plats nr " + i);
  }
}

// L�gg metoden i klassen StringMetoder:

class StringMetoder {

  static int s�kF�rstaIckeBland (String s, String tecken, int start) {
    for (int i=start; i<s.length(); i++) 
      if (tecken.indexOf(s.charAt(i)) == -1)
        return i;
    return -1;
  }

  // Andra metoder
  // ...

}


