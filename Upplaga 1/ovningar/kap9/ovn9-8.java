// Filen Textanalys.java

import java.io.*;

public class Textanalys {
  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                       (new InputStreamReader(System.in));
    int radant  = 0;   // r�knare f�r antal rader
    int teckant = 0;   // r�knare f�r antal tecken
    while (true) {
      String rad = input.readLine();
      if (rad == null)
        break; 
      radant++;
      teckant = teckant + rad.length();      
    }
    System.out.println("Genomsnittlig radl�ngd: " + (double) teckant / radant); 
  }
}
