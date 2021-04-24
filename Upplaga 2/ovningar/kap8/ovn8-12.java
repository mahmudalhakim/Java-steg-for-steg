// Rekommenderat filnamn: StringTest.java

// Metoden kan testas med följande klass:
import java.util.*;

class StringTest {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Skriv en text? " );
    String t = scan.nextLine();
    int i = StringMetoder.sökFörstaIckeBland(t, "0123456789", 0);
    System.out.println("Första tecken som inte är siffra på plats nr " + i);
  }
}

// Lägg metoden i klassen StringMetoder:

class StringMetoder {

  static int sökFörstaIckeBland (String s, String tecken, int start) {
    for (int i=start; i<s.length(); i++) 
      if (tecken.indexOf(s.charAt(i)) == -1)
        return i;
    return -1;
  }

  // Andra metoder
  // ...

}


