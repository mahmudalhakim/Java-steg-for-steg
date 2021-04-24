// Rekommenderat filnamn: PalTest.java

// Metoden kan testas med följande klass:
import java.util.*;

class PalTest {
  public static void main (String[] arg) {
      var scan = new Scanner(System.in);
    System.out.print("Skriv en text? " );
    String s = scan.nextLine();
    if (StringMetoder.ärPalindrom(s))
       System.out.println("Palindrom");
    else
       System.out.println("Inte palindrom");
  }
}


// Metoden läggs i klassen StringMetoder:
class StringMetoder {

  static boolean ärPalindrom(String s) {
    return s.equals(baklänges(s));
  } 
  
  static String baklänges(String s) {
    String r = "";
    for (int i=s.length()-1; i>=0; i--)
      r = r + s.charAt(i);
    return r;
  }

  // Andra metoder
  // ... 

}




