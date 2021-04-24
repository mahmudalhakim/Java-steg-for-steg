// Rekommenderat filnamn: Kommentarer.java
import java.io.*;

class Kommentarer {
 public static void main(String[] arg) throws IOException {
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    System.out.print("Vad heter filen med Javaprogrammet? ");
    String filnamn = input.readLine();
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(filnamn));
    int n = 0,    // totala antalet rader i filen
        k = 0;    // antalet rader med kommentarer
    while (true) {
      String rad = instr�m.readLine();
      if (rad == null)  // �r filen slut?
        break;   // ja!
      n++;   // nej
      if (rad.indexOf("//") >= 0)
        k++;   // kommentar finns p� raden
    }
    System.out.println(100.0*k/n + " % av raderna inneh�ller kommentarer");
  }       
}
