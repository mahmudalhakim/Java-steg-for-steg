// Rekommenderat filnamn: NfakTest.java
import java.util.*;

class siffTest {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Ett heltal? ");
    int i = scan.nextInt();
    int k = MinMath.antalSiffror(i);
    System.out.println("Antal: " + k);
   }
}

// Du kan lägga till följande i klassen MinMath
class MinMath {

  static int antalSiffror(int tal) {
    int i = 0;
    while (tal > 0) {
      tal = tal / 10;
      i++;
    }
    return i;
 }

 // Andra metoder
 // ...
           
}






