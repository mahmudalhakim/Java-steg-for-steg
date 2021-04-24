// Rekommenderat filnamn: PalTest.java

// Metoden kan testas med f�ljande klass:
import java.util.*;

class PalTest {
  public static void main (String[] arg) {
      var scan = new Scanner(System.in);
    System.out.print("Skriv en text? " );
    String s = scan.nextLine();
    if (StringMetoder.�rPalindrom(s))
       System.out.println("Palindrom");
    else
       System.out.println("Inte palindrom");
  }
}


// Metoden l�ggs i klassen StringMetoder:
class StringMetoder {

  static boolean �rPalindrom(String s) {
    return s.equals(bakl�nges(s));
  } 
  
  static String bakl�nges(String s) {
    String r = "";
    for (int i=s.length()-1; i>=0; i--)
      r = r + s.charAt(i);
    return r;
  }

  // Andra metoder
  // ... 

}




